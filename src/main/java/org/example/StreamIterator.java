package org.example;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<Stream> {
    private List<Stream> streamList;
    int count = 0;

    public StreamIterator(List<Stream> streamList) {
        this.streamList = streamList;
    }

    @Override
    public boolean hasNext() {
        return count < streamList.size();
    }

    @Override
    public Stream next() {
        if (!hasNext()) {
            return null;
        }
        return streamList.get(count++);
    }

}
