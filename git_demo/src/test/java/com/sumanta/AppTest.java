package com.sumanta;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.Before;

import com.sumanta.student.Address;
import com.sumanta.student.Student;
import com.sumanta.studentRepo.StudentRepository;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    private StudentRepository studentRepository;
    
    @Before
    public void setUp(){
        studentRepository = new StudentRepository();
    }

    @Test
    public void testAddStudent()
    {
      
        Student student1=new Student(505,"Rakesh Gupta","guptaRakesh877@gmail.com",new Address("Mumbai","Maharastra", "India", "846761"));
        studentRepository.addStudent(student1);
        List<Student>students=studentRepository.getAllStudents();
        assertTrue(students.size()==1);
        assertEquals("Rakesh Gupta",students.get(0).getStudentName());

        

    }
    
    @Test
    public void testGetStudentById(){
       
        Student student2=new Student(805,"Harish Mishra","guptaRakesh877@gmail.com",new Address("Ayodha","Up", "India", "457562"));
      
        studentRepository.addStudent(student2);
        Optional<Student> foundStudent=studentRepository.getStudentById(805);
        assertNotNull(foundStudent);
        assertEquals("Harish Mishra",foundStudent.get().getStudentName());
        assertEquals(foundStudent.get().getStudentId(), 805);
        
    

    }
    
    @Test
    public void testUpdateStudent(){

        Student student3=new Student(505,"Rakesh Gupta","guptaRakesh877@gmail.com",new Address("Mumbai","Maharastra", "India", "846761"));
        
        studentRepository.addStudent(student3);

        student3.setStudentName("Pritam Chauhan");
        studentRepository.updateStudent(505, student3);
        Optional<Student> updateStudent=studentRepository.getStudentById(505);
        assertEquals("Pritam Chauhan",updateStudent.get().getStudentName());

    
    }
    
    @Test
    public void testDeleteStudent(){

        Student student4=new Student(606,"Abhisekh Goyal","goyalabhisekh86@gmail.com",new Address("Bangalore","Karnatak", "India", "763832"));

        studentRepository.addStudent(student4);
        studentRepository.deleteStudentId(606);
        Optional<Student>deleteStudent=studentRepository.getStudentById(606);
        assertFalse(deleteStudent.isPresent());

    }

    @Test
    public void testGetAllStudents(){

        Student student5=new Student(707,"Roshan Roy","royroshn5435@gmail.com",new Address("Cuttack","Odisha", "India", "75213"));

        Student student6=new Student(909,"Ashis Pal","palAshsis6554@gmail.com",new Address("Kolkata","West Bengal", "India", "856781"));
        
        studentRepository.addStudent(student5);
        studentRepository.addStudent(student6);
        List<Student>student=studentRepository.getAllStudents();
        assertEquals(2,student.size());
        assertEquals("Roshan Roy",student.get(0).getStudentName());
        assertEquals("Ashis Pal",student.get(1).getStudentName());

    }


}
