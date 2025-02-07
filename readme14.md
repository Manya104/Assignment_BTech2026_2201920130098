You are required to design a class hierarchy to demonstrate object cloning using shallow and deep copying in a library system. A Library contains a list of Book objects.



Shallow Copy: Creates a new object that shares references with the original object for nested structures.

Deep Copy: Creates a completely independent copy of the original object, including all nested structures.



Classes :

Book :

Attributes : title (string) , author (string)
Library :

Attributes : name (string) , books (List of Book class)
Methods :
shallowClone() : Creates a shallow copy of the Library object.
deepClone() : Creates a deep copy of Library object.
display() : Displays the output/ attributes of the class.
addBook (Book book) : It adds one book info to the list of books.
