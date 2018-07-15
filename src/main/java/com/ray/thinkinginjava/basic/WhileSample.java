package com.ray.thinkinginjava.basic;

public class WhileSample {
    public static void main(String[] args) {
        while(true){
            System.out.println("no end while.");
            break;
        }

        int i = 1;
        while(i > 1){
            // check expression first then do something.
        }

        do {
            // do something first , then do expression check.
        } while(i < 1);
    }
}
