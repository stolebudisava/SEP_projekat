package com.boot.stubs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.model.insurance.HomeInsurance;
import com.boot.model.insurance.Insurance;
import com.boot.model.insurance.TravelInsurance;



public class InsuranceStub {
	private static Map<Long, Insurance> insurances = new HashMap<Long, Insurance>();
	private static Long idIndex = 3L;

	//populate initial insurances
	static {
		Insurance a = new TravelInsurance();
		insurances.put(1L, a);
		Insurance b = new HomeInsurance();
		insurances.put(2L, b);
	}

	public static List<Insurance> list() {
		return new ArrayList<Insurance>(insurances.values());
	}

	public static Insurance create(Insurance insurance) {
		idIndex += idIndex;
		insurance.setId(idIndex);
		insurances.put(idIndex, insurance);
		return insurance;
	}

	public static Insurance get(Long id) {
		return insurances.get(id);
	}

	public static Insurance update(Long id, Insurance insurance) {
		insurances.put(id, insurance);
		return insurance;
	}

	public static Insurance delete(Long id) {
		return insurances.remove(id);
	}
}
