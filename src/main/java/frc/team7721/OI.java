package frc.team7721;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public static Joystick mainOI;
  public static boolean altControl;

  /**
   * Initialize all the controller
   */
  public static void init() {
    mainOI = new Joystick(0);
    altControl = false;
  }

  /**
   * Cartesian X-Axis
   */
  public static double getDriveX() {
    return correctJoystick(mainOI.getRawAxis(2));
  }

  /**
   * Cartesian Y-Axis
   */
  public static double getDriveY() {
    return correctJoystick(-mainOI.getRawAxis(1));
  }

  public static double getLift() {
    if (mainOI.getRawButtonPressed(1))
      return -1;
    else if (mainOI.getRawButtonPressed(4))
      return 1;
    return 0;
  }
  /*
   * public static boolean getIntakePressed() { if (!usingSubOI) return false;
   * return (subOI.getRawButton(5) || mainOI.getRawButton(5) ||
   * mainOI.getRawButton(6)) ? subOI.getRawButton(5) : safeOI.getRawButton(5);//
   * Back Left btn }
   * 
   * public static boolean getRevIntakePressed() { if (!usingSubOI) return false;
   * return (subOI.getRawButton(6) || mainOI.getRawButton(5) ||
   * mainOI.getRawButton(6)) ? subOI.getRawButton(6) : safeOI.getRawButton(6);//
   * Back Left btn }
   */

  public static double correctJoystick(double input) {
    return input > Constant.joystickDeadZone || input < -Constant.joystickDeadZone ? input : 0;
  }

}
