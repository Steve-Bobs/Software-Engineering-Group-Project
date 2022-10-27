## [Link for our shared word file](https://docs.google.com/document/d/1WwBw4EI2TgA7Qqrq7vCVtTq-tQTIGLt5jtCos7pwu0Q/edit?usp=sharing)


## [Research File](https://docs.google.com/document/d/19b5j6745Gz-Npo_mM9cbXDgvNdeRu-IEHAIWFK8I0Cs/edit)

## Use Case Diagram
![image](https://user-images.githubusercontent.com/114183307/198175536-63c793df-9fa4-4f12-b72a-0ac8b18f6028.png)

## Name: Solicit Point Total and Course of Action from Users

Identifier: 1

Description:
The system asks the attacker and defender to enter a point total, and an action that they want to take. 

Precondition:
The program should have started. Both users are ready to provide input. 

Postcondition:
The system now has decisions to execute for the attacker and the defender. 

Basic Course of Action:

Attacker enters point total and decision

Defender enters point total and decision

Information entered is passed to the system. 


## Name: Process Actions

Identifier: 2

Description:
The system processes the attacker and defender point totals and actions to determine a winner.

Precondition:
Both users have provided input for point total and actions to take. 

Postcondition:
The system now determines the actions to execute for the attacker and the defender. 

Basic Course of Action:

System accepts attacker point total and decision
System accepts defender point total and decision
Information is used to determine action to perform 


## Name: Sending results to module

Identifier: 3


Description: This is where results from the actions are recorded and sent into the module 
tracking or records keeping.


Precondition: In order to send results to the module, an action needs to be performed
and the results of the action should be kept.


Postcondition: After sending results to module, the overall results on the module is 
updated.

Basic Course of Action:

 System finds and calculate results
 System sends results to the module
 System updates modules


## Name: Update the results in the module - Artemii

Identifier: 4


Description:
If this is not the first iteration of asking for the point input, then the scores must be updated with their previous history in mind. Thus, the system must update the values for the attacker side, for the defender side, and update the total points for the game overall.


Precondition:
The system has executed at least 0 times, with the already existing outside/passed variables of defenders side, attackers side, and the overall score.

Postcondition:
The point system for both sides will be updated and started if none exists.

Basic Course of Action:

 The additional points will be added onto the defenders score.
 The additional points will be added onto the attackers score.
 Based on the chosen move, the overall points will mirror the current economy.



## Name: Return values to main runner program

Identifier: 5


Description:
The updated status of each module will be passed back to the main runner program so that the main runner program can report necessary statistics to the users. 

Precondition:
The attacker module, game state, and defender module are updated. 

Postcondition:
The main runner program should have necessary information to report to the user. 

Basic Course of Action:

Call the attacker module, get the information that is important to report back, and
Report it back to the runner program
Call the defender module, get important info, and then report it back to the runner
program


## Name: Display Results to User

Identifier: 6

Description:
The system displays the results to the attacker and defender.

Precondition:
The system has received the results of the actions made by the attacker and defender.

Postcondition:
The users now have seen the results of the decisions made in step 1.

Basic Course of Action:

System displays results to attacker
System displays results to defender 
Name: Write results to file

## Identifier: 7


Description: At this level, the obtained results are written into an external file.


Precondition: For precondition, values are returned and results are displayed to the user.


Postcondition: For postcondition, results could be read from the external file

Basic Course of Action:

Read and write results to the external file
 System keeps track of all obtained results in the external file




















