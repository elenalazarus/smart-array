package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    public SortDecorator(SmartArray sa, MyComparator cmp){
        super(sa);
        List<Object> lst = Arrays.asList(sa.toArray());
        lst.sort(cmp);
        Object[] arr = new Object[sa.size()];

        for (int k = 0; k < sa.size(); k++) {
            arr[k] = lst.get(k);
        }
        sa.updateArray(arr);
    }

    @Override
    public void updateArray(Object[] arrO) {
        smartArray.updateArray(arrO);
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray();
    }

    @Override
    public Object[] toArray(Integer[] ints) {
        return new Object[0];
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
