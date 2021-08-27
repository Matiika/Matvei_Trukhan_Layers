package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
		
		

		// Тест

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.setApplianceType("Oven");
		criteriaOven.add(Oven.CAPACITY, 33);
		service.find(criteriaOven);
		

		// Не найдет ничего
		Criteria<VacuumCleaner> cleanerCriteria = new Criteria<VacuumCleaner>();
		cleanerCriteria.setApplianceType("VacuumCleaner");
		cleanerCriteria.add(VacuumCleaner.BAG_TYPE,"ФЫВфв2");	
		service.find(cleanerCriteria);


		


		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.setApplianceType("TabletPC");
		criteriaTabletPC.add(TabletPC.COLOR, "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
		service.find(criteriaTabletPC);


		Criteria<Speakers> criteriaSpeakers = new Criteria<Speakers>();
		criteriaSpeakers.setApplianceType("Speakers");
		criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "2-4");
		criteriaSpeakers.add(Speakers.CORD_LENGTH, "2");
		service.find(criteriaSpeakers);

		
		service.add(criteriaOven);
		

		
		
	}

}
