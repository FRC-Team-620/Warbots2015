package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class PullOffOneCan extends CommandGroup {

	public  PullOffOneCan() {
		addSequential(new Drive(1.295, true, false));
    	addSequential(new extend());
    	addSequential(new liftPicker());
    	addSequential(new Drive(-1.295, true, false));
    	addSequential(new lowerPicker());
	}
}
