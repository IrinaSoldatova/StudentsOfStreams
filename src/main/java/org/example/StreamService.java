package org.example;

import java.util.List;

public class StreamService {
    public void sortStreamList(List<Stream> streamList) {
        //streamList.sort((Stream s1, Stream s2) -> s1.groupList.size());
        StreamComparator comparator = new StreamComparator();
        streamList.sort(comparator);
    }
}
