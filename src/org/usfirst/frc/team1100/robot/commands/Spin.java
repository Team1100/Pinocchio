package org.usfirst.frc.team1100.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team1100.robot.OI;
import org.usfirst.frc.team1100.robot.input.XboxController;
import org.usfirst.frc.team1100.robot.subsystems.Flag;

/**
 * Command that spins the Flag (subsystem)
 */
public class Spin extends Command {

    public Spin() {
        requires(Flag.getInstance());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Flag.getInstance().setSpeed(OI.getInstance().getXbox().getAxis(XboxController.XboxAxis.kLeftX));
    	SmartDashboard.putNumber("LeftX: ", OI.getInstance().getXbox().getAxis(XboxController.XboxAxis.kLeftX));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
