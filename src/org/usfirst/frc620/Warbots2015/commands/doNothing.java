package org.usfirst.frc620.Warbots2015.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc620.Warbots2015.Robot;

/**
 *
 */
public class  doNothing extends Command {

    public doNothing() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
