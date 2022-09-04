package com.jewel.ce.domain;

public enum Difficulty {
    EASY, MEDIUM, HARD, VARIES;

    public static Difficulty findByName(String name){
        for (Difficulty d: Difficulty.values()){
            if(d.name()==name){
                return d;
            }
        }
        return null;
    }
}
