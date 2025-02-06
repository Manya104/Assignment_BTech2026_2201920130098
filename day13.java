import java.util.ArrayList;
import java.util.List;

class College {
    private String name;
    private String id;

    public College(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("College Name : " + name);
        System.out.println("College ID : " + id + "\n");
    }
}

class University {
    private String name;
    private List<College> colleges;

    public University(String name) {
        this.name = name;
        this.colleges = new ArrayList<>();
    }

    public void addCollege(String collegeName, String collegeId) {
        College college = new College(collegeName, collegeId);
        colleges.add(college);
    }

    public void displayDetails() {
        System.out.println("University Name : " + name + "\n");
        for (College college : colleges) {
            college.display();
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        University university = new University("Global_University");
        String[] collegeNames = {"COEP", "PICT", "VJTI", "WCE", "PCCOE"};
        String[] collegeIds = {"CO8543", "PI9514", "VJ8643", "VF569", "PC9246"};

        for (int i = 0; i < collegeNames.length; i++) {
            university.addCollege(collegeNames[i], collegeIds[i]);
        }

        university.displayDetails();
    }
}
