package com.ray.thinkinginjava.basic;

public class EnumSample {
    public static void main(String[] args) {
        Day monday = Day.Monday;

        System.out.println(monday.getDayno() + "|" + monday.getShortName());
        System.out.println(monday == Day.Monday);
        System.out.println(Day.getDayByNo(1));
        System.out.println(Day.getDayByShortName("Tue"));
        System.out.println(Day.getDayByShortName("Tuxe"));
    }
}
