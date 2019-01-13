package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;
import java.util.Arrays;


// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{

    public FilterDecorator(SmartArray sa, MyPredicate predicate) {
        super(sa);
        ArrayList<Object> edited_lst = new ArrayList<>();

        int i = 0;
        for (Object o: smartArray.toArray()) {
            if (predicate.test(o)) {
                edited_lst.add(o);
                i += 1;
            }
        }
        Object[] arr2 = new Object[edited_lst.size()];
        for (int j = 0; j < edited_lst.size(); j ++) {
            arr2[j] = edited_lst.get(j);
        }
        smartArray.updateArray(arr2);
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
