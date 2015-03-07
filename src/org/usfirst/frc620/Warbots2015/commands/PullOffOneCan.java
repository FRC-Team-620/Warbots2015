package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class PullOffOneCan extends CommandGroup {

	public  PullOffOneCan() {
		addSequential(new Drive(1,0,.2,0)); 
		addSequential(new liftPicker(2));
		addSequential(new Drive(1,0,-.2,0));  
		addSequential(new lowerPicker(2));
	}
}
