package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DropToteInAutoZone extends CommandGroup {

	public  DropToteInAutoZone() {
		addSequential(new Drive(1,0,.2,0)); 
		addSequential(new lowerPicker(2));
		addSequential(new Drive(1,0,-.2,0));
	}
}
