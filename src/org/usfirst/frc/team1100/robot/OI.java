package org.usfirst.frc.team1100.robot;

import org.usfirst.frc.team1100.robot.input.XboxController;
import org.usfirst.frc.team1100.robot.commands.Spin;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	private static OI instance;
	
	public XboxController xbox;
	
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
		// null
	}
	
	public XboxController getXbox() {
		return xbox;
	}
}
