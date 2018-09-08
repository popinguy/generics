package kz.btsd.generics;

import java.util.ArrayList;
import java.util.List;

public class JavaVariance<T extends List<CharSequence>> {

    // private static T value; // compile time error

    public static void main(String[] args) {
        new JavaVariance<ArrayList<CharSequence>>();
        String[] stringsArray = new String[3];
        stringsArray[0] = "1";

        Object[] objectsArray = stringsArray;
        System.out.println(objectsArray[0]);
        objectsArray[1] = 1;

        ArrayList<String> stringsList = new ArrayList<>();
        // ArrayList<Object> objectsList = stringsList; // compile time error

        doNothing(new A<>());
        // doNothing(new A<String>());
        doNothing(new A<CharSequence>());
        doNothing2(new A<String>());
        doNothing3(new A<Object>());
    }

    private static void doNothing(A<CharSequence> arg) {
    }

    private static void doNothing2(A<? extends CharSequence> arg) {
    }

    private static void doNothing3(A<? super CharSequence> arg) {
    }

    static class A<T extends Object> {
        void doNothing(T arg) {
        }
    }

    public static <E> void setList(List<E> list) {
        // if (list instanceof ArrayList<Integer>) {} // compile time error
    }

    // public void print(List<String> stringList) { } // compile time error
    public void print(List<Integer> integerList) { }

}