package com.ray.thinkinginjava.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Administrator
 */
public class IteratorSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        System.out.println(list.getClass());
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
//            list.remove("ddd");
            // Cannot Remove element during the loop
        }

        printStarsLine();

        for (String s : list) {
            System.out.println(s);
//            list.remove("ddd");
            // Cannot remove element during the loop
        }

        printStarsLine();

        list.stream()
                .filter(s -> s == "aaa")
                .forEach(s -> {
                    System.out.println(s);
//            list.remove("aaa");
                });
    }

    static void printStarsLine() {
        System.out.println("**************************************************************************");
    }
}
