package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;
public class Lorry extends Car {
    private int gryzoPodiem;
    public Lorry(String brand,String carClass, int ves,Driver driver,Engine engine,int gryzoPodiem){
        super(brand,carClass, ves,driver,engine);
        this.gryzoPodiem = gryzoPodiem;
    }
    public int getGryzoPodiem(){

        return gryzoPodiem;
    }
    public void setGryzoPodiem(int gryzoPodiem){

        this.gryzoPodiem = gryzoPodiem;
    }

    @Override
    public String toString(){
        return super.toString() + "\n  Грузоподъёмность кузова: "+ gryzoPodiem + " кг";
    }
}