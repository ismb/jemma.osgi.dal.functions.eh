package org.energy_home.dal.functions.data;

import java.util.Map;

import org.osgi.service.dal.FunctionData;

public class DoorLockData extends FunctionData {

	public final static String STATUS_OPEN = "OPEN";
	public final static String STATUS_CLOSED = "CLOSED";

	private String status;

	public DoorLockData(long timestamp, Map metadata) {
		super(timestamp, metadata);
	}

	public DoorLockData(long timestamp, Map metadata, String status) {
		super(timestamp, metadata);
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public int compareTo(Object o) {
		return 0;
	}

}
