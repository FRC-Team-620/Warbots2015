package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class PullOffOneCan extends CommandGroup {
    
    public  PullOffOneCan() {
    	//
    	addSequential(new Drive(1,0,.5,0));
    	addSequential(new extend());
    	addSequential(new liftPicker());
    	addSequential(new retract());
    	addSequential(new Drive(1,0,-.5,0));
    	addSequential(new lowerPicker());
    }
}
