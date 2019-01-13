import ua.edu.ucu.SmartArrayApp;
import ua.edu.ucu.Student;
import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.functions.MyFunction;
import ua.edu.ucu.functions.MyPredicate;
import ua.edu.ucu.smartarr.*;

import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args){
        MyPredicate pr2 = new MyPredicate() {
            @Override
            public boolean test(Object t) {
                return (((Student) t).getYear()) == 2;
            }
        };

        MyPredicate pr3 = new MyPredicate() {
            @Override
            public boolean test(Object t) {
                return (((Student) t).getGPA()) >= 4;
            }
        };

        MyComparator cmp = new MyComparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (((Student) o1).getSurname().compareTo(((Student) o2).getSurname()));
            }
        };

        MyFunction func2 = new MyFunction() {
            @Override
            public Object apply(Object t) {
                return (((Student) t).getSurname() + ' ' + ((Student) t).getName());
            }
        };

        Student[] students = {
                new Student("Ivar", "Grimstad", 3.9, 2),
                new Student("Ittai", "Zeidman", 4.5, 1),
                new Student("Antons", "Kranga", 4.0, 2),
                new Student("Burr", "Sutter", 4.2, 2),
                new Student("Philipp", "Krenn", 4.3, 3),
                new Student("Tomasz", "Borek", 4.1, 2),
                new Student("Ittai", "Zeidman", 4.5, 1),
                new Student("Burr", "Sutter", 4.2, 2)};

//        SmartArray sa = new BaseArray(students);
//
//        sa = new DistinctDecorator(sa);
//        sa = new FilterDecorator(sa, pr2);
//        sa = new FilterDecorator(sa, pr3);
//        sa = new SortDecorator(sa, cmp);
//
//        SmartArray studentSmartArray = new MapDecorator(sa, func2);

//        System.out.println(Arrays.toString(sa.toArray()));
//        Object[] result = studentSmartArray.toArray();
//        System.out.println(Arrays.toString(result));
//        return Arrays.copyOf(result, result.length, String[].class);

        Integer[] numbers2 = {123, 456, 1527};
        SmartArray sa1 = new BaseArray(numbers2);
        SmartArray sa2 = new NumbersDecorator(sa1);
        System.out.println(Arrays.toString(sa2.toArray()));

        System.out.println(Arrays.toString(sa1.toArray()));
        numbers2[2] = 134;
//        sa1.updateArray(numbers2);
        System.out.println(Arrays.toString(sa1.toArray()));

        System.out.println(Arrays.toString(sa2.toArray()));

    }
}
