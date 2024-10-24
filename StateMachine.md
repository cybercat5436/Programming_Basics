# Learn about State Machine
When controlling robot the robot, it’s helpful to use the State Machine framework.  In this framework, every action is defined as a "state".  Actions of the robot are described as a series of states.
Watch these videos for good background info as well as how it can be executed in code:

[Part 1](https://youtu.be/Pu7PMN5NGkQ)

[Part 2](https://youtu.be/-J_m-FdO45c)

[Part 3](https://youtu.be/cPgJ8bbBj_o)


In essence, a state is a mode of operation, similar to human activities like eating.  The robot will be assigned a state, and while in that state it will perform certain actions.  Like when you eat, you put food in your mouth, chew, swallow, repeat.

These actions continue until an event occurs.  In response to those events the robot may perform a series of transitional actions and then enter a new state.  For instance, you eat until you’re full (the event), so you leave the table (transitional action) before washing the dishes (next state).

*Template of State Diagram*

<img width="500px" src="https://github.com/cybercat5436/Programming_Basics/blob/main/assets/state_diagram.png"> </img>

## Apply the concepts

Can you apply the concept of Interfaces to State Machines?  If you were to design an Interface, what methods would you include in the contract?

Create the logic to invoke a state machine
What are the state actions?
What are the exit conditions?
What are the transitional actions?
What is the next state?
