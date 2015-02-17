package org.usfirst.frc620.Warbots2015.commands;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;






import org.usfirst.frc620.Warbots2015.Robot;
import org.usfirst.frc620.Warbots2015.RobotMap;

public class  lowerPicker extends Command {

	double start, now, end;
	double t = 100;
	Timer timer;

	public lowerPicker() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
		requires(Robot.picker);
		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
	}
	public lowerPicker(double time){
		t=time;
	}
	public lowerPicker(double time, boolean button){
		t=time;
		initialize();
		while(!isFinished())
		{
			execute();
		}
		end();
	}

	protected void initialize() {
    	start = timer.getFPGATimestamp();

    	end = start + t;
	}

	protected void execute() {
		Robot.picker.setSpeed(.5);
    	now = timer.getFPGATimestamp();
	}

	protected boolean isFinished() {
		return (now >= end);
	}

	protected void end() {
		Robot.picker.setSpeed(0);
	}

	protected void interrupted() {
	}
}
