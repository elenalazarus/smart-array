package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;
import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{
    private Object[] lst;

    public DistinctDecorator(SmartArray sa) {
        super(sa);
        ArrayList<Object> arr2 = new ArrayList<>();
        Object[] edited_list = new Object[sa.size()];
        for (int k = 0; k < sa.size(); k ++) {
            edited_list[k] = sa.toArray()[k];
        }
        int g = 0;
        for (int i = 0; i < sa.size(); i ++) {
            boolean a = false;
            for (int j = i + 1; j < sa.size(); j ++) {
                if (edited_list[i].equals(edited_list[j])) {
                    a = true;
                }

            }
            if (!a) {
                arr2.add(edited_list[i]);
                g += 1;
            }
        }
        Object[] arr3 = new Object[arr2.size()];
        for (int j = 0; j < arr2.size(); j ++) {
            arr3[j] = arr2.get(j);
        }

        smartArray.updateArray(arr3);
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
