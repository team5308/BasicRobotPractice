// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TurretSubsystem extends SubsystemBase {
  /** Creates a new TurretSubsystem. */

  // TODO: create the instance of the motor controller TalonSRX here

  // TODO: create the instance of the joystick here


  public TurretSubsystem() {
    // TODO: set the motor neutral mode to BREAK
    // TODO: think - why should we set the mode to BREAK (and what does BREAK mean?)

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    // TODO: try control the turret with percent output mode first
    // hint: search through the drop list when typing the "."
    //       and find the appropriate function to use.
    // hint: port number for joystick trigger is 0
    // hint: don't forget to set turning velocity to 0 when trigger is released


    // TODO: then try control the turret with velocity mode


    // TODO: at last, try to think how exactly position control mode is implemented
    
  }

  /**
   * TODO: Implement the encoder units to degrees function
   */
  public double encoderUnitsToDegrees(double encoderUnits) {
    return 0.0;
  }

  /**
   * TODO: Implement the degrees to encoder units function
   */
  public double degreesToEncoderUnits(double degrees) {
    return 0.0;
  }

}
