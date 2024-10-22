package OOP1;

public class Student {
    private int studentid;
    private String name;
    private String lastname;
    private int age;
    private double gpa;

    public Student(int studentid, String name, String lastname, int age, double gpa2) {
        this.studentid = studentid;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gpa = gpa2;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.lastname = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return ("Name:" + name + "\tLastname:" + lastname + "\tAge:" + age + "\tGpa:" + gpa);

    }

}