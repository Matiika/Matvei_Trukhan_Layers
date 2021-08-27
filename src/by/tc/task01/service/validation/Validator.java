package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	static String integerFields = " POWER_CONSUMPTION, MEMORY_ROM, SYSTEM_MEMORY, FLASH_MEMORY_CAPACITY, MOTOR_SPEED_REGULATION, CLEANING_WIDTH, NUMBER_OF_SPEAKERS";
	static String doubleFields = "WEIGHT, DEPTH, HEIGHT, WIDTH, CAPACITY, BATTERY_CAPACITY, CPU, FREEZER_CAPACITY, OVERALL_CAPACITY, DISPLAY_INCHS, DISPLAY_INCHES, CORD_LENGTH";
	static String stringFields = " NAME, OS, FREQUENCY_RANGE, COLOR, FILTER_TYPE, BAG_TYPE, WAND_TYPE";
	static String classes = "Laptop, Oven, Refrigerator, Speakers, TabletPC, VacuumCleaner";

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {

		String type = criteria.getApplianceType();
		if (classes.contains(type)) {
			if (checkFields(criteria)) {
				return true;
			} else {
				System.out.println("Проверьте критерий " + type);
				return false;
			}
		} else {
			System.out.println("Неверное имя объекта");
			return false;
		}
	}
	private static <E> boolean checkFields(Criteria<E> criteria) {
		for (E search : criteria.getCriteria().keySet()) {
			if (doubleFields.contains(search.toString())) {
				return isDouble(criteria.getValue(search));
			}
			if (stringFields.contains(search.toString())) {
				return isString(criteria.getValue(search), search);
			}
			if (integerFields.contains(search.toString())) {
				return isInteger(criteria.getValue(search));
			}
		}
		return false;
	}
	private static boolean isDouble(Object obj) {
		return obj instanceof Double || obj instanceof Integer;
	}

	private static boolean isInteger(Object obj) {
		return obj instanceof Integer;
	}

	private static <E> boolean isString(Object obj, E search) {
		if (search.toString().equals("FREQUENCY_RANGE")) {
			Pattern p = Pattern.compile("^\\d(\\.\\d+)?-\\d(\\.\\d+)?$");
			Matcher m = p.matcher(obj.toString());
			if (m.matches()) {
				return true;
			}
			else return false;
		}
		return obj instanceof String;
	}
}