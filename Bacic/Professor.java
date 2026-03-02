package Bacic;
import java.util.List;
import SecondStep.Course;
import java.util.ArrayList;

public class Professor extends Person{
    public Professor(int id, String name,String email){
        super(id,name,email);
    }
    List<Course> teachingcourses;


}