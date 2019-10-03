/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7721.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7721.OI;
import frc.team7721.Robot;

public class DriveCommand extends Command {

  double right, left, x, y;
  boolean acceleration, leftTank, rightTank;

  public DriveCommand() {
    requires(Robot.driveSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    right = left = x = y = 0;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
      x = OI.getDriveX();
      y = OI.getDriveY();

      left = y + x;
      right = y - x;

    Robot.driveSubsystem.drive(right, left);

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }
}
