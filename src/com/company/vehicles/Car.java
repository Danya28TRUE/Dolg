package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;
    private String carClass;
    private int ves;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String carClass, int ves, Driver driver, Engine engine){
        this.brand=brand;
        this.carClass=carClass;
        this.ves = ves;
        this.driver=driver;
        this.engine=engine;
    }

    public  String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public  String getCarClass(){
        return this.carClass;
    }
    public void setCarClass(String carClass){
        this.carClass=carClass;
    }
    public int getVes(){
        return this.ves;
    }
    public void setVes(int ves){
        this.ves = ves;
    }
    public Driver getDriver(){
        return this.driver;
    }
    public void setDriver(Driver driver){
        this.driver=driver;
    }
    public Engine getEngine(){
        return this.engine;
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
    @Override
    public String toString(){
        return "Машина:"+
                "\n  Марка авто: "+brand+
                "\n  Класс машины: "+carClass+
                "\n  Вес машины: "+ ves + " кг"+
                "\n"+engine.toString()+";"+
                "\nВодитель: "+driver.toString();
    }
}
