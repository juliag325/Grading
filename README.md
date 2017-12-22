# Grading
A program that acts as a grader for errors written by student, using an imported dictionary. 
NOTE: Student written works file was supplemented by the TAs. Testing with this file was done in the computer labs only, and file was not directly given to the students. Therefore, there is not test file in this repository to use in this program. 

The classes Graduate Student, Undergraduate Student, and HighSchool Student dicate the name, ID, and school in which they attend. 
The Student class initializes the objects used in each of these classes. 

The Dictionary class loads the dictionary text file (which includes all of the possible words) and contains error handling if no file is u
uploaded. This class is then used in the Grader class, which checks to see if the words used in a particular student's writing is in the 
dictionary or not. If not, then this detects an error. The Grader also disregards white space and punctuation. 

The Project5 class simply acts as the user input and output base, relaying the file upload completion and relaying the number of errors 
in a particular piece of writing. 

