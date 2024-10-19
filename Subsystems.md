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

Reference:
[https://docs.wpilib.org/en/stable/docs/software/commandbased/subsystems.html](WPILib Docs)
