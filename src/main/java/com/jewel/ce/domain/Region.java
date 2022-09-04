package com.jewel.ce.domain;

public enum Region {

    Central_Coast("Central Coast"),
    Southern_California("Southern California"),
    East_California("East California");

    private String name;

    Region(String label) {
        this.name = label;
    }

    public static Region findByName(String label){
        for (Region l: Region.values()){
            if(l.name().equalsIgnoreCase(label)){
                return l;
            }
        }
        return null;
    }



}
