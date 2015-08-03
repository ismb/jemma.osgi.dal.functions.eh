package org.energy_home.dal.functions;

import org.osgi.service.dal.DeviceException;
import org.osgi.service.dal.Function;

public interface ColorControl extends Function {

	public static final String PROPERTY_HS = "HS";

	// /public void setColor(Short red, Short green,Short blue) throws
	// DeviceException;
	public void setHS(Short hue, Short saturation) throws DeviceException;

	public Short[] getHS() throws DeviceException;

}
