package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class SportCar extends Car {
    private int maxSpeed;
    private Engine engine;
    private Driver driver;
    //конструктор
    public SportCar(String brand,String carClass,int weight,Driver driver,Engine engine,int maxSpeed){
        super(brand,carClass, weight,driver,engine);
        this.maxSpeed=maxSpeed;
        this.driver=driver;
        this.engine=engine;
    }
    //get и set
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    @Override
    public Engine getEngine() {
        return engine;
    }
    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    @Override
    public Driver getDriver() {
        return driver;
    }
    @Override
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    //toString
    @Override
    public String toString(){
        return super.toString()+"\n  Максимальная скорость: "+maxSpeed + " км/ч" +
                "\n"+engine.toString()+";"+
                "\nВодитель: "+driver.toString()+"\n";
    }
}