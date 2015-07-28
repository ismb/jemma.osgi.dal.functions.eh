package org.energy_home.dal.functions;

import org.osgi.service.dal.DeviceException;
import org.osgi.service.dal.Function;
import org.osgi.service.dal.functions.data.BooleanData;
import org.osgi.service.dal.functions.data.LevelData;

public interface Fridge extends Function {

	public static String PROPERTY_FRIDGETEMPERATURE="FridgeTemperature";
	public static String PROPERTY_FREEZERTEMPERATURE="FreezerTemperature";
	
	public static String PROPERTY_SUPERCOOLMODE="SuperCoolMode";
	public static String PROPERTY_SUPERFREEZE="SuperFreezeMode";
	
	public static String PROPERTY_ECOMODE="EcoMode";
	public static String PROPERTY_HOLIDAYMODE="HolidayMode";
	public static String PROPERTY_ICEPARTY="IceParty";
	public static String PROPERTY_NORMALMODE = "NormalMode";
	
	
	public LevelData getFridgeTemperature() throws DeviceException;
	
	public LevelData getFreezerTemperature() throws DeviceException;
	
	/**
	 * SuperCool: The button with the snowflake
	 * @return
	 * @throws DeviceException
	 */
	public BooleanData getSuperCoolMode() throws DeviceException;
	public void setSuperCoolMode(Boolean data) throws DeviceException;
	
	public BooleanData getSuperFreezeMode() throws DeviceException;
	public void setSuperFreezeMode(Boolean data) throws DeviceException;
	
	/**
	 * EcoMode is "I care" with hand button
	 * @return
	 * @throws DeviceException
	 */
	public BooleanData getEcoMode() throws DeviceException;
	public void setEcoMode(Boolean data) throws DeviceException;
	
	public BooleanData getIceParty() throws DeviceException;
	public void setIceParty(Boolean data) throws DeviceException;
	
	public BooleanData getHolidayMode() throws DeviceException;
	public void setHolidayMode(Boolean data) throws DeviceException;
	
	
}
