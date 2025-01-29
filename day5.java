class Employee

{

  public String name;

  private double salary;

  protected int employeeId;

  Employee(String name, double salary, int employeeId)

  {

    this.name = name;

    this.employeeId = employeeId;

    if(this.salary < 0)

    {

      System.out.println("Invalid Salary");

    }

    else

    {

      this.salary = salary;

    }

  }

  public double setSalary(double salary)

  {

    if(this.salary < 0)

    {

      System.out.println("Invalid Salary");

    }

    else

    {

      this.salary = salary;

    }

  }

  public double getSalary()

  {

    return this.salary;

  }

  public void displayEmployeeDetails()

  {

    System.out.printf("Salary : %.2f", this.salary);

    System.out.println("Name : "+ this.name);

    System.out.println("Employee Id : " + this.employeeId);

  }

}
