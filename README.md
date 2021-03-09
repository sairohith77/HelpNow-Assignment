# HelpNow-Assignment
This coding exercise involves designing a Smart Card System for a gaming zone. You have to implement a ‘Gaming Card System’ for business “FunFactory”.

Concepts used in this project:
Inheritance, Abstract Classes, Polymorphism, Control Structures, Exception handling along with user-defined (Customized) Exceptions.

Problem Statement:

Assume that there is a single gaming zone line covering 10 gaming platforms linearly.
The games are laid down by the following names: G1, G2, G3, G4, G5, G6, G7, G8, G9, G10
. The use of the games can be in any direction(G1 to G10 or G10 to G1 but in linear
fashion only , cannot jump to any platform randomly).
Customers have gaming cards that behave just like any regular debit card that has an
initial balance when purchased. Customers swipe-in when they use a gaming platform
and swipe-out when they exit. The gaming card balance is automatically updated at
swipe-out.
The objective of the exercise is to create an automated system that has the following
functionalities:
The gaming card should have a minimum balance of Rs 10 at swipe-in. At swipe-out, the
system should calculate the fee based on the below strategies set at the start of the day.
The fee must be deducted from the card (card balance can not be negative).
You can add more amount in card, it will be added in existing balance.
The card should have a sufficient balance otherwise user should NOT be able to exit.
Weekday – Rs. 10 (per game) Weekend – Rs. 20 (per game played on Saturday or
Sunday)


Procedure Followed:

1. User should have a minimum balance of Rs.10 during entry, if less than Rs.10, then the system needs to ask if he wishes to deposit the amount, and at the end should generate a
summary report.
2. If user has exactly Rs.10 and below Rs.20, then the user's game must be played on weekdays (As weekday's cost is Rs.10), At the end, the system should ask if he wants to deposit
money, if the user entered "yes", the system should generate a summary report which consists of initial current balance, deposited amount and remaining balance. If the user enters "No",
the program should terminate printing a "Thank you" message.
3. If user has greater than or equal to Rs.20, then the system should ask on which day the user wants to play, that is either on weekday or weekend. Depending on that, the amount
should be deducted, Rs.20 on weekend and Rs.10 on weekdays and at the end, a summary report must be generated.
4. If user's balance is negative in number, an exception will be thrown and the program terminates printing "Negative Balance" message.
5. If user enters characters in place of numbers as an input for current balance, the program should throw an exception printing "only numbers, not characters" message.
6. After completion of one game, the program needs to ask if he wants to quit and if user types number 0, the program should terminate and if he presses any number other than
0, the game should begin again.

These are the crux points of the procedure followed, For better understanding, refer code of this project.
