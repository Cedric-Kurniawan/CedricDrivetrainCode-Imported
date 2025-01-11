// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.arm;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import frc.robot.Constants.DriveConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
  private final SparkMax armMotor = new SparkMax(DriveConstants.kArmCANId, MotorType.kBrushless);

  public void raiseArm(double givenSpeed){
    armMotor.set(1);
  }

  public void lowerArm(double givenSpeed){
    armMotor.set(-1);
  }

}
