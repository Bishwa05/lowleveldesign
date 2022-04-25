package iterator;

/**
 *
 * Leetcode 284. Peeking Iterator
 * https://leetcode.com/problems/peeking-iterator/
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator implements Iterator<Integer> {
    private final List<Integer> elements = new ArrayList<>();
    private int index;

    public PeekingIterator(Iterator<Integer> iterator){
        iterator.forEachRemaining(element -> elements.add(element));
    }

    public Integer peek(){
        if(!hasNext()) return -1;
        return elements.get(index);
    }

    public Integer next() {
        return elements.get(index++);
    }

    public boolean hasNext(){
        return index < elements.size();
    }
}
