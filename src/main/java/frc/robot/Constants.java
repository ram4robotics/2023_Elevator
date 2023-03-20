// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class CAN_IDs {
    public static final int driveTrain_Left1 = 11;
    public static final int driveTrain_Left2 = 12;
    public static final int driveTrain_Right1 = 13;
    public static final int driveTrain_Right2 = 14;
    public static final int elevatorLeft = 21;
    public static final int elevatorRight = 22;
    public static final int slider = 23;
    public static final int intakeArmLeft = 26;
    public static final int intakeArmRight = 27;
    public static final int intakeWheels = 28;
  }
  public static class ElevatorConstants {
    public static final boolean kMotorLeft_inverted = false;
    public static final boolean kMotorRight_inverted = true;
    public static final int kCurrentLimit = 40;
    public static final double kElevatorGearRatio = 1 / (5 * 4); // 5:1 * 4:1
    // RevRobotics 16T Sprocket pitch size is 1.29 inches
    // https://www.revrobotics.com/25-sprockets/
    // https://www.revrobotics.com/content/docs/REV-21-2016-DR.pdf
    // kPositionFactor converts #motor-rotations into #inches travelled by the Elevator
    public static final double kPositionFactor = Math.PI * 1.29 * kElevatorGearRatio;
    // kVelocityFactor converts Motor-RPM (Revolutions Per Minute) into  inches-per-second
    public static final double kVelocityFactor = kPositionFactor / 60;

    public static final double kMinTravelInInches = 0;
    public static final double kMaxTravelInInches = 36; // ToDo:  Verify with experimentation
    public static final double kToleranceInInches = 1.8; // 5% of travel length
    public static final double kElevatorSpeedUp = 0.7;
    public static final double kElevatorSpeedDown = -0.3;
  }
  public static class OperatorConstants {
    public static final int kDriverControllerPort1 = 0;
    public static final int kDriverControllerPort2 = 1;
    public static final double kDriveDeadband = 0.05;
    public static final double kArmManualDeadband = 0.05;
    public static final double kArmManualScale = 0.5;
  }}
