/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7721.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team7721.RobotMap;
import frc.team7721.Robot;

/**
 * Add your docs here.
 */
public class LiftExSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(Robot.liftExCommand);
  }

  public void operate(double val) {
    if ((RobotMap.liftLimit.get() && val > 0)) {
      val = 0;
    }
    RobotMap.lift.set(ControlMode.PercentOutput, val);
  }
}
