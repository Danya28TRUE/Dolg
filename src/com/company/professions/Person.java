package com.company.professions;

public class Person {
    private String nameVoditel;
    public Person(String nameVoditel){
        this.nameVoditel =nameVoditel;
    }
    public String getNameVoditel(){
        return nameVoditel;
    }
    public void setNameVoditel(String nameVoditel){
        this.nameVoditel = nameVoditel;
    }
    @Override
    public String toString(){
        return nameVoditel;
    }
}