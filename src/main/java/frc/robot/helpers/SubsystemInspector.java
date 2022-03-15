// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.helpers;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.Command;

// TODO: deal with duplicate graphed lines on code restart https://github.com/wpilibsuite/shuffleboard/issues/720
public class SubsystemInspector {

  private final NetworkTable stats;

  public SubsystemInspector(String subsystemName) {
    // TODO: figure out how to clear the table on bootup so there aren't stale entries of old data
    stats = NetworkTableInstance.getDefault().getTable(subsystemName).getSubTable("inspector");
  }

  public void set(String name, Boolean value) {
    stats.getEntry(name).setBoolean(value);
  }

  public void set(String name, String value) {
    stats.getEntry(name).setString(value);
  }

  public void set(String name, Double value) {
    boolean differenceIsSignificantEnoughToUpdateEntry = Math.abs(value - stats.getEntry(name).getDouble(Double.MAX_VALUE)) > 0.01;
    if (differenceIsSignificantEnoughToUpdateEntry) {
      stats.getEntry(name).setDouble(value);
    }
  }

  public void set(String name, Integer value) {
    stats.getEntry(name).setDouble(value);
  }

  public void set(String name, Command value) {
    stats.getEntry(name).setString(value != null ? value.getName() : "---");
  }

}
