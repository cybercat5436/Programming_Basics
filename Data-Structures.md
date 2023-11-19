# Data Structures
A data structure is a storage that is used to store and organize data. 
It is a way of arranging data on a computer so that it can be accessed and updated efficiently.
Most essential and responsible for organizing, processing, accessing, and storing data efficiently.

## Types of Data Structures
Data Structures are divided based on how they are arranged in the memory
   1. Linear Data Structures
   2. Non-Linear Data Structures

### Linear Data Sturctures
Data elements are arranged sequentially or linearly, where each element is attached to its previous and next adjacent elements.
Examples: Arrays, Queue, Stack

### Non Linear Data Structures
Data structures where data elements are not placed sequentially or linearly are called non-linear data structures.
Examples: Trees, Graphs


![data_structures](https://github.com/cybercat5436/Programming_Basics/assets/45109886/0af6516c-dcc3-450f-b4bc-7f41110aafa0)

### Arrays
An array is a collection of homogenous data type.
A collection of items stored at contiguous memory locations.
Each item in an array is indexed starting with 0.

![Arrays](https://github.com/cybercat5436/Programming_Basics/assets/45109886/b5fe4b81-bc9c-40e3-b682-b759cf0a6fb3)

#### Array Declaration
```

/* Static Arrays are arrays that are declared before runtime
and are assigned values while writing the code.
*/

// The syntax of declaring a static array is:
<data type><variable name>[]
	= {<data1>, <data2>,…..<dataN> };

// Example:
int arr[] = { 2, 5, 6, 9, 7, 4, 3 };
```
![image](https://github.com/cybercat5436/Programming_Basics/assets/45109886/28889e7b-956b-436e-9263-0894f7d2d6ee)

#### Access the Array
Array is accessed by referring to index number
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```
#### Changing the Array Element
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs Opel instead of Volvo
```
#### Loop through the Array
1. Using 'for' loop
Example:
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}
```
2. Using 'for-each'
```
for (type variable : arrayname) {
  ...
}
```
Example:
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```
## Additional Reference
Here's a [video overview of arrays](https://www.youtube.com/watch?v=_Wf2rbL9wQU)


## Exercise
Now try it for yourself by completing [Arrays Exercise](https://docs.google.com/document/d/15Ps4BnD-urjVZorI1oveLwgEDByxW3ieHfgH0O0T7c8/edit#heading=h.jke94wk0hf44)

