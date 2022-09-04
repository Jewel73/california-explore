package com.jewel.ce;

import com.jewel.ce.domain.Difficulty;
import com.jewel.ce.domain.Region;

public class Test {
    public static void main(String[] args) {

        Difficulty d = Difficulty.findByName("HARD");
        System.out.println(d.name());

        Region region = Region.findByName("Central_Coast");
        System.out.println(Region.Central_Coast.toString());
    }
}
