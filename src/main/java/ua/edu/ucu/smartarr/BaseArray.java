package ua.edu.ucu.smartarr;

import java.util.List;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] lst;

    public BaseArray(Object[] arr) {
        lst = arr;
    }



    @Override
    public void updateArray(Object[] arrO) {lst = arrO;}

    @Override
    public Object[] toArray() {
        return lst;
    }


    public Object[] toArray(Integer[] ints) {
        this.updateArray(ints);
        return (new NumbersDecorator(this)).toArray();
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return lst.length;
    }
}
