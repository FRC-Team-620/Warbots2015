package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class PullOffTwoCans extends CommandGroup {

	public  PullOffTwoCans() {
		addSequential(new Drive(1.295, true, false));
		addSequential(new extend());
		addSequential(new liftPicker());
		addSequential(new Drive(-1.295, true, false));
		addSequential(new lowerPicker());
		
		addSequential(new Drive(1, true, true));
    	addSequential(new liftPicker(1.75));


		addSequential(new Drive(1.295, true, false));
    	addSequential(new liftPicker());
    	addSequential(new Drive(-1.295, true, false));
    	addSequential(new lowerPicker());

	}
}
