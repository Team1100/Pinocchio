package org.usfirst.frc.team1100.robot.commands.auto;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team1100.robot.subsystems.Flag;

/**
 *
 */
public class Default extends Command {
	private Timer timer;
	private boolean finished;

    public Default() {
        // Use requires() here to declare subsystem dependencies
    	requires(Flag.getInstance());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    	finished = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.err.println(timer.get());
    	if (timer.get() < 2.0) {
    		Flag.getInstance().setSpeed(0.2);
    	} else if (timer.get() < 5.0) {
    		Flag.getInstance().setSpeed(-0.5);
    	} else if (timer.get() < 10) {
    		Flag.getInstance().setSpeed(-0.3);
    	} else {
    		finished = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
