package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class PullOffTwoCans extends CommandGroup {
    
    public  PullOffTwoCans() {
    	addSequential(new Drive(1,0,.2,0)); 
		addSequential(new liftPicker(2));
		addSequential(new Drive(1,0,-.2,0));  
		addSequential(new lowerPicker(2));
		addSequential(new Drive(1,.2,0,0));
		addSequential(new Drive(1,0,.2,0));
    }
}
