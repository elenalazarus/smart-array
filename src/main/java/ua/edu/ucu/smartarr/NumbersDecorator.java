package ua.edu.ucu.smartarr;

import java.util.ArrayList;

public class NumbersDecorator extends SmartArrayDecorator{
    public NumbersDecorator(SmartArray sa) {
        super(sa);
    }

    @Override
    public void updateArray(Object[] arrO) {
    }


    @Override
    public Object[] toArray() {
        ArrayList<Object> arr2 = new ArrayList<>();
        Object[] edited_list = new Object[smartArray.size()];
        for (int k = 0; k < smartArray.size(); k ++) {
            edited_list[k] = smartArray.toArray()[k];
        }

        for (int i = 0; i < smartArray.size(); i++){
            String number = String.valueOf(edited_list[i]);
            char[] digits1 = number.toCharArray();
            for (int k = 0; k < digits1.length; k ++) {
                arr2.add(digits1[k]);
            }

        }
        Object[] edited_list2 = new Object[arr2.size()];
        for (int i = 0; i < arr2.size(); i++){
            edited_list2[i] = arr2.get(i);
        }
        return edited_list2;
    }

    @Override
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
        return this.toArray().length;
    }
}
