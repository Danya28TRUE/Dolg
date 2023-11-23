package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;
public class Lorry extends Car {
    private int gryzoPodiem;
    private Driver driver;
    private Engine engine;
    //конструктор
    public Lorry(String brand,String carClass, int ves,Driver driver,Engine engine,int gryzoPodiem){
        super(brand,carClass, ves,driver,engine);
        this.gryzoPodiem = gryzoPodiem;
        this.engine=engine;
        this.driver=driver;
    }
    //get и set
    public int getGryzoPodiem(){

        return gryzoPodiem;
    }
    public void setGryzoPodiem(int gryzoPodiem){

        this.gryzoPodiem = gryzoPodiem;
    }
    @Override
    public Driver getDriver() {
        return driver;
    }
    @Override
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    @Override
    public Engine getEngine() {
        return engine;
    }
    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    //toString
    @Override
    public String toString(){
        return super.toString() + "\n  Грузоподъёмность кузова: "+ gryzoPodiem + " кг" +
                "\n"+engine.toString()+";"+
                "\nВодитель: "+driver.toString()+"\n";
    }
}