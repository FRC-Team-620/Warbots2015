// RobotBuilder Version: 1.50
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc620.Warbots2015.commands;

import org.usfirst.frc620.Warbots2015.Robot;


import org.usfirst.frc620.Warbots2015.RobotMap;
import org.usfirst.frc620.Warbots2015.commands.turnLeft;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

//import org.usfirst.frc620.Warbots2015.subsystems.GyroITG3200;
/**
 *
 */
public class  DriveWithJoysticks extends Command {
	Joystick stick;
	private final Gyro gyro = RobotMap.driveTrainGyro;
	double x;
	double y;
	double z;
	double theta;
	Timer timer;
	double start;
	double now;
	double throttle;
	JoystickButton button3;
	JoystickButton button4;
	JoystickButton button5;
	JoystickButton button6;
	public boolean fieldCentric;
	
	
    public DriveWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    	stick = new Joystick(0);
    	gyro.reset();
    	//timer.start();
    	start = timer.getFPGATimestamp();
    	button3 = new JoystickButton(stick,3);
    	button4 = new JoystickButton(stick,4);
    	button5 = new JoystickButton(stick,5);
    	button6 = new JoystickButton(stick,6);   
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	x=stick.getX();
    	y=stick.getY();
    	z=stick.getTwist();
    	throttle = -((stick.getThrottle()/2)+.5);
    	now = timer.getFPGATimestamp();
    	System.out.println("math: "+(now-start));
    	
    	theta = gyro.getAngle()%360 - .042*(now-start);
    	Robot.driveWithJoysticks.fieldCentric = (boolean) Robot.fieldCentricChooser.getSelected();
    	if(Math.abs(x)<0.2)
    		x=0;
    	if(Math.abs(y)<0.2)
    		y=0;
    	if(Math.abs(z)<0.2)
    		z=0;
    	if(button3.get()){
    		new turnLeft(1);
    	}
    	if(button4.get())
    	{
    		new turnRight(1);
    	}
    	if(button5.get()){
    		new turnAroundLeft(1);
    	}
    	if(button6.get()){
    		new turnAroundRight(1);
    	}
    	if(fieldCentric)
    		Robot.driveTrain.mecanumDrive(-x*throttle,y*throttle, z*throttle, -theta); 
    	else
    		Robot.driveTrain.mecanumDrive(-x*throttle,y*throttle, z*throttle, 0); 
    	SmartDashboard.putNumber("angle", theta);
    	SmartDashboard.putData("Gyro", RobotMap.driveTrainGyro);
    	}

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
