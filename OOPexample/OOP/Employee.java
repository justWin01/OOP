package OOPexample.OOP;

 abstract class Employee {
    String name;
    int age;
    int year;

    //make getters and setters
    public abstract String get_name();
    public abstract void set_name(String name);
    public abstract int get_age();
    public abstract void set_age(int age);
    public abstract int get_year();
    public abstract void set_year(int year);

}
 class Salesperson extends Employee{
    @Override
    public String get_name(){
        return name;
    }
    @Override
    public void set_name(String name){
        this.name = name;
    }
    @Override
    public int get_age(){
        return age;
    }
    @Override
    public void set_age(int age){
        this.age = age;
    }
    @Override
    public int get_year(){
        return year;
    }
    @Override
    public void set_year(int year){
        this.year = year;
    }
}
class Itperson extends Employee{
    @Override
    public String get_name(){
        return name;
    }
    @Override
    public void set_name(String name){
        this.name = name;
    }
    @Override
    public int get_age(){
        return age;
    }
    @Override
    public void set_age(int age){
        this.age = age;
    }
    @Override
    public int get_year(){
        return year;
    }
    @Override
    public void set_year(int year){
        this.year = year;
    }
}
class Manager extends Employee{
    @Override
    public String get_name(){
        return name;
    }
    @Override
    public void set_name(String name){
        this.name = name;
    }
    @Override
    public int get_age(){
        return age;
    }
    @Override
    public void set_age(int age){
        this.age = age;
    }
    @Override
    public int get_year(){
        return year;
    }
    @Override
    public void set_year(int year){
        this.year = year;
    }
}

class Main{
    public static void main(String[] args) {
        Employee em = new Employee(name,age,year);
    }
}


//sales person     it person  manager 