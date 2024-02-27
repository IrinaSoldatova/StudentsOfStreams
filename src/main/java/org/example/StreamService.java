package org.example;

import java.util.List;

public class StreamService {
    List<Stream> stream;

    public StreamService(List<Stream> stream) {
        this.stream = stream;
    }

    public void sortStreamList(List<Stream> streamList) {
        StreamComparator comparator = new StreamComparator();
        streamList.sort(comparator);
    }
}
