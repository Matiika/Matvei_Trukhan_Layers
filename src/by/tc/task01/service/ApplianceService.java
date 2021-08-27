package by.tc.task01.service;

import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;

public interface ApplianceService {	
	
	<E> void remove(Criteria<E> criteria) throws IOException;
	
	<E> void add(Criteria<E> criteria) throws IOException;
	
	<E> void find(Criteria<E> criteria) throws IOException;
	
}
