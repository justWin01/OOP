package OOP2;

import java.util.ArrayList;

public class SMS {
            private ArrayList<Students> students;
    
    public SMS(){
            students = new ArrayList<>();
    }
    public void addStudents(Students student){
            students.add(student);
    }
    public void removeStudentid(int id){
            for(int i =0; i < students.size(); i++){
                if(students.get(i).getID() == id ){
                    students.remove(i);
                    return;
                }
            }
    }
    public void findstudent(int id){
        for(Students students : students);
             if(students.getID() == id){
                return students;
        }
    }
    public void displayAllStudents(){
        
    }
}
