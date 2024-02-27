package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup(1, new ArrayList<>());
        studentGroup1.studentList.add(new Student(3, "Viktor", "Smirnov", "Viktorovich"));
        studentGroup1.studentList.add(new Student(2, "Ivan", "Ivanov", "Ivanovich"));
        studentGroup1.studentList.add(new Student(1, "Petr", "Petrov", "Petrovich"));
        studentGroup1.studentList.add(new Student(4, "Ivan", "Petrov", "Viktorovich"));

        StudentGroup studentGroup2 = new StudentGroup(2, new ArrayList<>());
        studentGroup2.studentList.add(new Student(8, "Vika", "Smirnova", "Viktorovna"));
        studentGroup2.studentList.add(new Student(6, "Irina", "Ivanova", "Ivanovna"));
        studentGroup2.studentList.add(new Student(7, "Polina", "Petrova", "Petrovna"));
        studentGroup2.studentList.add(new Student(5, "Nika", "Petrova", "Viktorovna"));

        StudentGroup studentGroup3 = new StudentGroup(3, new ArrayList<>());
        studentGroup3.studentList.add(new Student(9, "Viktoria", "Ivanova", "Viktorovna"));
        studentGroup3.studentList.add(new Student(11, "Egor", "Ivanov", "Ivanovich"));
        studentGroup3.studentList.add(new Student(11, "Pavel", "Petrov", "Petrovich"));
        studentGroup3.studentList.add(new Student(10, "Alina", "Petrova", "Viktorovna"));

        StudentGroup studentGroup4 = new StudentGroup(4, new ArrayList<>());
        studentGroup4.studentList.add(new Student(14, "Dima", "Smirnov", "Viktorovich"));
        studentGroup4.studentList.add(new Student(13, "Andrey", "Ivanov", "Ivanovich"));
        studentGroup4.studentList.add(new Student(16, "Anna", "Petrova", "Petrovna"));
        studentGroup4.studentList.add(new Student(15, "Diana", "Petrova", "Viktorovna"));

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

        StreamIterator streamIterator = new StreamIterator(streamList);
         while (streamIterator.hasNext()){
             System.out.println(streamIterator.next());
         }
        System.out.println("========================================================================");
         StreamService streamService = new StreamService(streamList);
         streamService.sortStreamList(streamList);
        System.out.println(streamList);

    }
}