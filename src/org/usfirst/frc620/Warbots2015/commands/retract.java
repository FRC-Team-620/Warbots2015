package org.usfirst.frc620.Warbots2015.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc620.Warbots2015.Robot;
import org.usfirst.frc620.Warbots2015.RobotMap;

/**
 *
 */
public class  retract extends Command {

    public retract() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.pneumatics);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    protected void initialize() {
    	RobotMap.pneumaticsSolenoid.set(false);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
