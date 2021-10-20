package com.mourad.main.services;

import java.util.Comparator;
import com.mourad.main.model.AC;

public class PriorityFilter implements Comparator<AC> {

	@Override
	public int compare(AC aircraft1, AC aircraft2) {
		int typeAircraft1 = aircraft1.getType();
		int sizeAircraft1 = aircraft1.getSize();
		int typeAircraft2 = aircraft2.getType();
		int sizeAircraft2 = aircraft2.getSize();
		if (!(typeAircraft1 > typeAircraft2 || sizeAircraft1 > sizeAircraft2)) {
			return 1;
		} else if (!(typeAircraft1 < typeAircraft2 || sizeAircraft1 < sizeAircraft2)) {
			return -1;
		} else {
			return 0;
		}
	}
}
