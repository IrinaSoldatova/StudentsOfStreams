package org.example;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    public Integer studentGroupNumber;
    public List<Student> studentList;

    public StudentGroup(Integer studentGroupNumber, List<Student> studentList) {
        this.studentGroupNumber = studentGroupNumber;
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "\n" + "StudentGroup" + " " +
                studentGroupNumber + "\n" +
                studentList;
    }
}
