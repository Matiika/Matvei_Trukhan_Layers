package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

    private Map<E, Object> criteria = new HashMap<E, Object>();
    private String applianceType;

    public void add(E searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }
    public String getApplianceType() {
        return applianceType;
    }
    public String setApplianceType(String type) {
        return this.applianceType=type;
    }
    public Object getValue(E searchCriteria) {
        return criteria.get(searchCriteria);
    }
    public Map<E,Object> getCriteria(){
        return criteria;
    }
    
	@Override
	public String toString() {
		return "Criteria [criteria=" + criteria + ", applianceType=" + applianceType + "]";
	}
    
    
}
