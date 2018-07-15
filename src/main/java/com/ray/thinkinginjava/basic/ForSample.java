package com.ray.thinkinginjava.basic;

public class ForSample {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            continue;
        }

        for(;;){
            // no end loop
            break;
        }

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for (int i : numbers){
            System.out.println(i);
            return;
        }

    }
}
