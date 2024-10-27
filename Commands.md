# Commands
A **command** is an encapsulation/behaviour of the action that the robot can perform.
Commands are apowerful way to structure the robots behaviour.
Commands can range from simple actions, like moving a motor for a set time, to complex sequences involving multiple subsystems.
[Commands in detail](https://docs.wpilib.org/en/stable/docs/software/commandbased/commands.html)

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

[command scheduler](https://docs.wpilib.org/en/stable/docs/software/commandbased/command-scheduler.html)

## Types of Commands
* Instant Command
* Wait command
* SwerveControllerCommand
* PIDCommand
  [Types of Commands](https://docs.wpilib.org/en/stable/docs/software/commandbased/commands.html#included-command-types)

## Command composition
Ability to chain multiple commnads to accomplish complex tasks, allowing modularity and reusabality of the code.
* Sequential commands
* Parallel commands
  [Command Composition](https://docs.wpilib.org/en/stable/docs/software/commandbased/command-compositions.html)




## Exercise
### Create the Command Class
**Pre Requisite**
<br>The following exercise must be completed, before attempting this.<br>
[ArmSubsystem](https://github.com/cybercat5436/Programming_Basics/edit/main/Subsystems.md)
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

