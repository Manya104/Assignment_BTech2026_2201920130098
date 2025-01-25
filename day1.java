class Student {
    private String name;
    private int rollNumber;

    public Student() {
        this.name = "";
        this.rollNumber = 0;
    }
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void setDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
    }
}

public class day1 {
    public static void main(String[] args) {
        Student student = new Student(); 
        student.setDetails("John Doe", 123);
        student.displayDetails();
    }
}