package OOP1;

import java.util.ArrayList;

public class SMS {
    private ArrayList<Student> students;

    public SMS() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentid(int studentid) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentid() == studentid) {
                students.remove(i);
                System.out.println("Student Remove");
                return;
            }
        }
        System.out.println("Student with ID:" + "not found!");
    }

    public Student findStudent(int studentid) {
        for (Student student : students) {
            if (student.getStudentid() == studentid) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
