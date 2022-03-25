package frc.robot;

import frc.robot.helpers.Tuner.TunableBoolean;
import frc.robot.helpers.Tuner.TunableDouble;
import frc.robot.helpers.Tuner.TunableInteger;

public final class Tunables {

  public static final TunableDouble kF = new TunableDouble("armKF", 0.2);
  public static final TunableDouble kP = new TunableDouble("armKP", 0.2);
  public static final TunableInteger armSmoothingStrength = new TunableInteger("armSmoothingStrength", 4);
  public static final TunableInteger armCruiseVelocityInSensorUnits = new TunableInteger("armCruiseVelocityInSensorUnits", 12000);
  public static final TunableInteger armAccelerationInSensorUnits = new TunableInteger("armAccelerationInSensorUnits", 4000);

  public static final TunableDouble maxDriveAcceleration = new TunableDouble("maxDriveAcceleration", 2.3);
  public static final TunableBoolean useAntiTipping = new TunableBoolean("useAntiTipping", false);

  public static final TunableDouble minDangerLevel = new TunableDouble("minDangerLevel", 50.0);
  public static final TunableDouble maxDangerLevel = new TunableDouble("maxDangerLevel", 250.0);

  public static final TunableDouble maxSteeringRadiansPerSecond = new TunableDouble("maxSteeringRadiansPerSecond", 2.0);
  public static final TunableDouble maxDriveMetersPerSecond = new TunableDouble("maxDriveMetersPerSecond",
      Constants.maxSpeedInMetersPerSecond);

  public static final TunableInteger armUpSensorCounts = new TunableInteger("armUpSensorCounts", 500);
    
  public static final TunableInteger armDownSensorCounts = new TunableInteger("armDownSensorCounts", -43000);

  public static final TunableInteger armClimbUnderBarSensorCounts = new TunableInteger("armClimbUnderBarSensorCounts", -22000);

  public static final TunableDouble driveTrainClimbingSpeed = new TunableDouble("driveTrainClimbingSpeed", 1.0);

  public static final TunableDouble maxPitchForClimb = new TunableDouble("maxPitchForClimb", 22.0);

  public static final TunableDouble maxSafeDriveVolage = new TunableDouble("maxSafeDriveVolage", 0.51);
  public static final TunableDouble driveTrainClimbingPercentage = new TunableDouble("driveTrainClimbingPercentage",
      0.7);

  public static final TunableDouble maxArmCurrent = new TunableDouble("maxArmCurrent", 15.0);
  public static final TunableDouble maxArmSeconds = new TunableDouble("maxArmSeconds", 3.0);
}

