package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.model.insurance.Insurance;

public class InsuranceStub {
	private static Map<Long, Insurance> someInsurances = new HashMap<Long, Insurance>();
	private static Long idIndex = 3L;

	//populate initial someInsurances
	static {
		Insurance a = new Insurance(1L, "Home Insurance", "Basic home insurance");
		someInsurances.put(1L, a);
		Insurance b = new Insurance(2L, "Car insurance", "Basic car insurance");
		someInsurances.put(2L, b);
		Insurance c = new Insurance(3L, "Health insurance", "Basic health insurance");
		someInsurances.put(3L, c);
	}

	public static List<Insurance> list() {
		return new ArrayList<Insurance>(someInsurances.values());
	}

	public static Insurance create(Insurance insurance) {
		idIndex += idIndex;
		insurance.setId(idIndex);
		someInsurances.put(idIndex, insurance);
		return insurance;
	}

	public static Insurance get(Long id) {
		return someInsurances.get(id);
	}

	public static Insurance update(Long id, Insurance insurance) {
		someInsurances.put(id, insurance);
		return insurance;
	}

	public static Insurance delete(Long id) {
		return someInsurances.remove(id);
	}
}
