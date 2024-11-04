# Learn about State Machine
When controlling the robot, it’s helpful to use the State Machine framework.  In this framework, every action is defined as a "state".  Actions of the robot are described as a series of states.

Watch these videos for good background info as well as how it can be executed in code:

[Part 1](https://youtu.be/Pu7PMN5NGkQ)

[Part 2](https://youtu.be/-J_m-FdO45c)

In essence, a state is a mode of operation, similar to human activities like eating.  The robot will be assigned a state, and while in that state it will perform certain actions.  Like when you eat, you put food in your mouth, chew, swallow, repeat.

These actions continue until an event occurs.  In response to the event the robot may perform a series of transitional actions and then enter a new state.  For instance, you eat until you’re full (the event), so you leave the table (transitional action) before washing the dishes (next state).

*Template of State Diagram*

<img width="500px" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/state_diagram.png"> </img>

## Apply the concepts

Look at the methods included in a Command object. 
- Go to your project from [Subsystems exercise](Subsystems.md). 
- Navigate to Commands directory and right click on that directory
- Select "New Command" from menu, give it a name a push enter

Notice a Command has the following methods:
- initialize
- execute
- isFinished
- end


Which methods map to these elements of a state machine?
- State actions?
- Exit conditions?
- Transitional actions?

