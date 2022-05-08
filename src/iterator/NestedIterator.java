package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Leetcode : 341. Flatten Nested List Iterator
 * https://leetcode.com/problems/flatten-nested-list-iterator/
 *
 */
interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

public class NestedIterator implements Iterator<Integer> {

    private List<Integer> integerList = new ArrayList<>();
    private int index =0;
    public NestedIterator(List<NestedInteger> nestedList) {
        for(NestedInteger nestedInteger : nestedList){
            flatten(nestedInteger);
        }
    }

    private void flatten(NestedInteger nested) {
        if(nested.isInteger())
            integerList.add(nested.getInteger());
        else
            for(NestedInteger nestedFromList : nested.getList()){
                flatten(nestedFromList);
            }
    }

    @Override
    public Integer next() {
        return integerList.get(index++);

    }

    @Override
    public boolean hasNext() {
        return index < integerList.size();
    }
}
