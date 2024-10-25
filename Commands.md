# Commands
Commands control the subsystems




## Exercise
### Create the Command Class
1) Open project from Simulation section
2) Right-click on subsystems directory and select "Create a new class/commnad"
   <br> <img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/1.png"><br> 
3) Select Command from the menu and type in a name for the command (e.g. "ArmPrint") and press enter 
4) Create an instance of subsytem(Use the same subsystem(e.g. Arm)[ArmSubsystem](https://github.com/cybercat5436/Programming_Basics/edit/main/Subsystems),
   and add it to the command using addRequirements()
   Backgorund:
   * Command requires access to the subsystem which is intended to be controlled, add the subsytem(s)
   * Command can access multiple subsystems, but only one command can be active at the given time.
   * The addRequirements method plays a crucial role in managing resource usage and ensuring safe access to subsystems.
   * addRequirements(), is typically called in the consructor of the command.

<br> <img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/2.png"><br>

