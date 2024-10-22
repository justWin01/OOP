package AllIn;

abstract class Employee {
    String name;
    int age;
    int birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + "\nAge: " + age + "\nBirth: " + birth);
    }

    public abstract void expertise();
}

class itPerson extends Employee {
    public itPerson(String name, int age, int birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public void expertise() {
        System.out.println("Fixing Computer");
    }
}

class manager extends Employee {
    public manager(String name, int age, int birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public void expertise() {
        System.out.println("manage");
    }
}

class salesPerson extends Employee {
    public salesPerson(String name, int age, int birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public void expertise() {
        System.out.println("selling");
    }
}

// it person
// manager
// salesperson