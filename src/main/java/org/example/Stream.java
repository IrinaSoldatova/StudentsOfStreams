package org.example;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    public Integer streamNumber;
    public List<StudentGroup> streamList;

    public Stream(Integer streamNumber, List<StudentGroup> streamList) {
        this.streamNumber = streamNumber;
        this.streamList = streamList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return streamList.iterator();
    }
}
