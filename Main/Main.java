package Main;
import java.util.Scanner;
import SecondStep.*;
import Bacic.*;

public class Main {
    public static void main(String[] args){
        System.out.println("-------University Management System -------");
        System.out.println("1.Add Department");
        System.out.println("2.Add Coures");
        System.out.println("3.Add Professor");
        System.out.println("4.Add Student");
        System.out.println("5.Enroll Student in Cours");
        System.out.println("6.Assign Grade");
        System.out.println("7.View Student Grades");
        System.out.println("8.View Course Students");
        System.out.println("9.Exit");

        Scanner sc = new Scanner(System.in);
        Department department = new Department();
        while (true) {
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            try {
               
                if (choice <=0 || choice >9) {
                    throw new Exception("Invalid Input");
                }
            
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                return;

            }

            switch (choice) {
                case 1-> {
                    System.out.println("Enter the Department Name: ");
                    department.depatmentName = sc.nextLine();
                    try{
                        department.addDepartmet();
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.print("Enter the ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\nEnter the student name: ");
                    String name = sc.nextLine();
                    System.out.print("\nEnter the email: ");
                    String email = sc.nextLine();
                    Student student = new Student(id,name,email);
                    
                    department.addStudent(student);



                 

                }
                case 3 -> {
                    System.out.print("Enter the coures ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter the Courese Name:  ");
                    sc.nextLine();
                    String  courseName = sc.nextLine();
                    Course course = new Course(id, courseName);
                    department.addCourse(course);

                
                }
            }
        }
            
        

        
            
                    
                



            
            
               
                



                
                
            
        
    }

    
        
        
    


    
    
}

                

                
                
                
                
                
                
                
                