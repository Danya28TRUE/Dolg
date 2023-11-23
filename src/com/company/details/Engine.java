package com.company.details;

public class Engine {
    private int power;
    private String creator;
    public Engine(int power,String creator){
        this.power=power;
        this.creator =creator;
    }
    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power=power;
    }
    public String getCreator(){
        return creator;
    }
    public void setCreator(String creator){
        this.creator = creator;
    }

    public String toString(){
        return "Двигатель:"+
                "\n  Мощность=" + power + " лошадиных сил" +
                "\n  Производитель двигателя=" + creator ;
    }
}