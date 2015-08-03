package org.energy_home.dal.functions.data;

import java.util.Map;

import org.energy_home.dal.functions.type.TimeAttribute;
import org.osgi.service.dal.FunctionData;

public class TimeData extends FunctionData {

	private TimeAttribute timeAttribute;

	public TimeData(long timestamp, Map metadata) {
		super(timestamp, metadata);
	}

	public TimeData(long timestamp, Map metadata, TimeAttribute value) {
		super(timestamp, metadata);
		this.timeAttribute = value;
	}

	public TimeAttribute getTimeAttribute() {
		return timeAttribute;
	}

	public int compareTo(Object o) {

		return 0;
	}

}
