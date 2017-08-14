package org.usfirst.frc.team1100.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;

import org.usfirst.frc.team1100.robot.RobotMap;
import org.usfirst.frc.team1100.robot.commands.Spin;

/**
 * This is the subsystem that is for the motor with the strip of paper taped on it, aka "Flag"
 */
public class Flag extends Subsystem {

	private static Flag flag;
	private Talon motor;


	public static Flag getInstance() {
		if (flag == null) {
			flag = new Flag();
		}
		return flag;
	}
	
	private Flag() {
		motor = new Talon(RobotMap.M_MOTOR_0);
	}

    public void initDefaultCommand() {
        
        setDefaultCommand(new Spin());
    }
    /**
     * Set the speed of the spin of the flag
     * @param speed the desired speed of the flag
     */
    public void setSpeed(double speed) {
    	motor.setSpeed(speed);
    }
}

