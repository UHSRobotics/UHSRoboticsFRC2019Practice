/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7721;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team7721.commands.DriveCommand;
import frc.team7721.subsystems.*;
import edu.wpi.first.wpilibj.command.*;


/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {
  public static DriveSubsystem driveSubsystem;

  public static DriveCommand driveCommand;

  @Override
  public void robotInit() {
    OI.init();
    driveSubsystem = new DriveSubsystem();
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }
}
