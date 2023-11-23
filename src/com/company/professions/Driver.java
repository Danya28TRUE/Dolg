package com.company.professions;

public class Driver extends Person{
    private int stajVoditel;
    public Driver(String fullName, int stajVoditel){
        super(fullName);
        this.stajVoditel =stajVoditel;
    }
    public int getStajVoditel(){
        return stajVoditel;
    }
    public void setStajVoditel(int stajVoditel){
        this.stajVoditel = stajVoditel;
    }

    @Override
    public String toString(){
        return super.toString()+ ";\n  Опыт вождения: "+ stajVoditel + " лет";
    }
}