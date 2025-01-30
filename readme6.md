You are tasked with creating a class hierarchy to represent employees in a company. Implement a base class Employee and derive classes Manager and Engineer from it. The base class should encapsulate common attributes, and the derived classes should add specific attributes while overriding methods. The derived classes should explicitly call the constructor of the parent class (Employee) to initialize common attributes.

The classes should consist of below specifications :

Base Class: Employee

Attributes : 1) name (string) : Represents the name of the employee.
2) id (Integer) : Ubique identifier for the employee.

Methods : 1) displayDetails () : Prints the name and id.


Derived Classes : a) Manager

Attributes : 1) teamSize (Integer) : The size of team managed.
Methods : 1) displayDetails () : calls the parent class method displayDetails() and then prints teamSize.
b) Engineer

Attributes : 1) specialization (string) : The engineer's area of interest.
Methods : 1) displayDetails () : Calls the parent class method displayDetails() and then prints the specialization.
