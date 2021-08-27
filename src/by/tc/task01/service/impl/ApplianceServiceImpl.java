package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.io.IOException;

public class ApplianceServiceImpl implements ApplianceService{
	
	DAOFactory factory = DAOFactory.getInstance();
	ApplianceDAO applianceDAO = factory.getApplianceDAO();
	
	
	@Override
	public <E> void remove(Criteria<E> criteria) throws IOException {
		
		if (!Validator.criteriaValidator(criteria)) {
			System.out.println("Запрос не прошел валидацию");
		} else {

			
		applianceDAO.remove(criteria);
		}

		
	}
	

	@Override
	public <E> void find(Criteria<E> criteria) throws IOException {
		
		if (!Validator.criteriaValidator(criteria)) {
			System.out.println("Запрос не прошел валидацию");
		} else {

			
		applianceDAO.find(criteria);
		}

		
	}

	@Override
	public <E> void add(Criteria<E> criteria) throws IOException {
		// TODO Auto-generated method stub
		

		
		applianceDAO.add(criteria);
		
		
	}

}

