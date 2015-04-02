package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class PullOffTwoCans extends CommandGroup {

	public  PullOffTwoCans() {
 		
//		addSequential(new Drive(90,true));

		addSequential(new liftPicker(1.6));
		addSequential(new Drive(.5, 0, .5, 0));
		addSequential(new extend());
		addSequential(new liftPicker(2));
		addSequential(new retract());
		addSequential(new lowerPicker(2));
		
		addSequential(new Drive(-1.295, true, false));

		//		addSequential(new lowerPicker());
//		
//		addSequential(new Drive(1.288, true, true));
//    	addSequential(new liftPicker(1.65));

//		addSequential(new Drive(1.295, true, false));
//    	addSequential(new liftPicker(2));
//    	addSequential(new Drive(-1.295, true, false));
//    	addSequential(new lowerPicker());

	}
}
