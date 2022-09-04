package com.jewel.ce.domain;

import javax.persistence.Column;
import javax.persistence.Id;

public class TourPackage {
    @Id
    @Column
    private String code;

    @Column
    private String name;

    protected TourPackage(){

    }

    public TourPackage(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TourPackage{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
