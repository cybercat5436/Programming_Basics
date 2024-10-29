# Subsystems
Robot functions are broken into subsystems.  Subsystems vary based on the game objectives, but they typically include:
- Chassis
- Intake
- Climber
- Launcher

In programing, subsystems serve as abstractions to encapsulate system information and behavior such as:
- Motors
- Sensors
- Control methods (e.g. startIntake)
- Physical limitations & tunings (e.g. speeds, PID constants, target positions)
- Dashboard info and controls

Within WPILib, there is a Command Scheduler that orchestrates when actions are performed by the subsystems.  In order 

## Exercise
### Create the Subsystem Class
1) Open project from Simulation section
1) Right-click on subsystems directory and select "Create a new class/commnad"
1) Select Subsystem from the menu and type in a name for the subsystem (e.g. "Arm") and press enter
1) Add a print statement to the periodic method
   <br> <img width="500" alt="Instantiation in constructor" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/sub1.png"><br>

### Instantiate the Subsystem
1) Create an instance variable for the new subsystem.  Note, you need to import the subsystem, hover over the class name and from the Quick Fix... menu select "Import {classname}"
  <br> <img width="500" alt="Instantiation" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/rc1.png"><br>
1) In the constructor of RobotContainer, instantiate the Subsystem
   <br> <img width="500" alt="Instantiation in constructor" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/rc2.png"><br>
  

### Run Simulation
1) Simulate the robot code and observe the print statements
   <br> <img width="500" alt="Output Subsystem" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/sub_out.png"><br>

Reference:
[docs](https://docs.wpilib.org/en/stable/docs/software/commandbased/subsystems.html)
