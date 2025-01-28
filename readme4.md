You are tasked to design a class Book to manage the book details in a library. The class should contain the following specifications :

Attributes :

title (array<string>) : The title of the book (public).
author (array<string>) : The author of the book (public)
isAvailable (array<boolean>) : The availability status of the book (private).
Methods :

Parameterised constructor to initialize the title, author, isAvaialble list.
borrowBook() : If the availability status is false then the book is borrowed by the user else return "Book Not Available".
returnBook () : Marks the book as available by setting its available flag to true.
getAvailability () : Prints the availability status of the book (true for available , false for unavailable).
platform:tuf
