package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DropCanInAutoZone extends CommandGroup {
    
    public  DropCanInAutoZone() {
    	addSequential(new liftPicker(4));
    	addSequential(new Drive(1.8796, 0));
    	addSequential(new lowerPicker());
    	addSequential(new Drive(-1.8796, 0));
    }
}
