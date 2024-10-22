package OOP2;

public class Students {
        private int id;
        private String n ;
        private String l;
        private int age;
    
     public Students(int id, String n , String l, int age){
        this.id = id;
        this.n = n;
        this.l = l;
        this.age = age;
     }  

     public int getID(){
        return id;
     }
     public void setID(int id){
        this.id = id;
     }
     public String getN(){
        return n;
     }
     public void setN(String n){
        this.n = n;
     }
     public String getL(){
        return l;
     }
     public void setL(String l ){
        this.l = l;
     }
     public int getAge(){
        return age;
     }
     public void setAge(int age){
        this.age = age;
     }
     public String toString(){
        return("Student ID:"+ id + "Name:" + n +"Lastname:"+ l + "Age:" + age);
     }
}