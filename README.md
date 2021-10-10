# Next highest number
***
### Description

This repository is a Java utility project to find the next highest number using the same digits of a given input number.

### Files

- [Main.java](src/Main.java)- Driver class to get the input from the user and print the output to the console.
- [NextHigherNum.java](src/NextHigherNum.java) - Implementation logic for finding the next higher number.
- [utils\NumberUtils](src/utils/NumberUtils.java) - Helper class for number swap and user input conversion.
- [TestNextHigherNum.java](src/TestNextHigherNum.java)` - Test class for implementation logic.

### Setup

##### From the command prompt navigate to src and run below command to compile the classes
- ``` javac Main.java NextHigherNum.java utils/NumberUtils TestNextHigherNum.java``` 
##### From the command prompt navigate to src and run below command to run the classes
- ``` java Main```
##### From the command prompt navigate to src and run below command to run the test cases
- ``` java TestNextHigherNum```

### Usage

Once executed, the program displays user with a descriptive message about it and prompts the user to enter the number.
If the next higher number can be found it displays the number, else it displays the message "Already highest". 
User can exit from it by entering 0. 
 

Command : ```java Main```  
Output:  
``` 
Program to display the next higher number using the same digits of given input number.
Please enter a number:
123
Next higher with same digit :
132
Please enter a number:
5467
Next higher with same digit :
5476
Please enter a number:
876
Already highest
Please enter a number:
0
Completed 
```

#### Improvement
- The code considers input greater than 0
- Current performance of the code is ```o(nlogn)```. This should improve to ```o(n)``` 
- Due to integer array the length is restricted to ```Integer.MAX_VALUE```. Long can be used as one approach to increase the capacity.
- Test Cases to be updated for user input
