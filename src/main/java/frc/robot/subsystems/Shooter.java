// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.DoubleSolenoid;
//import edu.wpi.first.wpilibj.PWM;

public class Shooter extends SubsystemBase {
  //Motor and solenoid are created privately for use in this class
  private CANSparkMax m_shooterMotor; 
  private DoubleSolenoid m_shooterBallRelease;

  public Shooter() {
    m_shooterMotor = RobotContainer.shooterMotor; //Motor and solenoid information referenced from RobotContainer
    m_shooterBallRelease = RobotContainer.shooterBallRelease;
  }

  @Override
  public void periodic() 
  {
    // This method will be called once per scheduler run
  }
  public void ShooterRun(){ //Function created to run the motor-- referenced later in ShooterRun.java
    m_shooterMotor.set(1);
    //m_shooterMotorBB.setSpeed(1);
  }
  public void ShooterStop(){
    m_shooterMotor.set(0);
    //m_shooterMotorBB.setSpeed(0);
  }

  public void ReleaseGate(){
    m_shooterBallRelease.set(DoubleSolenoid.Value.kForward);
  }
  public void RetractGate(){
    m_shooterBallRelease.set(DoubleSolenoid.Value.kReverse);
  }
}
