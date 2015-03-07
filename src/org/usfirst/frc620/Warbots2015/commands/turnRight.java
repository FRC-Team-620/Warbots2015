package org.usfirst.frc620.Warbots2015.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc620.Warbots2015.Robot;
import org.usfirst.frc620.Warbots2015.RobotMap;

/**
 *
 */
public class  turnRight extends Command {

	double angle;
	double initial;
	double drivez;
	boolean finished = false;

	public turnRight() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
	public turnRight(int a) {
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
    	RobotMap.driveTrainRobotDrive.mecanumDrive_Polar(0, 0, .35);
    	SmartDashboard.putNumber("angle", angle);
    	SmartDashboard.putData("Gyro", RobotMap.imu);
    }

    protected boolean isFinished() {
        angle = RobotMap.imu.getYaw();
    	return initial+90 <= angle+5 && initial+90 >= angle-5;
    }

    protected void end() {
    	RobotMap.driveTrainRobotDrive.mecanumDrive_Polar(0, 0, 0);
    }

    protected void interrupted() {
    }
}
