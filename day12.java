class Department{
    private String name;
    int id;
    Department(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void displayDetails(){
        System.out.println("Department Name : "+name);
        System.out.println("Department Id : "+id);
    }
}
class Employee{
    private String name;
    int id;
    Department department;
    Employee(String name,int id,Department department){
        this.name=name;
        this.id=id;
        this.department=department;
    }
    public void displayDetails(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee id : "+id);
        department.displayDetails();
    }
}
