package org.usfirst.frc.team5763.robot.commands;

import org.usfirst.frc.team5763.robot.OI;
import org.usfirst.frc.team5763.robot.Robot;
import org.usfirst.frc.team5763.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DrivingCommand extends Command {

    public DrivingCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrainSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.frontRightMotor.set(ControlMode.PercentOutput, 0);
    	RobotMap.frontLeftMotor.set(ControlMode.PercentOutput, 0);
    	RobotMap.backRightMotor.set(ControlMode.Follower, 1);
    	RobotMap.backLeftMotor.set(ControlMode.Follower, 3);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.frontRightMotor.set(ControlMode.PercentOutput, 0.5);
    }
//    	double driveSpeedCoeff = 0.35;
//		double y = OI.drive.getRawAxis(1) * driveSpeedCoeff;
//		double x = OI.drive.getRawAxis(0) * driveSpeedCoeff;
//
//		if (y < 0.1 && y > -0.1) {
//			y = 0;
//		}
//		
//		if ( x < 0.1 && x > -0.1) {
//			x = 0;
//		}
//		
//		RobotMap.frontLeftMotor.set(ControlMode.PercentOutput, y + x);
//		RobotMap.frontRightMotor.set(ControlMode.PercentOutput, -y + x);
//		
//		System.out.printf("y: %s; x: %s\n", y, x);
//		
//		System.out.printf("Left out: %s; Right out: %s; Left Pos: %s; Right Pos: %s\n",
//				RobotMap.frontLeftMotor.getOutputCurrent(),
//				RobotMap.frontRightMotor.getOutputCurrent(),
//				RobotMap.frontLeftMotor.getSelectedSensorPosition(0),
//				RobotMap.frontRightMotor.getSelectedSensorPosition(0));
//    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false; 
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.frontRightMotor.set(ControlMode.PercentOutput, 0);
    	RobotMap.frontLeftMotor.set(ControlMode.PercentOutput, 0);
    	RobotMap.backRightMotor.set(ControlMode.PercentOutput, 0);
    	RobotMap.backLeftMotor.set(ControlMode.PercentOutput, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	RobotMap.frontRightMotor.set(ControlMode.PercentOutput, 0);
    	RobotMap.frontLeftMotor.set(ControlMode.PercentOutput, 0);
    	RobotMap.backRightMotor.set(ControlMode.PercentOutput, 0);
    	RobotMap.backLeftMotor.set(ControlMode.PercentOutput, 0);
    }
}
