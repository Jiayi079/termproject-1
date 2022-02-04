package packagetest;
import java.util.*;

import java.util.ArrayList;

public class GenericTest<T, A> {

    T data;
    GenericTest<T, A> next;

    public GenericTest(T data, GenericTest<T, A> next) {
        this.data = data;
        this.next = next;
    }

    public static void main(String[] args) {
        //bad practice
        List myList = new ArrayList();
        myList.add(1);
        myList.add("add");
        myList.add(1.4);

//        int a = 2 + (Integer)myList.get(1);
//        System.out.println(a);

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(4);
//        myList2.add("asd"); //doesn't work
//        myList2.add(4.1); // doesn't work

        GenericTest<Integer, Integer> node1 = new GenericTest<>(1, null);
        GenericTest<Integer, Integer> node2 = new GenericTest<>(2, node1);
    }
}
