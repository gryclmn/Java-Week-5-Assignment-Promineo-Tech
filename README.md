# Week-1-Assignment-Promineo-Tech

Instructions: In Eclipse, or an IDE of your choice, write the code that accomplishes the objectives listed below. 
Ensure that the code compiles and runs as directed. Take screenshots of the code and of the running program 
(make sure to get screenshots of all required functionality) and paste them in this document where instructed below. 
Create a new repository on GitHub for this week’s assignments and push this document, with your Java project code, 
to the repository. Add the URL for this week’s repository to this document where instructed and submit this document 
to your instructor when complete.

Coding Steps:
1.	Create an interface named Logger.
2.	Add two void methods to the Logger interface, each should take a String as an argument
    a.	Log
    b.	Error
3.	Create two classes that implement the Logger interface
    a.	AsteriskLogger
    b.	SpacedLogger
4.	The log method on the AsteriskLogger should print out the String it receives
    between 3 asterisks on either side of the String (e.g. if the
    String passed in is “Hello”, then it should print ***Hello*** to the console.
5.	The error method on the AsteriskLogger should print the String it receives
    inside a box of asterisks, with the String preceded by the word “ERROR:”.
    For example, if “Hello” is the argument, the following should be printed:

    ****************
    ***Error: Hello***
    ****************

6.	The SpacedLogger should add spaces between each character of the
    String argument passed into its methods.
7.	If the log method received “Hello” as an argument, it should print H e l l o
8.	The error method should do the same, but with “ERROR:” preceding
    the spaced out input (i.e. ERROR: H e l l o)
9.	Create a class named App that has a main method.
10.	In this class instantiate an instance of each of your logger classes
    that implement the Logger interface.
11.	Test both methods on both instances, passing in Strings of your choice.

