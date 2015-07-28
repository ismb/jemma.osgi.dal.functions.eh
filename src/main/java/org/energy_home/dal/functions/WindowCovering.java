package org.energy_home.dal.functions;

import org.energy_home.dal.functions.data.WindowCoveringData;
import org.osgi.service.dal.DeviceException;
import org.osgi.service.dal.Function;

public interface WindowCovering extends Function{
	
	final static String OPERATION_OPEN = "openUp";
	final static String OPERATION_CLOSE = "closeDown";
	final static String PROPERTY_STATUS="status";
	
	public void openUp() throws DeviceException;
	public void closeDown() throws DeviceException;
	public WindowCoveringData getStatus() throws DeviceException;

}
