package com.ray.thinkinginjava.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraySample {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        // IndexOutOfBoundsException
        for (String s : list) {
            System.out.println(s);
            list.remove(2);
        }

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            list.remove(2);
        }
    }
}
