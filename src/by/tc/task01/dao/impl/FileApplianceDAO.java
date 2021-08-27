package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileApplianceDAO implements ApplianceDAO {
	
	@Override
	public <E> void remove(Criteria<E> criteria) throws IOException{
		Path path = Paths.get("src/resources/appliances_db.txt");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

		boolean check = false; 
	
		
		for(int i=0; i<lines.size(); i++) {
			
			 for (E searchCriteria : criteria.getCriteria().keySet()) {					
					String s = searchCriteria.toString() + "=" + criteria.getValue(searchCriteria);
					
					if(lines.get(i).contains(s)) {
						check = true;
					}
				  }

			if (check) {
				lines.remove(i);
			}
			check = false;
				
		}
		
		Files.write(path, lines, StandardCharsets.UTF_8);
	}

	@Override
	public <E> void add(Criteria<E> criteria) throws IOException {
		Path path = Paths.get("src/resources/appliances_db.txt");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		String applianceStrAdd="";
		
		String comma = ", ";
		
		List<String> strListAdd = new ArrayList<String>();
		strListAdd.add(criteria.getApplianceType()+" : ");
		
		
		  for (E searchCriteria : criteria.getCriteria().keySet()) {					
				String s = searchCriteria.toString() + "=" + criteria.getValue(searchCriteria);
				
				strListAdd.add(s);
				strListAdd.add(comma);
			  }
		  
		  strListAdd.remove(strListAdd.size()-1);
		  strListAdd.add(";");
		  
		  
		  
		  for (String i : strListAdd) {
			  applianceStrAdd+=i;		  
		    }
		
		for(int i=0; i<lines.size()-1; i++) {
			if(lines.get(i).contains(criteria.getApplianceType())) {
				lines.add(i, applianceStrAdd);
				break;
			}
		}
		
		Files.write(path, lines, StandardCharsets.UTF_8);
		
	
	}

	@Override
	public <E> void find(Criteria<E> criteria) throws IOException {
	
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/resources/appliances_db.txt"));
			String tmp;
		
			  boolean check = false;
			  boolean flag = true;
			  
			  
			  List<String> nameAndVal;
			  while ((tmp = br.readLine()) != null) {			  
				  nameAndVal=splitTheCriterion(tmp);
				  if(tmp.contains(criteria.getApplianceType())) {
					  flag = true;
				  for (E searchCriteria : criteria.getCriteria().keySet()) {					
						String s = searchCriteria.toString() + "=" + criteria.getValue(searchCriteria);
						
						if (!tmp.contains(s)) {
							
							flag = false;
							
						}	
					  }
				  if (flag) {
					  check = true;
	    	        	System.out.println("Найдено: "+tmp);
	    	        	} 
					}
				  
				}
			  
			  if (!check) {
				  System.out.println("По вашему запросу ничего не найдено");
			  }			
		}
		catch(FileNotFoundException e) {
			System.err.println("File isn't available.");
		}
		catch (IOException e) {
			System.err.println(" I/O exception.");
		}
	}

	private List<String> splitTheCriterion(String tmp) {

		List<String> strList = new ArrayList<String>();
		Pattern criterion = Pattern.compile("\\p{Blank}[A-Z_]+=[\\w+-?]+[,;]");
		Matcher m = criterion.matcher(tmp);
		while(m.find()) {
			strList.add(tmp.substring(m.start() + 1, m.end() - 1));
		}
		return strList;
	}

	
}

