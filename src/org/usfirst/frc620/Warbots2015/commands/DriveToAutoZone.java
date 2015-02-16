package org.usfirst.frc620.Warbots2015.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveToAutoZone extends CommandGroup {
    
    public  DriveToAutoZone() {
    	addSequential(new Drive(1,.5,0,0));
    	addSequential(new Drive(1,0,.25,0));
    	addSequential(new Drive(1,-.5,0,0));
    	addSequential(new Drive(1,0,-.25,0));
    }
}
