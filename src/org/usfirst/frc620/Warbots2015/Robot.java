package org.usfirst.frc620.Warbots2015;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;



import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc620.Warbots2015.commands.*;
import org.usfirst.frc620.Warbots2015.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	Command autonomousCommand;
	SendableChooser autoChooser;

	public static SendableChooser fieldCentricChooser;

	//PUT BACK IN, IMPORTANT
	int session;
	Image frame;


	public static OI oi;
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static DriveTrain driveTrain;
	public static Picker picker;
	public static Pneumatics pneumatics;

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static DriveWithJoysticks driveWithJoysticks;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		RobotMap.init();
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
		driveTrain = new DriveTrain();
		picker = new Picker();
		pneumatics = new Pneumatics();

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
		oi = new OI();

		//camera
		//		frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
		//		session = NIVision.IMAQdxOpenCamera("cam0",
		//				NIVision.IMAQdxCameraControlMode.CameraControlModeController);
		//		NIVision.IMAQdxConfigureGrab(session);

		//gyro
		RobotMap.imu.zeroYaw();

		//autonomous mode sendable chooser
		autoChooser = new SendableChooser();
		autoChooser.addDefault("Do nothing", new doNothing());
		autoChooser.addObject("Drive to Auto Zone", new DriveToAutoZone());
		autoChooser.addObject("Drop can in Auto Zone", new DropCanInAutoZone());
		autoChooser.addObject("Drop tote in Auto Zone", new DropToteInAutoZone());
		autoChooser.addObject("Pull off one can", new PullOffOneCan());
		autoChooser.addObject("Pull off two cans", new PullOffTwoCans());
		//autoChooser.addObject("lowerPicker test (1 sec)", new lowerPicker(1));
		SmartDashboard.putData("Autonomous Mode Chooser", autoChooser);

		//teleop mode sendable chooser
		fieldCentricChooser = new SendableChooser();
		fieldCentricChooser.addDefault("Field Centric Drive", true);
		fieldCentricChooser.addObject("Normal Drive", false);
		SmartDashboard.putData("Drive Mode Chooser", fieldCentricChooser);

		// instantiate the command used for the autonomous period
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
		autonomousCommand = new AutonomousCommand();

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
	}

	/**
	 * This function is called when the disabled button is hit.
	 * You can use it to reset subsystems before shutting down.
	 */
	public void disabledInit(){
		//		cameraInit();
	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		//		camera();
	}

	public void autonomousInit() {
		// schedule the autonomous command (example)
		autonomousCommand = (Command) autoChooser.getSelected();
		if (autonomousCommand != null) autonomousCommand.start();
		//		cameraInit();
		System.out.println("autonomous init: " + autoChooser.getSelected().toString());
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		//		camera();
	}

	public void teleopInit() {
		if (autonomousCommand != null) autonomousCommand.cancel();
		//		cameraInit();
	}


	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		//		camera();
	}

	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {
		LiveWindow.run();
	}
	public void cameraInit(){

		//		NIVision.IMAQdxStartAcquisition(session);

	}
	public void camera(){   	 

		//		NIVision.IMAQdxGrab(session, frame, 1);   
		//
		//		CameraServer.getInstance().setImage(frame);

	}
	public void cameraStop(){
		//		NIVision.IMAQdxStopAcquisition(session);
	}
}
