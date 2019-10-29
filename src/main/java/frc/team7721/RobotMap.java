/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7721;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;

/**
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  public static VictorSPX driveLeft1;
  public static VictorSPX driveLeft2;
  public static VictorSPX driveRight1;
  public static VictorSPX driveRight2;
  public static VictorSPX lift;
  public static DigitalInput liftLimit;

  public static void init() {
    // the driving stuffs
    driveLeft1 = new VictorSPX(6);
    driveLeft2 = new VictorSPX(7);
    driveRight1 = new VictorSPX(9);
    driveRight2 = new VictorSPX(10);
    //lift stuff
    lift = new VictorSPX(8);
    liftLimit = new DigitalInput(4);
  }
}
