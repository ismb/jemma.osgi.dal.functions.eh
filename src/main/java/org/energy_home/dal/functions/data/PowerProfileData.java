package org.energy_home.dal.functions.data;

import java.util.List;
import java.util.Map;

import org.energy_home.dal.functions.type.PowerProfileAttribute;
import org.osgi.service.dal.FunctionData;

public class PowerProfileData extends FunctionData{

	List<PowerProfileAttribute> powerProfiles;
	
	public PowerProfileData(long timestamp, Map metadata) {
		super(timestamp, metadata);
		// TODO Auto-generated constructor stub
	}

	public PowerProfileData(long timestamp, Map metadata, List<PowerProfileAttribute> powerProfiles2) {
		super(timestamp, metadata);
		this.powerProfiles=powerProfiles2;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
