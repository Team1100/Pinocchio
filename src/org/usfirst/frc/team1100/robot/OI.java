package org.usfirst.frc.team1100.robot;

import org.usfirst.frc.team1100.robot.input.XboxController;
import org.usfirst.frc.team1100.robot.commands.SpinClockwise;
import org.usfirst.frc.team1100.robot.commands.SpinCounterclockwise;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	private static OI instance;
	
	private XboxController xbox;
	
	public static OI getInstance() {
		if (instance == null) {
			instance = new OI();
		}
		return instance;
	}
	
	private OI() {
		//Initialize input devices
		xbox = new XboxController(RobotMap.U_XBOX, .1);
		
		// Button assignments
		xbox.getButtonA().whileHeld(new SpinClockwise());
		xbox.getButtonB().whileHeld(new SpinCounterclockwise());
	}
}
