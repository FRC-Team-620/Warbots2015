// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc620.Warbots2015;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.util.Vector;

import org.usfirst.frc620.Warbots2015.subsystems.GyroITG3200;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static Jaguar driveTrainPWMJagRL;
    public static Jaguar driveTrainPWMJagRR;
    public static Jaguar driveTrainPWMJagFL;
    public static Jaguar driveTrainPWMJagFR;

    public static CANTalon driveTrainCANTalonRL;
    public static CANTalon driveTrainCANTalonFR;
    public static CANTalon driveTrainCANTalonRR;
    public static CANTalon driveTrainCANTalonFL;
    
    public static Gyro driveTrainGyro;
    public static GyroITG3200 driveTrainGyro3200;
    
    public static RobotDrive driveTrainRobotDrive;
    
    public static Compressor pnuematicsCompressor;
    public static Solenoid pnuematicsSolenoid; 

    public static void init() {
    	
    	Boolean JaguarIsPresent = (driveTrainCANTalonRL == null); 

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainPWMJagRL = new Jaguar(1);
        LiveWindow.addActuator("DriveTrain", "PWMJagRL", (Jaguar) driveTrainPWMJagRL);
        
        driveTrainPWMJagRR = new Jaguar(4);
        LiveWindow.addActuator("DriveTrain", "PWMJagRR", (Jaguar) driveTrainPWMJagRR);
        
        driveTrainPWMJagFL = new Jaguar(2);
        LiveWindow.addActuator("DriveTrain", "PWMJagFL", (Jaguar) driveTrainPWMJagFL);
        
        driveTrainPWMJagFR = new Jaguar(3);
        LiveWindow.addActuator("DriveTrain", "PWMJagFR", (Jaguar) driveTrainPWMJagFR);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainPWMJagFL, driveTrainPWMJagRL,
              driveTrainPWMJagFR, driveTrainPWMJagRR);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);

        driveTrainGyro = new Gyro(0);
        LiveWindow.addSensor("DriveTrain", "Gyro", driveTrainGyro);
        driveTrainGyro.setSensitivity(0.007);
        pnuematicsCompressor = new Compressor(0);
        
        
        pnuematicsSolenoid = new Solenoid(0, 0);
        LiveWindow.addActuator("Pnuematics", "Solenoid", pnuematicsSolenoid);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainRobotDrive = null;
        
        driveTrainCANTalonRL = new CANTalon(1);
        driveTrainCANTalonFL = new CANTalon(2);
        driveTrainCANTalonFR = new CANTalon(3);
        driveTrainCANTalonRR = new CANTalon(4);

        
        driveTrainGyro3200 = new GyroITG3200(I2C.Port.kOnboard);
        driveTrainGyro3200.initialize();
        LiveWindow.addSensor("DriveTrain", "Gyro3200", driveTrainGyro3200);
        


        
//        driveTrainRobotDrive = new RobotDrive(driveTrainCANTalonFL, driveTrainCANTalonRL,
//                driveTrainCANTalonFR, driveTrainCANTalonRR);;
        
//        if(JaguarIsPresent) {
//        	driveTrainRobotDrive = new RobotDrive(
//             		driveTrainPWMJagFL, 
//             		driveTrainPWMJagRL,
//                    driveTrainPWMJagFR, 
//                    driveTrainPWMJagRR); 
//        }
//        else {
        	driveTrainRobotDrive = new RobotDrive(
           		 driveTrainCANTalonFL, 
           		 driveTrainCANTalonRL,
                 driveTrainCANTalonFR, 
                 driveTrainCANTalonRR);
        //}
        
        driveTrainRobotDrive.setInvertedMotor(MotorType.kFrontLeft, true);
        driveTrainRobotDrive.setInvertedMotor(MotorType.kRearLeft, true);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);

    }
}
