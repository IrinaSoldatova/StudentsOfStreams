package org.example;

import java.util.List;

public class StreamService {
    public void sortStreamList(List<Stream> streamList) {
        StreamComparator comparator = new StreamComparator();
        streamList.sort(comparator);
    }
}
