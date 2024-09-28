package com.sumanta;

import com.sumanta.student.Address;
import com.sumanta.student.Student;
import com.sumanta.studentRepo.StudentRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
        StudentRepository studentRepository=new StudentRepository();

        Student student1=new Student(101, "Sumanta Swain", "swainsumanta01@gmail.com", new Address("Bhubaneswar", "Odisha", "India", "751024"));

        Student student2=new Student(202,"John Smith", "smithJohnhat077@gmail.com", new Address("California","Los Angeles" , "USA","748647"));

        Student student3=new Student(303,"Sambit Sharma", "sharmasambit229@gmail.com", new Address("Hyderabad", "Telengana","India", "500081"));

        studentRepository.addStudent(student1);
        studentRepository.addStudent(student2);
        studentRepository.addStudent(student3);

        // Read (By id)
        System.out.println("\nGet Student with Id 202: ");
        studentRepository.getStudentById(202).ifPresent(System.out::println);

        // Read (All Students)
        System.out.println("\nGet All Students: ");
        studentRepository.getAllStudents().forEach(System.out::println);

        // Update
        System.out.println("\nUpdating Student with Id 303: ");
        Student updateStudent=new Student(303, "Cheeranjeev", "cheeranjeev765@gmail.com",new Address("Hyderabad", "Telengana","India", "500081"));
        studentRepository.updateStudent(303, updateStudent);
        studentRepository.getStudentById(303).ifPresent(System.out::println);
        
        //Delete
        System.out.println("\nDeleting Student with Id 202: ");
        studentRepository.deleteStudentId(202);
        studentRepository.getAllStudents().forEach(System.out::println);




    

        

        


        
    }
}
