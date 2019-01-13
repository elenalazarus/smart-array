package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.ArrayList;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    public MapDecorator(SmartArray sa, MyFunction func) {
        super(sa);
        Object[] edited_lst = new Object[sa.size()];
        Object[] initial_lst = sa.toArray();
        for (int i = 0; i < sa.size(); i ++) {
            edited_lst[i] = func.apply(initial_lst[i]);
        }
        smartArray.updateArray(edited_lst);
    }

        @Override
        public void updateArray (Object[]arrO){
            smartArray.updateArray(arrO);
    }

        @Override
        public Object[] toArray () {
        return smartArray.toArray();
    }

    @Override
    public Object[] toArray(Integer[] ints) {
        return new Object[0];
    }

    @Override
        public String operationDescription () {
        return null;
    }

        @Override
        public int size () {
        return smartArray.size();
        }
    }
