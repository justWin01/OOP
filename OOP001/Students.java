package OOP001;

public class Students {
    private int studentid;
    private String name;
    private String lastname;
    private int age;

    public Students(int studentid, String name, String lastname, int age) {
        this.studentid = studentid;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudent(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setAgae(int age) {
        this.age = age;
    }

    public String toString() {
        return ("Student ID:" + studentid + "\n Name:" + name + "\n Lastname:"
                + lastname + "\n Age:" + age);
    }
}
