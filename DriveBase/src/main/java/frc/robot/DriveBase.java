// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** Add your docs here. */
public class DriveBase {
      //Instance variables
      private final double kDefaultDeadband = 0.02;
      private final double kDefaultMaxOutput = 1.0;
    
      protected double m_deadband = kDefaultDeadband;
      protected double m_maxOutput = kDefaultMaxOutput;
    
      //Constructor to instantiate objects of the class
      public DriveBase(double deadband, double maxOutput){
        System.out.println("Constructor of drivetrain");
        this.m_deadband = deadband; 
        this.m_maxOutput = maxOutput;
    
      }
    
      //Class method to set the private member variable
      public void setDeadband(double deadband) {
        System.out.println("Set Deadband");
        m_deadband = deadband;
      }
    
      //Class method to set the private member variable
      public void setMaxOutput(double maxOutput) {
        System.out.println("Set Maxoutput");
        m_maxOutput = maxOutput;
      }
    
      //Class method to access the 'Private' instance variable(getter)
      public double getDeadBand(){
        return m_deadband;
      }
    
      //Class method to access the 'Private' instance variable(getter)
      public double getMaxOutput(){
        return m_maxOutput;
      }
}
