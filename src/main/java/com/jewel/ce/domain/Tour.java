package com.jewel.ce.domain;

import javax.persistence.*;

public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String title;

    @Column(length = 2000)
    private String description;

    @Column(length = 2000)
    private String blurb;

    @Column
    private Long price;

    @Column
    private String duration;

    @Column(length = 2000)
    private  String bullets;

    @Column
    private String keywords;

    @ManyToOne
    private TourPackage tourPackage;

    @Column
    @Enumerated
    private Difficulty dificulty;

    @Column
    @Enumerated
    private Region region;

    public Tour(String title, String description, String blurb, Long price, String duration, String bullets, String keywords, TourPackage tourPackage, Difficulty difficulty, Region region) {
        this.title = title;
        this.description = description;
        this.blurb = blurb;
        this.price = price;
        this.duration = duration;
        this.bullets = bullets;
        this.keywords = keywords;
        this.tourPackage = tourPackage;
        this.dificulty = difficulty;
        this.region = region;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", blurb='" + blurb + '\'' +
                ", price=" + price +
                ", duration='" + duration + '\'' +
                ", bullets='" + bullets + '\'' +
                ", keywords='" + keywords + '\'' +
                ", tourPackage=" + tourPackage +
                ", dificulty=" + dificulty +
                ", region=" + region +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getBlurb() {
        return blurb;
    }

    public Long getPrice() {
        return price;
    }

    public String getDuration() {
        return duration;
    }

    public String getBullets() {
        return bullets;
    }

    public String getKeywords() {
        return keywords;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public Difficulty getDificulty() {
        return dificulty;
    }

    public Region getRegion() {
        return region;
    }


}
