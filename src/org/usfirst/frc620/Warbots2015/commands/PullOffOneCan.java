package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class PullOffOneCan extends CommandGroup {

	public  PullOffOneCan() {
		addSequential(new liftPicker(1.5));
		addSequential(new Drive(.5, 0));
		addSequential(new extend());
		addSequential(new liftPicker(2));
		addSequential(new Drive(-2, 0));
		addSequential(new lowerPicker());
	}
}
