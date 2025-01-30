class Employee

{

    private string name;

    private int id;

    Employee(string name, int id)

    {

        this.name = name;

        this.id = id;

    }

    void displayDetails()

    {

        System.out.println("Name : " + name);

        System.out.println("Id : " + id);

    }

}

class Manager extends Employee

{

    int teamSize;

    Manager(string name, int id, int teamSize)

    {

        super.Employee(name, id);

        this.teamSize = teamSize;

    }

    void displayDetails()

    {

        super.displayDetails(); //parent class method

        System.out.println("Team Size : " + teamSize);

    }

}

class Engineer extends Employee

{

    string specialization;

    Engineer(string name, int id, string specialization)

    {

        super.Employee(name, id);

        this.specialization = specialization;

    }

    void displayDetails()

    {

        super.displayDetails();

        System.out.println("Specialization : " + specialization);

    }



}
