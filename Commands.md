# Commands
Prerequisite: [Subsystems Exercise](Subsystems.md)

A **Command** represents an action that the robot can perform.
- Commands are a powerful way to structure robot behaviour.
- Commands can range from simple actions, like moving a motor for a set time, to complex sequences involving multiple subsystems.
- Commands are an implementation of [State Machine](https://github.com/cybercat5436/Programming_Basics/blob/main/StateMachine.md) architecture 
## Methods of a Command
A command is a special class in WPILib which must contain the following methods:
* initialize: called **once** when first scheduled, This is where you can set up any necessary parameters or states.
* execute: runs **repeatedly** (once per cycle), main logic of the command occurs, such as controlling motors or sensors.
* isFinished: checks **repeatedly** (once per cycle) if exit conditions are met, if 'true' command is removed from the scheduler.
* end: called **once** before the command is removed from schedule (isfinished==true or interrupted), performs transitional actions before entering next state.

## Command Scheduler
The Command Scheduler is a core utility in WPILib which orchestrates activity amongst subsystems.
* Manages the execution of the commands, life cycle of the commands(initialize, execute, end).
* Allocates only 1 running command per subsystem. Commands must register subsystems to utilize this functionality. 
* Ensures safe execution of the subsytems - by default, commands can't execute unless robot is active
* Prioritizes Command execution - Commands can be **interrupted** if a higher priority command is scheduled

<br> <img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/scheduler.png"><br>

## Types of Commands
WPILib contains various types of Commands to achieve specific functionality. There are also helpful shortcuts available for implementing common tasks.  Heres a shortlist of Command types that are used frequently in Cyber Cat code base:
* Instant Command
* Wait command
* Sequential commands
* Parallel commands 

After you complete the following exercise, check out the refernece material at the end of this document to explore these Command types. 


## Exercise: Create a Command Class to control the position of the Arm
**Background:**
  Commands: 
   * Command requires access to the subsystem which is intended to be controlled, add the subsytem(s)
   * Command can access multiple subsystems, but only one command can be active at the given time.
   * The addRequirements method plays a crucial role in managing resource usage and ensuring safe access to subsystems.
   * addRequirements(), is typically called in the consructor of the command.
  Bind the commands:
   Typically in command-based-programming, commands are essentially bound to controller or joystick
   **defining a subsytem -> creating a command -> binding to controller input**
   In this Example, for simulation purposes 'Default' command is set on arm subsystem.
   **Default commands**: are commands that run continuously for a given subsystem unless interrupted by another command.
   Default commands allows for automatic and appropriate behavior without explicit scheduling in the robot code.
   Use cases: Drive train

### Start with project from [Subsystem Exercise](Subsystems.md)
1) Add a position instance variable to the subsystem(arm).
<br><img width="500" alt="Arm Position" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/arm-pos.png"><br>   
2) Add a member functions(setter and getter functions) to set and get the position of the arm.  
<br><img width="500" alt="Arm Position Set Get" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/arm-set-get.png"><br>   
### Create a Command class
1) Open project from Simulation section
2) Right-click on subsystems directory and select "Create a new class/commnad"
<br> <img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/1.png"><br>  
3) Select Command from the menu and type in a name for the command (e.g. "ArmPrint") and press enter 
4) Create an instance of subsytem(Use the same subsystem(e.g. Arm)[ArmSubsystem](https://github.com/cybercat5436/Programming_Basics/edit/main/Subsystems.md),
   and add it to the command using addRequirements()
<br><img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/commands_2.png"><br>   
5) Set the postion of the arm in the execute() and access the postion variable using getPostion().
<br><img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/command-set-pos.png"><br>   
### Bind the command
1) Add Arm subsysytem instance variable in 'RobotContainer'.
2) Instantiate the subsystem, and set 'Default' command on Arm subsystem in the constructor.
<br> <img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/rc-arm-default-command.png"><br>
### Run Simulation
Simulate the robot code
Choose the 'Teleoperated' option in the GUI
<br> <img width="500" alt="Simulation-GUI" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/simualtion-GUI.png"><br>
Observe the print statements
<br> <img width="500" alt="Simulation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/simulation.png"><br>
### References
* [Commands in detail](https://docs.wpilib.org/en/stable/docs/software/commandbased/commands.html)
* [command scheduler](https://docs.wpilib.org/en/stable/docs/software/commandbased/command-scheduler.html)
* [Types of Commands](https://docs.wpilib.org/en/stable/docs/software/commandbased/commands.html#included-command-types)
* [setter and getter in java](https://www.codejava.net/coding/java-getter-and-setter-tutorial-from-basics-to-best-practices)
* [Command Composition](https://docs.wpilib.org/en/stable/docs/software/commandbased/command-compositions.html)<br>




