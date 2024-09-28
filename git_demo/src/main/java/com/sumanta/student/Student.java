package com.sumanta.student;

public class Student {

    private int studentId;
    private String studentName;
    private String studentEmail;
    private Address studentAddress;  

    
    public Student(int studentId, String studentName, String studentEmail, Address studentAddress) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
    }

    


    /**
     * @return int return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return String return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return String return the studentEmail
     */
    public String getStudentEmail() {
        return studentEmail;
    }

    /**
     * @param studentEmail the studentEmail to set
     */
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    /**
     * @return String return the studentAddress
     */
    public Address getStudentAddress() {
        return studentAddress;
    }

    /**
     * @param studentAddress the studentAddress to set
     */
    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }




    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
                + ", studentAddress=" + studentAddress + "]";
    }

    
}


