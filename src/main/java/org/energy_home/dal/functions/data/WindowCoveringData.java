package org.energy_home.dal.functions.data;

import java.util.Map;

import org.osgi.service.dal.FunctionData;

public class WindowCoveringData extends FunctionData {

	private Short status;

	public WindowCoveringData(long timestamp, Map metadata) {
		super(timestamp, metadata);
	}

	public WindowCoveringData(long timestamp, Map metadata, Short status) {
		super(timestamp, metadata);
		this.status = status;
	}

	public Short getStatus() {
		return this.status;
	}

	public int compareTo(Object o) {
		return 0;
	}

}
