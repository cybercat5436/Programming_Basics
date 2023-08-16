// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;

/** Add your docs here. */
public class TankDrive extends DriveBase{

    //Instance Variables
    private final MotorController m_leftMotor;
    private final MotorController m_rightMotor;

    //Sub Class Constructor, intialize the member variables
    public TankDrive(MotorController leftMotor, MotorController rightMotor) {
        this.m_leftMotor = leftMotor;
        this.m_rightMotor = rightMotor;

    }

    //Sub Class Member Function
    public void setSpeed(double leftSpeed, double rightSpeed){

        //Apply deadband, use the base class deadband values
        leftSpeed = MathUtil.applyDeadband(leftSpeed, m_deadband);
        rightSpeed = MathUtil.applyDeadband(rightSpeed, m_deadband);

        double leftKinematics = leftKinematics(leftSpeed);
        double rightKinematics = rightKinematics(rightSpeed);

        //Set the speeds of the left and right motors
        m_leftMotor.set( leftKinematics * m_maxOutput);
        m_rightMotor.set( rightKinematics * m_maxOutput);

    }

    public double leftKinematics(double leftSpeed){
        return MathUtil.clamp(leftSpeed, -1.0, 1.0);
    }

    public double rightKinematics(double rightSpeed){
        return MathUtil.clamp(rightSpeed, -1.0, 1.0);
    }

    @Override
    public void stopMotor() {
        m_leftMotor.stopMotor();
        m_rightMotor.stopMotor();
  }

}
