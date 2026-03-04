package Bacic;
import java.util.List;
import SecondStep.Course;
import java.util.ArrayList;

public class Professor extends Person{
    List<Professor> professorList = new ArrayList<>();
    public Professor(int id, String name,String email){
        super(id,name,email);
        professorList.add(this);
    }
    List<Course> teachingcourses;


}