package com.ray.thinkinginjava.basic;

/**
 * @author Ray
 */

public enum Day {
    Monday(1, "Mon"),
    Tuesday(2, "Tue"),
    Wednesday(3, "Wen"),
    Thursday(4, "Thu"),
    Friday(5, "Fri"),
    Saturday(6, "Sat"),
    Sunday(7, "Sun");

    private int dayno;
    private String shortName;

    public int getDayno() {
        return dayno;
    }

    public String getShortName() {
        return shortName;
    }

    Day(int dayno, String shortName) {
        this.dayno = dayno;
        this.shortName = shortName;
    }

    public static Day getDayByNo(int dayno){
        switch (dayno)
        {
            case 1: return Monday;
            case 2: return Tuesday;
            default: return  null;
        }
    }

    public static Day getDayByShortName(String shortName){
        switch (shortName){
            case "Mon": return  Monday;
            case "Tue": return Tuesday;
            default: return null;
        }
    }
}
