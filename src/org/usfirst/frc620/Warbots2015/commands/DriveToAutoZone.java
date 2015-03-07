package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveToAutoZone extends CommandGroup {
    
    public  DriveToAutoZone() {
    	addSequential(new Drive(1,0,.5,0));
    }
}
