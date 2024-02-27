package org.example;

public class Student implements Comparable<Student> {
    public Integer studentId;
    public String firstName;
    public String secondName;
    public String lastName;

    public Student(Integer studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "\n" + "Student" + " " +
                studentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + "\n";
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
