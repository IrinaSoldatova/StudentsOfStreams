package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup(new ArrayList<>());
        studentGroup1.studentList.add(new Student(1L, "Viktor", "Smirnov", "Viktorovich"));
        studentGroup1.studentList.add(new Student(2L, "Ivan", "Ivanov", "Ivanovich"));
        studentGroup1.studentList.add(new Student(3L, "Petr", "Petrov", "Petrovich"));
        studentGroup1.studentList.add(new Student(4L, "Ivan", "Petrov", "Viktorovich"));

        StudentGroup studentGroup2 = new StudentGroup(new ArrayList<>());
        studentGroup2.studentList.add(new Student(5L, "Vika", "Smirnova", "Viktorovna"));
        studentGroup2.studentList.add(new Student(6L, "Irina", "Ivanova", "Ivanovna"));
        studentGroup2.studentList.add(new Student(7L, "Polina", "Petrova", "Petrovna"));
        studentGroup2.studentList.add(new Student(8L, "Nika", "Petrova", "Viktorovna"));

        StudentGroup studentGroup3 = new StudentGroup(new ArrayList<>());
        studentGroup3.studentList.add(new Student(9L, "Viktoria", "Ivanova", "Viktorovna"));
        studentGroup3.studentList.add(new Student(10L, "Egor", "Ivanov", "Ivanovich"));
        studentGroup3.studentList.add(new Student(11L, "Pavel", "Petrov", "Petrovich"));
        studentGroup3.studentList.add(new Student(12L, "Alina", "Petrova", "Viktorovna"));

        StudentGroup studentGroup4 = new StudentGroup(new ArrayList<>());
        studentGroup4.studentList.add(new Student(13L, "Dima", "Smirnov", "Viktorovich"));
        studentGroup4.studentList.add(new Student(14L, "Andrey", "Ivanov", "Ivanovich"));
        studentGroup4.studentList.add(new Student(15L, "Anna", "Petrova", "Petrovna"));
        studentGroup4.studentList.add(new Student(16L, "Diana", "Petrova", "Viktorovna"));

        Stream stream1 = new Stream(1, new ArrayList<>());
        stream1.streamList.add(studentGroup3);
        stream1.streamList.add(studentGroup1);

        Stream stream2 = new Stream(2, new ArrayList<>());
        stream2.streamList.add(studentGroup2);
        stream2.streamList.add(studentGroup4);

        Stream stream3 = new Stream(3, new ArrayList<>());
        stream3.streamList.add(studentGroup2);
        stream3.streamList.add(studentGroup3);
        stream3.streamList.add(studentGroup1);

        Stream stream4 = new Stream(4, new ArrayList<>());
        stream4.streamList.add(studentGroup1);

        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream1);
        streamList.add(stream2);
        streamList.add(stream3);
        streamList.add(stream4);

        StreamService service = new StreamService();
        service.sortStreamList(streamList);
        for (Stream stream : streamList) {
            System.out.println();
            System.out.println("Stream #" + stream.streamNumber + ":");
            for (StudentGroup group : stream) {
                for (Student student : group) {
                    System.out.println(student);
                }
            }
        }
    }
}