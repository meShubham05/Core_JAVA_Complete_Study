package Leet_Code_Questions;

public class Question_Set {

	/*__
	 _____________________________________________________________________
	 
	Code Chef Practice Assignment

	Problem Statement First 

	Chef has to travel to another place. For this, he can avail any one of two cab services.
	•	The first cab service charges XX rupees.
	•	The second cab service charges YY rupees.
	Chef wants to spend the minimum amount of money. Which cab service should Chef take?
	Input Format
	•	The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
	Output Format
	For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.
	You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).
	Constraints
	1<=T<=100
	1<X<Y<=100
	Sample 1:
	Input	Output:
	3
	30 65        First 
	42 42        Any
	90  50        Second
	Explanation:
	Test case 11: The first cab service is cheaper than the second cab service.
	Test case 22: Both the cab services have the same price.
	Test case 33: The second cab service is cheaper than the first cab service.

	Problem Statement Second
	
	Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote increases the volume by 1 while pressing the volume down button decreases the volume by 1. Chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.
	Input Format
	•	The first line contains a single integer TT - the number of test cases. Then the test cases follow.
	•	The first and only line of each test case contains two integers XX and YY - the initial volume and final volume of the TV.
	•	
	Output Format
	For each test case, output the minimum number of times Chef has to press a button to change the volume from XX to YY.
	Constraints 
	1<=T <=100
	1<=X<=Y<=100

	Sample1

	Input		Output
	2
	50 54 		4
	12 10		2

	Explanation:
	Test Case 1: Chef can press the volume up button 4 times to increase the volume from 50 to 54.
	Test Case 2: Chef can press the volume down button  2 times to decrease the volume from 12 to 10.

	Problem Statement 3
	Problem
	Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
	Calculate Pooja's account balance after an attempted transaction.
	Input
	Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
	Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
	Output
	Output the account balance after the attempted transaction, given as a number with two digits of precision. If there is not enough money in the account to complete the transaction, output the current bank balance.
	Example - Successful Transaction
	Input:
	30 120.00
	Output:
	89.50
	Example - Incorrect Withdrawal Amount (not multiple of 5)
	Input:
	42 120.00
	Output:
	120.00
	Example - Insufficient Funds
	Input:
	300 120.00
	Output:
	120.00

	Example4
	Problem
	Ezio can manipulate at most XX number of guards with the apple of Eden.
	Given that there are YY number of guards, predict if he can safely manipulate all of them.
	Input Format
	First line will contain TT, number of test cases. Then the test cases follow.
	Each test case contains of a single line of input, two integers XX and YY.
	Output Format
	For each test case, print text {YES} YES if it is possible for Ezio to manipulate all the guards. Otherwise, print  text {NO} NO.

	You may print each character of the string in uppercase or lowercase 
	(For example, the strings text {Yes} YeS, text {yEs} yEs, \text {yes}yes and \text {YES}YES will all be treated as identical).

	Constraints
	1<=T<=100
	1<=X<=Y

	Sample1
	_______________
	Input				Output
	 3
	5    7				NO
	6    6				YES
	9    1				YES

	Explanation:
	Test Case 11: Ezio can manipulate at most 55 guards. Since there are 77 guards, he cannot manipulate all of them.

	Test Case 22: Ezio can manipulate at most 66 guards. Since there are 66 guards, he can manipulate all of them.

	Test Case 33: Ezio can manipulate at most 99 guards. Since there is only 11 guard, he can manipulate the guard.

	Assignment5
	Problem
	To access CRED programs, one needs to have a credit score of 750750 or more.
	Given that the present credit score is XX, determine if one can access CRED programs or not.
	If it is possible to access CRED programs, output \text{YES}YES, otherwise output \text{NO}NO.
	Input Format
	The first and only line of input contains a single integer XX, the credit score.
	Output Format
	Print text{YES}YES if it is possible to access CRED programs. Otherwise, print \text{NO}NO.
	You may print each character of the string in uppercase or lowercase (for example, the strings text{YeS}YeS, \texttt{yEs}yEs, \texttt{yes}yes and \texttt{YES}YES will all be treated as identical).

	Constraints
	0<=X<=1000

	Subtasks
	•	Subtask 1 (100 points): Original constraints.
	Sample1
	Input					Output
	823					YES

	Explanation:
	Since 823 > 750 , it is possible to access CRED programs.

	Sample2
	Input					Output
	251					No

	Explanation
	Since 251 < 750	  it is not possible to access CRED Programs

	Assignment 6
	Problem
	There is a group of NN friends who wish to enroll in a course together. The course has a maximum capacity of MM students that can register for it. If there are KK other students who have already enrolled in the course, determine if it will still be possible for all the NN friends to do so or not.
	Input Format
	•	The first line contains a single integer TT - the number of test cases. Then the test cases follow.
	•	Each test case consists of a single line containing three integers NN, MM and KK - the size of the friend group, the capacity of the course and the number of students already registered for the course.
	•	Output Format
	•	For each test case, output Yes if it will be possible for all the NN friends to register for the course. Otherwise output No.
	•	You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical).

	Constraints
	1<=N<=M <=100
	0<=K<=M
	Sample1
	Input				Output
	2	50	27		Yes	
	5	40	38		NO
	100	100	0		Yes

	Explanation:
	Test Case 1: The 22 friends can enroll in the course as it has enough seats to accommodate them and the  27  other students at the same time.

	Test Case 2: The course does not have enough seats to accommodate the 55 friends and the 3838 other students at the same time.

	Assignment 7

	A study has shown that playing a musical instrument helps in increasing one's IQ by 77 points. Chef knows he can't beat Einstein in physics, but he wants to try to beat him in an IQ competition.
	You know that Einstein had an IQ of 170170, and Chef currently has an IQ of XX.
	Determine if, after learning to play a musical instrument, Chef's IQ will become strictly greater than Einstein's.
	Print "Yes" if it is possible for Chef to beat Einstein, else print "No" (without quotes).
	You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).
	Input Format
	•	The first and only line of input will contain a single integer XX, the current IQ of Chef.

	Output Format
	•	For each testcase, output in a single line "Yes" or "No"
	•	You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).

	Constraints
	100<=X<=169

	Sample1
	Input			Output
	165			Yes

	Explanation
	After learning a musical instrument, Chef's final IQ will be 165+7=172. Since 172 >= 170 Chef can beat Einstein.
	Sample2
	Input			Output
	120			No

	Explanation:
	After learning a musical instrument, Chef's final IQ will be 120+7=127120+7=127. Since 127    127<170, Chef cannot beat Einstein.



	Example8
	_____________________________________________________________________
	Write a C program to check whether an alphabet is vowel or consonant using if else. How to check vowels and consonants using if else in C programming. C Program to input a character from user and check whether it is vowel or consonant. Logic to check vowel or consonant in C programming.
	Example
	Input
	Input character: a
	Output
	'a' is vowel

	Example9
	____________________________________________________________________________
	Write a C program to check whether a triangle is valid or not if angles are given using if else. How to check whether a triangle can be formed or not, if its angles are given using if else in C programming. Logic to check triangle validity if angles are given in C program.
	Example
	Input 
	Input first angle: 60
	Input second angle: 30
	Input third angle: 90
	Output
	The triangle is valid
	Example10
	___________________________________________________________________
	Write a C program to input sides of a triangle and check whether a triangle is equilateral, scalene or isosceles triangle using if else. How to check whether a triangle is equilateral, scalene or isosceles triangle in C programming. Logic to classify triangles as equilateral, scalene or isosceles triangle if sides are given in C program.
	Example
	Input
	Input first side: 30
	Input second side: 30
	Input third side: 30
	Output
	Triangle is equilateral triangle

	Example11:
	___________________________________________________________________________
	Write a C Program to input two angles from user and find third angle of the triangle. How to find all angles of a triangle if two angles are given by user using C programming. C program to calculate the third angle of a triangle if two angles are given.
	ExampleInput
	Enter first angle: 60
	Enter second angle: 80
	Output
	Third angle = 40




	Example12
	________________________________________________________________________
	Write a C program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in C programming. Logic to find roots of quadratic equation in C programming.
	Example
	Input
	Input a: 8
	Input b: -4
	Input c: -2
	Output
	Root1: 0.80
	Root2: -0.30

	Example13
	____________________________________________________________
	Write a C program to input electricity unit charge and calculate the total electricity bill according to the given condition:
	For first 50 units Rs. 0.50/unit
	For next 100 units Rs. 0.75/unit
	For next 100 units Rs. 1.20/unit
	For unit above 250 Rs. 1.50/unit
	An additional surcharge of 20% is added to the bill.
	How to calculate electricity bill using if else in C programming. Program to find electricity bill using if else in C. Logic to find net electricity bill in C program.
	Example14
	Write a C program to input principle, time and rate (P, T, R) from user and find Simple Interest. How to calculate simple interest in C programming. Logic to find simple interest in C program.

	Example
	Input
	Enter principle: 1200
	Enter time: 2
	Enter rate: 5.4
	Output
	Simple Interest = 129.600006

	Simple Interest formula
	 
	where
	 P is the principle amount
	 T is the time 
	R is the rate

	Example 15
	__________________________________________________________________________
	Write a C program to input principle (amount), time and rate (P, T, R) and find Compound Interest. How to calculate compound interest in C programming. Logic to calculate compound interest in C program.
	Example
	Input
	Enter principle (amount): 1200
	Enter time: 2
	Enter rate: 5.4
	Output
	Compound Interest = 1333.099243
	Compound Interest formula
	Formula to calculate compound interest annually is given by.
	 
	Where,
	P is principle amount
	R is the rate and
	T is the time span
	Example16:
	________________________________________________________________________
	Write a C program to input week number(1-7) and print day of week name using switch case. C program to find week day name using switch case. How to find day name of week using switch case in C programming.
	Example
	Input
	Input week number(1-7): 2
	Output
	Tuesday

	Example 17
	_________________________________________________________________
	Write a C program to input month number and print total number of days in month using switch...case. C program to find total number of days in a month using switch...case. Logic to print number of days in a month using switch...case in C programming.
	Example
	Input
	Input month number: 3
	Output
	Total number of days = 31

	Example18
	___________________________________________________________________
	An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
	•	1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
	•	2nd data, Total number of wheels = W
	The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
	Example :
	Input :
	•	200  -> Value of V
	•	540   -> Value of W
	Output :
	•	TW =130 FW=70 
	Explanation:
	130+70 = 200 vehicles
	(70*4)+(130*2)= 540 wheels
	Constraints :
	•	2<=W
	•	W%2=0
	•	V<W
	Print “INVALID INPUT” , if inputs did not meet the constraints.
	The input format for testing 
	The candidate has to write the code to accept two positive numbers separated by a new line.
	•	First Input line – Accept value of V.
	•	Second Input line- Accept value for W.
	 
	Example19
	_______________________________________________________________________
	There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR is never remain empty as when last k candies are left. JAR if refilled with new candies in such a way that JAR get full.
	Write a code to implement above scenario. Display JAR at counter with available number of candies. Input should be the number of candies one customer can order at point of time. Update the JAR after each purchase and display JAR at Counter.
	Output should give number of Candies sold and updated number of Candies in JAR.
	If Input is more than candies in JAR, return: “INVALID INPUT”
	Given,   
	N=10, where N is NUMBER OF CANDIES AVAILABLE
	K =< 5, where k is number of minimum candies that must be inside JAR ever.
	Example 1:(N = 10, k =< 5)
	•	Input Value
	o	3
	•	Output Value
	o	NUMBER OF CANDIES SOLD : 3
	o	NUMBER OF CANDIES AVAILABLE : 7
	Example : (N=10, k<=5)
	•	Input Value
	o	0
	•	Output Value
	o	INVALID INPUT
	o	NUMBER OF CANDIES LEFT : 10

	Example20
	____________________________________________________________________________
	A washing machine works on the principle of Fuzzy System, the weight of clothes put inside it for washing is uncertain 
	But based on weight measured by sensors, 
	it decides time and water level which can be changed by menus given on the machine control area.  
	For low level water, the time estimate is 25 minutes, 
	where approximately weight is between 2000 grams or any nonzero positive number below that.
	For medium level water, the time estimate is 35 minutes, 
	where approximately weight is between 2001 grams and 4000 grams.
	For high level water, the time estimate is 45 minutes, 
	where approximately weight is above 4000 grams.
	Assume the capacity of machine is maximum 7000 grams
	Where approximately weight is zero, time estimate is 0 minutes.
	Write a function which takes a numeric weight in the range [0,7000] as input 
	and produces estimated time as output is: “OVERLOADED”, 
	and for all other inputs, the output statement is
	“INVALID INPUT”.
	Input should be in the form of integer value –
	Output must have the following format –
	Time Estimated: Minutes

	Example:
	•	Input value
	2000
	•	Output value
	Time Estimated: 25 minutes
	Example21
	__________________________________________________________________________
	There are total n number of Monkeys sitting on the branches of a huge Tree. As travelers offer Bananas and Peanuts, the Monkeys jump down the Tree. If every Monkey can eat k Bananas and j Peanuts. If total m number of Bananas and p number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to eat.
	At a time one Monkeys gets down and finishes eating and go to the other side of the road. The Monkey who climbed down does not climb up again after eating until the other Monkeys finish eating.
	Monkey can either eat k Bananas or j Peanuts. If for last Monkey there are less than k Bananas left on the ground or less than j Peanuts left on the ground, only that Monkey can eat Bananas(<k) along with the Peanuts(<j).
	Write code to take inputs as n, m, p, k, j and return  the number of Monkeys left on the Tree.
	    Where, n= Total no of Monkeys
	        k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
	        j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
	        m = Total number of Bananas
	        p  = Total number of Peanuts
	Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero
	Example :
	Input Values    
	20
	2
	3
	12
	12
	Output Values
	Number of Monkeys left on the tree:10

	Example22
	__________________________________________________________________________
	Checking if a given year is leap year or not
	Explanation:
	To check whether a year is leap or not
	Step 1:
	•	We first divide the year by 4.
	•	If it is not divisible by 4 then it is not a leap year.
	•	If it is divisible by 4 leaving remainder 0 
	Step 2:
	•	We divide the year by 100
	•	If it is not divisible by 100 then it is a leap year.
	•	If it is divisible by 100 leaving remainder 0
	Step 3:
	•	We divide the year by 400
	•	If it is not divisible by 400 then it is a leap year.
	•	If it is divisible by 400 leaving remainder 0 



	Example23
	_______________________________________________________________________
	A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).
	Note :
	RxC- Size of the matrix
	Elements of the matrix M should be only 0 or 1.
	Example 1:
	Input :
	3   -> Value of R(row)
	3    -> value of C(column)
	[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
	Output :
	3  -> Row 3 has maximum number of 1’s

	Example 2:
	input :
	4 -> Value of R(row)
	3 -> Value of C(column)
	[0 1 0 1 1 0 1 0 1 1 1 1] -> Elements of the array M[R][C]
	Output :
	4  -> Row 4 has maximum number of 1’s

	Example24
	________________________________________________________________________________
	Problem Statement
	We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
	Take input as
	1. Number of Interior walls
	2. Number of Exterior walls
	3. Surface Area of each Interior 4. Wall in units of square feet
	Surface Area of each Exterior Wall in units of square feet

	If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.
	Calculate and display the total cost of painting the property
	Example 1:
	6
	3
	12.3
	15.2
	12.3
	15.2
	12.3
	15.2
	10.10
	10.10
	10.00
	Total estimated Cost : 1847.4 INR
	Note: Follow in input and output format as given in above example
	Solution

	Example25
	____________________________________________________________________________
	There are total n number of Monkeys sitting on the branches of a huge Tree. As travelers offer Bananas and Peanuts, the Monkeys jump down the Tree. If every Monkey can eat k Bananas and j Peanuts. If total m number of Bananas and p number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to eat.
	At a time one Monkeys gets down and finishes eating and go to the other side of the road. The Monkey who climbed down does not climb up again after eating until the other Monkeys finish eating.
	Monkey can either eat k Bananas or j Peanuts. If for last Monkey there are less than k Bananas left on the ground or less than j Peanuts left on the ground, only that Monkey can eat Bananas(<k) along with the Peanuts(<j).
	Write code to take inputs as n, m, p, k, j and return  the number of Monkeys left on the Tree.
	    Where, n= Total no of Monkeys
	        k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
	        j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
	        m = Total number of Bananas
	        p  = Total number of Peanuts
	Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero
	Example 1:
	Input Values    
	20
	2
	3
	12
	12
	Output Values
	Number of  Monkeys left on the tree:10

	Note: Kindly follow  the order of inputs as n,k,j,m,p as given in the above example. And output must include  the same format  as in above example(Number of Monkeys left on the Tree:)
	For any wrong input display INVALID INPUT
	Question 4
	Find the 15th term of the series?
	0,0,7,6,14,12,21,18, 28
	Explanation : In this series the odd term is increment of 7 {0, 7, 14, 21, 28, 35 – – – – – – }
	                        And even term is a increment of 6 {0, 6, 12, 18, 24, 30 – – – – – – }


	Example26
	_________________________________________________________________________
	Consider the following series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …
	This series is a mixture of 2 series – all the odd terms in this series form a geometric series and all the even terms form yet another geometric series. Write a program to find the Nth term in the series.
	The value N in a positive integer that should be read from STDIN. The Nth term that is calculated by the program should be written to STDOUT. Other than value of n th term,no other character / string or message should be written to STDOUT. For example , if N=16, the 16th term in the series is 2187, so only value 2187 should be printed to STDOUT.
	You can assume that N will not exceed 30.

	Example27
	________________________________________________________________________________
	Consider the below series:
	0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8
	This series is a mixture of 2 series all the odd terms in this series form even numbers in ascending order and every even terms is derived from the previous  term using the formula (x/2)
	Write a program to find the nth term in this series.
	The value n in a positive integer that should be read from STDIN the nth term that is calculated by the program should be written to STDOUT. Other than the value of the nth term no other characters /strings or message should be written to STDOUT.
	For example if n=10,the 10 th term in the series is to be derived from the 9th term in the series. The 9th term is 8 so the 10th term is (8/2)=4. Only the value 4 should be printed to STDOUT.
	You can assume that the n will not exceed 20,000.

	Example28
	Consider the below series :
	0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8
	This series is a mixture of 2 series all the odd terms in this series form even numbers in ascending order and every even terms is derived from the previous  term using the formula (x/2)
	Write a program to find the nth term in this series.
	The value n in a positive integer that should be read from STDIN the nth term that is calculated by the program should be written to STDOUT. Other than the value of the nth term no other characters /strings or message should be written to STDOUT.
	For example if n=10,the 10 th term in the series is to be derived from the 9th term in the series. The 9th term is 8 so the 10th term is (8/2)=4. Only the value 4 should be printed to STDOUT.
	You can assume that the n will not exceed 20,000.
	Example29

	Oddly Even Problem Statement
	Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits
	Test Cases

	Case 1
	•	Input: 4567
	•	Expected Output: 2
	Explanation : Odd positions are 4 and 6 as they are pos: 1 and pos: 3, both have sum 10. Similarly, 5 and 7 are at even positions pos: 2 and pos: 4 with sum 12. Thus, difference is 12 – 10 = 2
	Case 2
	•	Input: 5476
	•	Expected Output: 2
	Case 3
	•	Input: 9834698765123
	•	Expected Output: 1


	Example30
	____________________________________________________________________
	Question. Find the nth term of the series.
	1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243,64, 729, 128, 2187 ….
	This series is a mixture of 2 series – all the odd terms in this series form a geometric series and all the even terms form yet another geometric series. Write a program to find the Nth term in the series.
	•	The value N in a positive integer that should be read from STDIN.
	•	The Nth term that is calculated by the program should be written to STDOUT.
	•	Other than value of n th term,no other character / string or message should be written to STDOUT.
	•	For example , if N=16, the 16th term in the series is 2187, so only value 2187 should be printed to STDOUT.
	You can assume that N will not exceed 30.

	Test Case 1
	•	Input- 16
	•	Expected Output – 2187
	Test Case 2
	•	Input- 13
	•	Expected Output – 64

	Explanation
	1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243,64, 729, 128, 2187 can represented as :
	•	2(0), 3(0),2(1), 3(1),2(2), 3(2),2(3), 3(3),2(4), 3(4),2(5), 3(5),2(6), 3(6) ….
	There are two consecutive sub GP’s at even and odd positions
	•	(GP-1) At Odd Positions (Powers of 2) – 1, 2, 4, 8, 16, 32, 64, 128
	•	(GP-2) At Even Positions (Powers of 3) – 1, 3, 9, 27, 81, 243, 729, 2187
	Clearly, for calculating Nth position value
	•	If N is Even, Find (N/2) position in sub GP – 2
	•	If N is Odd, Find (N/2 + 1) position in sub GP – 1

	 

	Example31
	_____________________________________________________________________________
	Consider the below series:
	0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8
	•	This series is a mixture of 2 series all the odd terms in this series form even numbers in ascending order
	•	Every even terms is derived from the previous  term using the formula (x/2)
	Write a program to find the nth term in this series.
	1.	The value n in a positive integer that should be read from STDIN the nth term that is calculated by the program should be written to STDOUT.
	2.	Other than the value of the nth term no other characters /strings or message should be written to STDOUT.
	For example
	if n=10,the 10 th term in the series is to be derived from the 9th term in the series. The 9th term is 8 so the 10th term is (8/2)=4. Only the value 4 should be printed to STDOUT.
	You can assume that the n will not exceed 20,000.

	 

	Example32
	_____________________________________________________________________________
	Consider the below series:
	1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17…..
	This series is a mixture of 2 series fail the odd terms in this series form a Fibonacci series and all the even terms are the prime numbers in ascending order
	Write a program to find the Nth term in this series
	The value N in a positive integer that should be read from mm. The Nth term that is calculated by the program should be written to STDOUT Otherthan the value of Nth term , no other characters / string or message should be written to STDOUT.
	For example, when N:14, the 14th term in the series is 17 So only the value 17 should be printed to STDOUT
	 
	 
	Example33
	__________________________________________________________________________
	 How to find all permutations of String ?
	Description:  I have seen this String interview question on many interviews. It has an easy recursive solution but things get really tricky when Interviewer asks you to solve this question without using recursion. You can use a Stack though. Write a program to print all permutations of a String in Java, for example, the if input is "xyz" then it should print "xyz", "yzx", "zxy", "xzy", "yxz", "zyx".

	 
	Example34
	 How to reverse words in a sentence without using a library method?

	Write a function, which takes a String word and returns sentence on which words are reversed in order like if the input is "Java is best programming language", the output should be "language programming best is Java".


	Example35
	  How to check if String is Palindrome?
	Another easy coding question based upon String, I am sure you must have done this numerous time. Your program should return true if String is a Palindrome, otherwise false. For example, if the input is "radar", the output should be true, if the input is "madam" output will be true, and if the input is "Java" output should be false.

	Example36
	  How to check if a String is a valid shuffle of two String?

	One more difficult String algorithm based coding question for senior developers. You are given 3 strings: first,  second, and third.  Third String is said to be a shuffle of first and second if it can be formed by interleaving the characters of first and second String in a way that maintains the left to right ordering of the characters from each string.

	For example, given first = "abc" and second = "def",  third = "dabecf"  is a valid shuffle since it preserves the character ordering of the two strings. So, given these 3 strings write a function that detects whether the third String is a valid shuffle of first and second String.

	Example37 
	 How to return highest occurred character in a String?

	You need to write a function to implement an algorithm which will accept a string of characters and should find the highest occurrence of the character and display it. For example if input is "aaaaaaaaaaaaaaaaabbbbcddddeeeeee" it should return "a".

	Example38
	  Write a program to find the longest palindrome in a string?

	his is one of the tough coding question based upon String. It's hard to think about an algorithm to solve this problem until you have practiced well. What makes it more difficult is the constraint that your solution has O(n) time complexity and O(1) space complexity.

	Example39
	  How to sort String on their length in Java?

	Write a Program to sort String on their length in Java? Your method should accept an array of String and return a sorted array based upon the length of String. Don't forget to write unit tests for your solution.
	That's all on this list of 15 String Algorithm based coding questions. These are a really good question to prepare for programming job interviews, not only you can expect the same question on a real interview but also it will prepare you how to tackle algorithmic coding interview questions. Even if you don't find the same question, you would be able to apply the knowledge you gain by solving these question by yourself.

	Always remember, you are judged by the code you write, so always write production quality code, which would pass the general test, corner cases, invalid inputs, robustness test and also pass the performance test.  Whenever asked to solve a coding problem, always think about all possible input and write a test for that.

	Example40

	  Write a program in C to merge two arrays of same size sorted in decending order.
	Test Data :
	Input the number of elements to be stored in the first array :3
	Input 3 elements in the array :
	element - 0 : 1
	element - 1 : 2
	element - 2 : 3
	Input the number of elements to be stored in the second array :3
	Input 3 elements in the array :
	element - 0 : 1
	element - 1 : 2
	element - 2 : 3
	Expected Output :
	The merged array in decending order is :
	3 3 2 2 1 1
	Example41

	  Write a program in C to separate odd and even integers in separate arrays ?
	Test Data :
	Input the number of elements to be stored in the array :5
	Input 5 elements in the array :
	element - 0 : 25
	element - 1 : 47
	element - 2 : 42
	element - 3 : 56
	element - 4 : 32
	Expected Output :
	The Even elements are :
	42 56 32
	The Odd elements are :
	25 47

	Example42
	  Write a program in C to delete an element at desired position from an array. 
	Test Data :
	Input the size of array : 5
	Input 5 elements in the array in ascending order:
	element - 0 : 1
	element - 1 : 2
	element - 2 : 3
	element - 3 : 4
	element - 4 : 5
	Input the position where to delete: 3
	Expected Output :
	The new list is : 1 2 4 5
	Example43
	  Write a program in C to find the second largest element in an array ?
	Test Data :
	Input the size of array : 5
	Input 5 elements in the array :
	element - 0 : 2
	element - 1 : 9
	element - 2 : 1
	element - 3 : 4
	element - 4 : 6
	Expected Output :
	The Second largest element in the array is : 6
	Example44
	  Write a program in C to find a pair with given sum in the array. 
	Expected Output :
	The given array : 6 8 4 -5 7 9
	The given sum : 15
	Pair of elements can make the given sum by the value of index 0 and 5
	Example45
	 Write a program in C to find the majority element of an array ?
	A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
	Expected Output :
	The given array is : 4 8 4 6 7 4 4 8
	There are no Majority Elements in the given array.
	Example46
	 Write a program in C to rotate an array by N positions ?
	Expected Output :
	The given array is : 0 3 6 9 12 14 18 20 22 25 27
	From 4th position the values of the array are : 12 14 18 20 22 25 27
	Before 4th position the values of the array are : 0 3 6 9
	After rotating from 4th position the array is:
	12 14 18 20 22 25 27 0 3 6 9
	Example47
	  Write a program in C to find the ceiling in a sorted array?
	Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
	Expected Output :
	The given array is : 1 3 4 7 8 9 9 10
	The ceiling of 5 is: 7

	Example48
	  Write a program in C to find the Floor and Ceil of the number 0 to 10 from a sroted array.
	Expected Output :
	The given array is : 1 3 5 7 8 9
	Number: 0 ceiling is: 1 floor is: -1
	Number: 1 ceiling is: 1 floor is: 1
	Number: 2 ceiling is: 3 floor is: 1
	Number: 3 ceiling is: 3 floor is: 3
	Number: 4 ceiling is: 5 floor is: 3
	Number: 5 ceiling is: 5 floor is: 5
	Number: 6 ceiling is: 7 floor is: 5
	Number: 7 ceiling is: 7 floor is: 7
	Number: 8 ceiling is: 8 floor is: 8
	Number: 9 ceiling is: 9 floor is: 9
	Number: 10 ceiling is: -1 floor is: 9

	Example49
	   Write a program in C to find the smallest missing element from a sorted array?
	Expected Output :
	The given array is : 0 1 3 4 5 6 7 9
	The missing smallest element is: 2

	Example50
	 Write a program in C to to print next greater elements in a given unsorted array. Elements for which no greater element exist, consider next greater element as -1.
	Expected Output :
	The given array is : 5 3 10 9 6 13
	Next Bigger Elements are:
	Next bigger element of 5 in the array is: 10
	Next bigger element of 3 in the array is: 10
	Next bigger element of 10 in the array is: 13
	Next bigger element of 9 in the array is: 13
	Next bigger element of 6 in the array is: 13
	Next bigger element of 13 in the array is: -1
	Next Bigger Elements Array:
	10 10 13 13 13 -1

	Example51
	   Write a program in C to find two elements whose sum is closest to zero
	Expected Output :
	The given array is : 38 44 63 -51 -35 19 84 -69 4 -46
	The Pair of elements whose sum is minimum are:
	[44, -46]

	Example52
	  Write a program in C to find a subarray with given sum from the given array?
	Expected Output :
	The given array is : 3 4 -7 1 3 3 1 -4
	[0..1] -- { 3 4 }
	[0..5] -- { 3 4 -7 1 3 3 }
	[3..5] -- { 1 3 3 }
	[4..6] -- { 3 3 1 }
	Example53
	  Write a program in C to find if a given integer x appears more than n/2 times in a sorted array of n integers ?
	Expected Output :
	The given array is : 1 3 3 5 4 3 2 3 3
	The given value is : 3
	3 appears more than 4 times in the given array[]



	Example53
	  Write a program in C to find the maximum circular subarray sum of a given array.
	Expected Output :
	The given array is : 10 8 -20 5 -3 -5 10 -13 11
	The maximum circular sum in the above array is: 29
	Example55
	  Write a program in C to move all zeroes to the end of a given array.
	Expected Output :
	The given array is : 2 5 7 0 4 0 7 -5 8 0
	The new array is:
	2 5 7 8 4 -5 7 0 0 0
	Example56
	  Write a program in C to count the number of inversion in a given array
	Expected Output :
	The given array is : 1 9 6 4 5
	The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
	The number of inversion can be formed from the array is: 5
	Example57
	  Write a program in C to find out the maximum difference between any two elements such that larger element appears after the smaller number.
	Expected Output :
	The given array is : 7 9 5 6 13 2
	The elements which provide maximum difference is: 5, 13
	The Maximum difference between two elements in the array is: 8

	Example58
	  Write a program in C to count all distinct pairs for a specific difference
	Expected Output:
	The given array is:
	5 2 3 7 6 4 9 8
	The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
	Number of distinct pairs for difference 5 are: 3
	Example59
	  Write a program in C to find the maximum repeating number in a given array.
	The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
	Expected Output:
	The given array is:
	2 3 3 5 3 4 1 7 7 7 7
	The maximum repeating number is: 7


	Example60
	 Write a program in C to print all possible combinations of r elements in a given array.
	Expected Output:
	The given array is:
	1 5 4 6 8 The combination from by the number of elements are: 4
	The combinations are:
	1 5 4 6
	1 5 4 8
	1 5 6 8
	1 4 6 8
	5 4 6 8
	Example61
	  Write a program in C to find a pair with the given difference
	Expected Output:
	The given array is:
	1 15 39 75 92
	The given difference is: 53
	The pair are: (39, 92)
	Example62
	  Write a program in C to find the minimum distance between two numbers in a given array.
	Expected Output:
	The given array is:
	7 9 5 11 7 4 12 6 2 11
	The minimum distance between 7 and 11 is: 1

	Example63
	  Write a program in C to rearrange positive and negative numbers alternatively in a given array ?
	Output:
	If positive numbers are more they appear at the end and for also negative numbers, they too appear in the end of the array.
	Expected Output:
	The given array is:
	-4 8 -5 -6 5 -9 7 1 -21 -11 19
	The rearranged array is:
	-4 7 -5 1 -21 5 -11 8 -9 19 -6

	Example64
	 Write a program in C to find the maximum for each and every contigious subarray of size k from a given array.
		Expected Output:
	The given array is:
	1 3 6 21 4 9 12 3 16 10
	The length of each subarray is: 4
	The contagious subarray of length 4 and their maximum value are:
	1 3 6 21 ----> 21
	3 6 21 4 ----> 21
	6 21 4 9 ----> 21
	21 4 9 12 ----> 21
	4 9 12 3 ----> 12
	9 12 3 16 ----> 16
	12 3 16 10 ----> 16
	Example65
	  Write a program in C to convert the array in such a way that double its value and replace the next number with 0 if current and next element are same and rearrange the array such that all 0's shifted to the end.
	Expected Output:
	The given array is: 0 3 3 3 0 0 7 7 0 9
	The new array is: 6 3 14 9 0 0 0 0 0 0

	Example66
	 Remove duplicates from unsorted array using Set data structure
	Given an unsorted array of integers, print the array after removing the duplicate elements from it. We need to print distinct array elements according to their first occurrence.
	Examples:
	Input: arr[] = { 1, 2, 5, 1, 7, 2, 4, 2}
	Output: 1 2 5 7 4
	Explanation: {1, 2} appear more than one time.
	Input: arr[] = { 3, 3, 4, 1, 1}
	Output: 3 4 1
	Example67
	  Write a program in C for a 2D array of size 3x3 and print the matrix ?
	Test Data :
	Input elements in the matrix :
	element - [0],[0] : 1
	element - [0],[1] : 2
	element - [0],[2] : 3
	element - [1],[0] : 4
	element - [1],[1] : 5
	element - [1],[2] : 6
	element - [2],[0] : 7
	element - [2],[1] : 8
	element - [2],[2] : 9
	Expected Output :
	The matrix is :

	1 2 3
	4 5 6
	7 8 9
	Example68
	 Write a program in C for addition of two Matrices of same size.
	Test Data :
	Input the size of the square matrix (less than 5): 2
	Input elements in the first matrix :
	element - [0],[0] : 1
	element - [0],[1] : 2
	element - [1],[0] : 3
	element - [1],[1] : 4
	Input elements in the second matrix :
	element - [0],[0] : 5
	element - [0],[1] : 6
	element - [1],[0] : 7
	element - [1],[1] : 8
	1 2
	3 4
	The Second matrix is :

	5 6
	7 8
	The Addition of two matrix is :

	6 8
	10 12
	Example69
	  Write a program in C for subtraction of two Matrices.
	Test Data :
	Input the size of the square matrix (less than 5): 2
	Input elements in the first matrix :
	element - [0],[0] : 5
	element - [0],[1] : 6
	element - [1],[0] : 7
	element - [1],[1] : 8
	Input elements in the second matrix :
	element - [0],[0] : 1
	element - [0],[1] : 2
	element - [1],[0] : 3
	element - [1],[1] : 4
	Expected Output :
	The First matrix is :

	5 6
	7 8
	The Second matrix is :

	1 2
	3 4
	The Subtraction of two matrix is :

	4 4
	4 4
	Example70
	 Write a program in C for multiplication of two square Matrices
	Test Data :
	Input the rows and columns of first matrix : 2 2
	Input the rows and columns of second matrix : 2 2
	Input elements in the first matrix :
	element - [0],[0] : 1
	element - [0],[1] : 2
	element - [1],[0] : 3
	element - [1],[1] : 4
	Input elements in the second matrix :
	element - [0],[0] : 5
	element - [0],[1] : 6
	element - [1],[0] : 7
	element - [1],[1] : 8
	Expected Output :
	The First matrix is :
	1 2
	3 4
	The Second matrix is :
	5 6
	7 8
	The multiplication of two matrix is :

	19 22
	43 50
	Example71
	Write a program in C to find transpose of a given matrix.
	Test Data :
	Input the rows and columns of the matrix : 2 2
	Input elements in the first matrix :
	element - [0],[0] : 1
	element - [0],[1] : 2
	element - [1],[0] : 3
	element - [1],[1] : 4
	Expected Output :
	The matrix is :

	1 2
	3 4

	The transpose of a matrix is :
	1 3
	2 4

	Example72
	 Write a program in C to find sum of right diagonals of a matrix
	Test Data :
	Input the size of the square matrix : 2
	Input elements in the first matrix :
	element - [0],[0] : 1
	element - [0],[1] : 2
	element - [1],[0] : 3
	element - [1],[1] : 4
	Expected Output :
	The matrix is :
	1 2
	3 4
	Addition of the right Diagonal elements is :5

	Example73
	Write a program in C to find the sum of left diagonals of a matrix. 
	Test Data :
	Input the size of the square matrix : 2
	Input elements in the first matrix :
	element - [0],[0] : 1
	element - [0],[1] : 2
	element - [1],[0] : 3
	element - [1],[1] : 4
	Expected Output :
	The matrix is :
	1 2
	3 4
	Addition of the left Diagonal elements is :5

	Example74
	 Write a program in C to find sum of rows an columns of a Matrix.
	Test Data :
	Input the size of the square matrix : 2
	Input elements in the first matrix :
	element - [0],[0] : 5
	element - [0],[1] : 6
	element - [1],[0] : 7
	element - [1],[1] : 8
	Expected Output :
	The First matrix is :
	The matrix is :
	5 6
	7 8
	The sum or rows and columns of the matrix is :
	5 6 11
	7 8 15
	12 14
	Example75
	  Write a program in C to print or display the lower triangular of a given matrix.
	Test Data :
	Input the size of the square matrix : 3
	Input elements in the first matrix :
	element - [0],[0] : 1
	element - [0],[1] : 2
	element - [0],[2] : 3
	element - [1],[0] : 4
	element - [1],[1] : 5
	element - [1],[2] : 6
	element - [2],[0] : 7
	element - [2],[1] : 8
	element - [2],[2] : 9
	Expected Output :
	The matrix is :
	1 2 3
	4 5 6
	7 8 9
	Setting zero in lower triangular matrix

	1 2 3
	0 5 6
	0 0 9
	Example76
	 Write a program in C to print or display upper triangular matrix
	Input the size of the square matrix : 3
	Input elements in the first matrix :
	element - [0],[0] : 1
	element - [0],[1] : 2
	element - [0],[2] : 3
	element - [1],[0] : 4
	element - [1],[1] : 5
	element - [1],[2] : 6
	element - [2],[0] : 7
	element - [2],[1] : 8
	element - [2],[2] : 9
	Expected Output :
	The matrix is :
	1 2 3
	4 5 6
	7 8 9
	Setting zero in upper triangular matrix

	1 0 0
	4 5 0
	7 8 9
	Example77
	 Write a program in C to calculate determinant of a 3 x 3 matrix.
	Test Data :
	Input elements in the first matrix :
	element - [0],[0] : 1
	element - [0],[1] : 0
	element - [0],[2] : -1
	element - [1],[0] : 0
	element - [1],[1] : 0
	element - [1],[2] : 1
	element - [2],[0] : -1
	element - [2],[1] : -1
	element - [2],[2] : 0
	Expected Output :
	The matrix is :
	1 0 -1
	0 0 1
	-1 -1 0
	The Determinant of the matrix is: 1

	Example78
	 Write a program in C to accept a matrix and determine whether it is a sparse matrix. 
	Test Data :
	Input the number of rows of the matrix : 2
	Input the number of columns of the matrix : 2
	Input elements in the first matrix :
	element - [0],[0] : 0
	element - [0],[1] : 0
	element - [1],[0] : 1
	element - [1],[1] : 0
	Expected Output :
	The given matrix is sparse matrix.
	There are 3 number of zeros in the matrix

	Example79
	 Write a program in C to accept two matrices and check whether they are equal
	Test Data :
	Input Rows and Columns of the 1st matrix :2 2
	Input Rows and Columns of the 2nd matrix :2 2
	Input elements in the first matrix :
	element - [0],[0] : 1
	element - [0],[1] : 2
	element - [1],[0] : 3
	element - [1],[1] : 4
	Input elements in the second matrix :
	element - [0],[0] : 1
	element - [0],[1] : 2
	element - [1],[0] : 3
	element - [1],[1] : 4
	Expected Output :
	The first matrix is :
	1 2
	3 4
	The second matrix is :
	1 2
	3 4
	The Matrices can be compared :
	Two matrices are equal.

	Example80
	 Write a program in C to check whether a given matrix is an identity matrix. 
	Test Data :
	Input number of Rows for the matrix :3
	Input number of Columns for the matrix :3
	Input elements in the first matrix :
	element - [0],[0] : 1
	element - [0],[1] : 0
	element - [0],[2] : 0
	element - [1],[0] : 0
	element - [1],[1] : 1
	element - [1],[2] : 0
	element - [2],[0] : 0
	element - [2],[1] : 0
	element - [2],[2] : 1
	Expected Output :
	The matrix is :
	1 0 0
	0 1 0
	0 0 1
	The matrix is an identity matrix.

	Interview Questions of JAVA
	1. What is java and explain feature of java?
	2. Why java is platform independent language?
	3. What is byte code and importance of byte code?
	4. What is difference between byte code and machine code?
	5. What is diff between platform independency and cross platform?
	6. What is OOP and explain depth?
	7. What are the pillars of OOP?
	8. What is diff between semi object oriented and pure object oriented?
	9. What is JDK, JRE and JVM?
	10. What is diff between JDK JRE and JVM?
	11. What is JVM and explain its architecture?
	12. What is array and how many ways to declare array in java?
	13. What is diff between C array and java array?
	14. What is Jagged Array in java?
	15. What is anonymous array in java?
	16 what is class and why use it?
	17 How we can reuse class more than one time?
	18.what is encapsulation and explain encapsulation with real time scenario?
	19. what is diff instance variable, static variable and local variable?
	20. what is static keyword and explain static variable, static method?
	21 Explain any 4 important points related with static and instance variable?
	22 what is method variable arguments?
	23 what is array of object and how create array of object in java?
	24 what is Meta section and why use it?
	25 is It true static variable not stored in object?
	26 is it true static variable stored in Meta section?
	27 is it true instance variable allocate memory after object?
	28 is it true we cannot declare class as private, static and protected?
	29. What is nested class?
	30. What is constructor and why use constructor?
	31. Explain types of constructors?
	32. What is constructor overloading explain with example?
	33. What is constructor chaining and explain this() constructor?
	34 What is singleton class and how to create it?
	35. What is utility class in java and how to create it?

*/












}
