package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class PullOffTwoCans extends CommandGroup {
    
    public  PullOffTwoCans() {
        //
    	addSequential(new Drive(1,0,.5,0));
    	addSequential(new extend());
    	addSequential(new liftPicker());
    	addSequential(new retract());
    	addSequential(new Drive(1,0,0,-1)); //Turn 180 degrees
    	addSequential(new lowerPicker());
    	addSequential(new Drive(1,.5,0,-1)); //Turn 180 degrees while moving to next can
    	addSequential(new extend());
    	addSequential(new liftPicker());
    	addSequential(new retract());
    	addSequential(new Drive(1,0,-.5,0));
    	addSequential(new lowerPicker());
    }
}
