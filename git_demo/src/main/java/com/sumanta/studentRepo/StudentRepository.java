package com.sumanta.studentRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.sumanta.student.Student;

public class StudentRepository {

    private List<Student>stList=new ArrayList<Student>();

    //CREATE
    public void addStudent(Student student){
        stList.add(student);
        System.out.println("Student Added: "+student);
    }
    
    //READ (By Id)
    public Optional <Student> getStudentById(int id){

        return stList.stream().filter(st->st.getStudentId()==id).findFirst();

    }
    //UPDATE
    public boolean updateStudent(int id ,Student studentDetails){
        Optional<Student>optStudent=getStudentById(id);
        if(optStudent.isPresent()){
            Student student=optStudent.get();
            student.setStudentName(studentDetails.getStudentName());
            student.setStudentEmail(studentDetails.getStudentEmail());
            student.setStudentAddress(studentDetails.getStudentAddress());
            return true;
        }
        return false;

    }

    // DELETE
    public boolean deleteStudentId(int id){
        Optional<Student>optStudent=getStudentById(id);
        if(optStudent.isPresent()){
            stList.remove(optStudent.get());
            System.out.println("Student is deleted with id : "+id);
            return true;
        }
        return false;
    }

    // READ (All Students)
    public List<Student>getAllStudents(){
        return stList;
    }


}
