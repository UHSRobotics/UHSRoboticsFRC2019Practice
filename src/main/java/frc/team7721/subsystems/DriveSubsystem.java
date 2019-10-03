/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7721.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team7721.Robot;
import frc.team7721.RobotMap;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(Robot.driveCommand);
    //this will get called when driveSubsystem is created.
  }

  public void drive(double right, double left){
    RobotMap.driveLeft1.set(ControlMode.PercentOutput,left);
    RobotMap.driveLeft2.set(ControlMode.PercentOutput,left);
    RobotMap.driveRight1.set(ControlMode.PercentOutput,-right);
    RobotMap.driveRight2.set(ControlMode.PercentOutput,-right);
  }
}
