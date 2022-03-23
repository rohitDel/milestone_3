package com.hashedIn.milestone_3.model;

import javax.persistence.*;

@Entity
public class NetflixMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String sNo;
    private String type;
    private String name;
    private String director;
    private String cast;
    private String country;
    @Column(name = "date_added")
    private String dateAdded;
    private String year;
    private String rating;
    private String duration;
    @Column(name = "listed_in")
    private String listedIn;
    private String about;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getListedIn() {
        return listedIn;
    }

    public void setListedIn(String listedIn) {
        this.listedIn = listedIn;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public NetflixMap(String sNo ,String type,String name,String director,String cast,String country,String dateAdded,String year,String rating,String duration,String listedIn,String about){
        this.sNo=sNo;
        this.type=type;
        this.name=name;
        this.director=director;
        this.cast=cast;
        this.country=country;
        this.dateAdded =dateAdded;
        this.year=year;
        this.rating=rating;
        this.duration=duration;
        this.listedIn =listedIn;
        this.about=about;


    }

    @Override
    public String toString() {
        return "sno.:"+this.getsNo() +" type:"+this.getType()+ " name: "+this.getName()+" director: "+this.getDirector() + " cast:"+this.getCast()+ " country: "+this.getCountry()+ " date_added:" +this.getDateAdded()+" year: "+this.getYear()+" rating: "+this.getRating()+" listed_in: "+this.getListedIn()+" about: "+this.getAbout();
    }

}

