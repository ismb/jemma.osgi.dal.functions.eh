package org.energy_home.dal.functions.data;

import java.util.List;
import java.util.Map;

import org.energy_home.dal.functions.type.PowerProfileAttribute;
import org.energy_home.dal.functions.type.TransferredPhaseAttribute;
import org.osgi.service.dal.FunctionData;

public class PowerProfilePhasesData extends FunctionData {

	short powerProfileID, totalProfileNum;
	List<TransferredPhaseAttribute> phases;

	public PowerProfilePhasesData(long timestamp, Map metadata) {
		super(timestamp, metadata);
		// TODO Auto-generated constructor stub
	}

	public PowerProfilePhasesData(long timestamp, Map metadata, short powerProfileID, short totalProfileNum, List<TransferredPhaseAttribute> phases) {
		super(timestamp, metadata);
		this.powerProfileID = powerProfileID;
		this.totalProfileNum = totalProfileNum;
		this.phases = phases;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
