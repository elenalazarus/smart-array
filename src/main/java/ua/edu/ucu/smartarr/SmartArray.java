package ua.edu.ucu.smartarr;

public interface SmartArray{

    void updateArray(Object[] arrO);

    Object[] toArray(); // return array with SmartArray elements

    Object[] toArray(Integer[] ints);

    String operationDescription(); // return current operation name applied to SmartArray
    
    int size(); // return SmartArray size

}
