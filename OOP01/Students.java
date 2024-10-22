package OOP01;

public class Students {
    private int studentid;
    private String name;
    private String lname;
    private int age;

    public Students(int studentid, String name, String lname, int age) {
        this.studentid = studentid;
        this.name = name;
        this.lname = lname;
        this.age = age;
    }

    public int getstudentid() {
        return studentid;
    }

    public void setstudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return ("\n\tstudentid:" + studentid + "\n\tname:" + name + "\n\tLastname:" + lname + "\n\tAge:" + age);
    }
}
