package org.energy_home.dal.functions;

import org.energy_home.dal.functions.data.DoorLockData;
import org.osgi.service.dal.DeviceException;
import org.osgi.service.dal.Function;

public interface DoorLock extends Function {

	final static String OPERATION_OPEN = "open";
	final static String OPERATION_CLOSE = "close";
	final static String PROPERTY_STATUS = "status";

	public void open() throws DeviceException;

	public void close() throws DeviceException;

	public DoorLockData getStatus() throws DeviceException;

}
