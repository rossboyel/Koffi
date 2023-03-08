package com.ross.kofino.entitiy;

import jakarta.persistence.*;


@Entity
@Table(name = "bean")
public class CoffeeBean {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bean_ID")
    private int beanID;

    private String name;
    private String region;
    private String producer;
    private String roast;
    private String country;
    private String method;
    private int elevation;


    public CoffeeBean(String name, String region, String producer, String roast, String country, String method,
     int elevation) {
        super();
        this.name = name;
        this.region = region;
        this.producer = producer;
        this.roast = roast;
        this.country = country;
        this.method = method;
        this.elevation = elevation;

    }

    public CoffeeBean() {

    }

    public int getBeanID() {
        return beanID;
    }

    public void setBeanID(int beanID) {
        this.beanID = beanID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "beanID=" + beanID +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", producer='" + producer + '\'' +
                ", roast='" + roast + '\'' +
                ", country='" + country + '\'' +
                ", method='" + method + '\'' +
                ", elevation=" + elevation +
                '}';
    }


}

