package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveToAutoZone extends CommandGroup {
    
    public  DriveToAutoZone() {
    	addSequential(new Drive(2, true, false));
    }
}
