package org.usfirst.frc620.Warbots2015.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc620.Warbots2015.Robot;
import org.usfirst.frc620.Warbots2015.RobotMap;

/**
 *
 */
public class  turnLeft extends Command {
	double angle;
	double initial;
	double drivez;
	
	public turnLeft() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

	public turnLeft(int a) {
    	initialize();
    	while(!isFinished())
    	{
    		execute();
    	}
    	end();
    }
    
    protected void initialize() {
    	initial  = RobotMap.imu.getYaw();
    }

    protected void execute() {
    	angle = RobotMap.imu.getYaw();
    	//RobotMap.driveTrainRobotDrive.mecanumDrive_Polar(0, 0, -.5);
    	Robot.driveTrain.mecanumDrive(0, 0,(Math.abs(1-((90-(angle+1))/90))) , 0);
    	SmartDashboard.putNumber("angle", angle);
    	SmartDashboard.putData("Gyro", RobotMap.imu);
    }

    protected boolean isFinished() {
    	angle = RobotMap.imu.getYaw();
    	return (initial-90 <= angle+2 && initial-90 >= angle-2);
    }

    protected void end() {
    	RobotMap.driveTrainRobotDrive.mecanumDrive_Polar(0, 0, 0);
    }

    protected void interrupted() {
    }
}
