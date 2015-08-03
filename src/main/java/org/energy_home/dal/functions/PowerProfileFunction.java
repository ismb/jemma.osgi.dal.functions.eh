package org.energy_home.dal.functions;

import org.energy_home.dal.functions.data.PowerProfileConstraintsData;
import org.energy_home.dal.functions.data.PowerProfileData;
import org.energy_home.dal.functions.data.PowerProfilePhasesData;
import org.energy_home.dal.functions.type.ScheduledPhaseAttribute;
import org.osgi.service.dal.DeviceException;
import org.osgi.service.dal.Function;

public interface PowerProfileFunction extends Function {

	final static Short MODE_DISABLED = 0;
	final static Short MODE_ECNONOMIC = 1;
	final static Short MODE_ECOLOGIC = 2;

	final static String PROPERTY_TOTALPROFILENUM = "TotalProfileNum";
	final static String PROPERTY_ENERGYREMOTE = "EnergyRemote";
	final static String PROPERTY_MULTIPLESCHEDULING = "MultipleScheduling";
	final static String PROPERTY_SCHEDULEMODE = "ScheduleMode";
	static final String PROPERTY_CONSTRAINTS = "Constraints";
	static final String PROPERTY_STATE = "PowerProfileState";
	static final String PROPERTY_POWEPROFILEPHASES = "PowerProfilePhases";

	static final String OPERATION_SCHEDULEENRGYPHASES = "scheduleEnergyPhases";

	/**
	 * Gets the total number of profiles supported by the device.
	 * 
	 * @return total number of profiles supported by the device
	 * @throws DeviceException
	 */
	public Short getTotalProfileNum() throws DeviceException;

	/**
	 * Returns true if the server side of the Power Profile cluster supports the
	 * scheduling of multiple Energy Phases or it does support the scheduling of
	 * a single energy phase of the Power Profile at a time. Returns false
	 * otherwise
	 * 
	 * @return
	 * @throws DeviceException
	 */
	public Boolean getMultipleScheduling() throws DeviceException;

	// ???
	public Boolean getEnergyRemote() throws DeviceException;

	// 0=disabled 1=economic 2=ecologic Only Works when Apppliance can be
	// controlled remotely
	public Short getScheduleMode() throws DeviceException;

	// IL remote control non si disabilita! 0 non è possibile
	public void setScheduleMode(Short ScheduleMode) throws DeviceException;

	public PowerProfileConstraintsData getConstraints(Short profileId) throws DeviceException;

	public PowerProfileData getPowerProfileState() throws DeviceException;

	public PowerProfilePhasesData getPowerProfilePhases(Short PowerProfileID) throws DeviceException;

	public void scheduleEnergyPhases(Short PowerProfileID, ScheduledPhaseAttribute[] phases) throws DeviceException;

	/*
	 * GUARDARE PAGINA 229 ZigBee HA devo fare da 10285, prendendo prima i
	 * constraint e il powerprofile attivo
	 * 
	 * 
	 * public void execEnergyPhasesScheduleNotification(Short PowerProfileID,
	 * ScheduledPhase[] ScheduledPhases) throws DeviceException;
	 * 
	 * //pag 214! public PowerProfileResponse execPowerProfileRequest(Short
	 * PowerProfileID)throws DeviceException;
	 * 
	 * 
	 * 
	 * 
	 * public PowerProfileStateResponse execPowerProfileStateRequest() throws
	 * DeviceException;
	 * 
	 * 
	 * 
	 * public PowerProfileScheduleConstraintsResponse
	 * execPowerProfileScheduleConstraintsRequest(Short PowerProfileID) throws
	 * DeviceException;
	 * 
	 * public EnergyPhasesScheduleStateResponse
	 * execEnergyPhasesScheduleStateRequest(Short PowerProfileID) throws
	 * DeviceException;
	 */
}
