# Commands
A **command** is an encapsulation/behaviour of the action that the robot can perform.
Commands are apowerful way to structure the robots behaviour.
Commands can range from simple actions, like moving a motor for a set time, to complex sequences involving multiple subsystems.
## States of a Command
* initialize: called when first scheduled, This is where you can set up any necessary parameters or states.
* execute: runs repeatedly, main logic of the command occurs, such as controlling motors or sensors.
* end: Typically called when the command is finished, clean up actions.
* isFinished: exit conditions check, to check whether the command has completed the task, if 'true' command is removed from the scheduler.
## Command Scheduler
* Manages the execution of the commands, life cycle of the commands(initialize, execute, end).
* Resource allocation.
* Ensures safe execution of the subsytems.
* Commands prioritization.
* Handling the command interruption.
<br> <img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/scheduler.png"><br>
## Types of Commands
* Instant Command
* Wait command
* SwerveControllerCommand
* PIDCommand  
## Command composition
Ability to chain multiple commnads to accomplish complex tasks, allowing modularity and reusabality of the code.
* Sequential commands
* Parallel commands  
   
## Exercise: Create a Command Class to control the position of the Arm
### Define a subsytem [ArmSubsystem](https://github.com/cybercat5436/Programming_Basics/edit/main/Subsystems.md)
1) Add a position instance variable to the subsystem(arm).
   <br> <img width="500" alt="Arm Position" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/arm-pos.png"><br>   
2) Add a member functions(setter and getter functions) to set and get the position of the arm.  
   <br> <img width="500" alt="Arm Position Set Get" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/arm-set-get.png"><br>   
### Create a Command class
1) Open project from Simulation section
2) Right-click on subsystems directory and select "Create a new class/commnad"
   <br> <img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/1.png"><br>  
3) Select Command from the menu and type in a name for the command (e.g. "ArmPrint") and press enter 
4) Create an instance of subsytem(Use the same subsystem(e.g. Arm)[ArmSubsystem](https://github.com/cybercat5436/Programming_Basics/edit/main/Subsystems.md),
   and add it to the command using addRequirements()
   Backgorund:
   * Command requires access to the subsystem which is intended to be controlled, add the subsytem(s)
   * Command can access multiple subsystems, but only one command can be active at the given time.
   * The addRequirements method plays a crucial role in managing resource usage and ensuring safe access to subsystems.
   * addRequirements(), is typically called in the consructor of the command.
   <br> <img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/commands_2.png"><br>   
5) Set the postion of the arm in the execute() and access the postion variable using getPostion().
   <br> <img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/command-set-pos.png"><br>   
### Bind the command
Typically in command-based-programming, commands are essentially bound to controller or joystick
**defining a subsytem -> creating a command -> binding to controller input**
In this Example, for simulation purposes 'Default' command is set on arm subsystem.
**Default commands**: are commands that run continuously for a given subsystem unless interrupted by another command.
Default commands are typically set within the subsystem itself, allowing for automatic and appropriate behavior without explicit scheduling in the robot code.
Use cases: Drive train
1) Add Arm subsysytem instance variable in 'RobotContainer'.
2) Instantiate the subsystem, and set 'Default' command on Arm subsystem in the constructor.
<br> <img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/rc-arm-default-command.png"><br>
### Simulate
Simulate the robot code
Choose the 'Teleoperated' option in the GUI
<br> <img width="500" alt="Simulation-GUI" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/simualtion-GUI.png"><br>
Observe the print statements
<br> <img width="500" alt="Simulation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/simulation.png"><br>

### References
[Commands in detail](https://docs.wpilib.org/en/stable/docs/software/commandbased/commands.html)
<br>[command scheduler](https://docs.wpilib.org/en/stable/docs/software/commandbased/command-scheduler.html)
<br>[Types of Commands](https://docs.wpilib.org/en/stable/docs/software/commandbased/commands.html#included-command-types)
<br>[setter and getter in java](https://www.codejava.net/coding/java-getter-and-setter-tutorial-from-basics-to-best-practices)
<br>[Command Composition](https://docs.wpilib.org/en/stable/docs/software/commandbased/command-compositions.html)<br>




