package OOP001;

import java.util.ArrayList;

public class SMS {
    private ArrayList<Students> students;

    public SMS() {
        students = new ArrayList<>();
    }

    public void addStudents(Students student) {
        students.add(student);
    }

    public void removeStudents(int studentid) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentid() == studentid) {
                students.remove(i);
                return;
            }
            System.out.println("Students: " + " not found! ");
        }
    }

    public Students findStudents(int studentid) {
        for (Students student : students) {
            if (student.getStudentid() == studentid) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("\nno students");
        }
        for (Students students : students) {
            System.out.println("\n" + students);

        }
    }
}
