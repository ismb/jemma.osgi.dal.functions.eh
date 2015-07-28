package org.energy_home.dal.functions;

import org.energy_home.dal.functions.data.TimeData;
import org.osgi.service.dal.DeviceException;
import org.osgi.service.dal.Function;
import org.osgi.service.dal.functions.data.BooleanData;
import org.osgi.service.dal.functions.data.LevelData;

public interface WashingMachine extends Function {

	public static String PROPERTY_TEMPERATURE="temperature";
	public static String PROPERTY_CYCLE="cycle";
	public static String PROPERTY_SPIN="spin";
	
	public static String PROPERTY_STARTTIME="StartTime";
	public static String PROPERTY_REMAININGTIME="RemainingTime";
	public static String PROPERTY_FINISHTIME="FinishTime";
	public static String PROPERTY_REMOTECONTROL="RemoteControl";
	
	//read-write properties
	public LevelData getCycle() throws DeviceException;
	public void setCycle(Short cycle) throws DeviceException;
	
	public LevelData getTemperature() throws DeviceException;
	public void setTemperature(Integer temperature) throws DeviceException;
	
	public LevelData getSpin() throws DeviceException;
	public void setSpin(Short spin) throws DeviceException;
	
	public TimeData getStartTime() throws DeviceException;
	public void setStartTime(TimeData data) throws DeviceException;
	
	//read-only properties
	public TimeData getFinishTime() throws DeviceException;
	public TimeData getRemainingTime() throws DeviceException;
	public BooleanData getRemoteControl() throws DeviceException;
	
	//Operations
	public void execStartCycle() throws DeviceException;
	public void execStopCycle() throws DeviceException;	
	public void execPauseCycle() throws DeviceException;
	public void execOverloadPauseResume() throws DeviceException;
	public void execOverloadPause() throws DeviceException;
	public void execOverloadWarning() throws DeviceException;
}
