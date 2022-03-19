package frc.robot;

import frc.robot.helpers.Tuner.TunableBoolean;
import frc.robot.helpers.Tuner.TunableDouble;
import frc.robot.helpers.Tuner.TunableInteger;

public final class Tunables {

  public static final TunableDouble kF = new TunableDouble("armKF", 0.2);
  public static final TunableDouble kP = new TunableDouble("armKP", 0.2);

  public static final TunableDouble slewRate = new TunableDouble("slewRateForDrivetrain", Constants.slewRateForDrivetrain);
  public static final TunableBoolean useAntiTipping = new TunableBoolean("useAntiTipping", false);

  public static final TunableDouble minTippingIntegral = new TunableDouble("minTippingIntegral", 50.0);
  public static final TunableDouble maxTippingIntegral = new TunableDouble("maxTippingIntegral", 250.0);

  public static final TunableDouble maxSteeringRadiansPerSecond = new TunableDouble("maxSteeringRadiansPerSecond", Constants.maxSteeringRadiansPerSecond);
  public static final TunableDouble maxDriveMetersPerSecond = new TunableDouble("maxDriveMetersPerSecond",
      Constants.maxSpeedInMetersPerSecond);

  public static final TunableInteger armUpSensorCounts = new TunableInteger("armUpSensorCounts",
      Constants.armUpSensorCounts);
    
  public static final TunableInteger armDownSensorCounts = new TunableInteger("armUpSensorCounts",
  Constants.armDownSensorCounts);

}
