package SecondStep;
import Bacic.*;
import java.util.List;
import java.util.ArrayList;

public class Department {
    public String depatmentName;
    List<String> departmentList = new ArrayList<>();
    List<Student> studentList = new ArrayList<>();
    
    
    

    public void addStudent(Student student){
        for (Student s : studentList){
            if(s.getId() == student.getId()){
                System.out.println("This id was added  already");
                return;

            }
            
        }
        studentList.add(student);
         

    }
    public void addDepartmet() throws Exception{
        for (String name : departmentList) {
            if(name.equals(depatmentName)){
                throw new Exception("The department name is already added");
            }
        }
        
        departmentList.add(depatmentName);

    }
    public void addCourse(Course course) {
        for (Course c: Course.courseList){
            if(c.courseId == course.courseId){
                System.out.println("This ID is already added!");

            }

        }
        Course.courseList.add(course);


    }
    public void addProfessior(Professor professior){
        for(Professor pro: Professor.professorList  ){
            if(pro.getId() == professior.getId()){
                System.out.println("This id is alredy added!");
                return;
            }
        }
        Professor.professorList.add(professior);
    }
    
}
