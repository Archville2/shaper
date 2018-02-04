package by.kurlovich.cone.warehouse;

import java.util.HashMap;
import java.util.Map;

import by.kurlovich.cone.entity.ConeCalculationsResult;

public class ConeWarehouse {
	private final static ConeWarehouse INSTANCE = new ConeWarehouse();
	private Map<Integer, ConeCalculationsResult> parameterMap = new HashMap<>();

	private ConeWarehouse() {
	}

	public static ConeWarehouse getInstance() {
		return INSTANCE;
	}

	public void addResultObject(int coneID, ConeCalculationsResult result) {
		parameterMap.put(coneID, result);
	}

	public void setHeight(int coneID, double height) {
		ConeCalculationsResult result = parameterMap.get(coneID);
		result.setHeight(height);
	}

	public void setVolume(int coneID, double volume) {
		ConeCalculationsResult result = parameterMap.get(coneID);
		result.setHeight(volume);
	}

	public void setSpace(int coneID, double space) {
		ConeCalculationsResult result = parameterMap.get(coneID);
		result.setHeight(space);
	}

}
