package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создание двигателей
        Engine engineLorry = new Engine(250, "Camaz");
        Engine engineSport = new Engine(500,"Porshe");

        //Создание водителей
        Driver driverLorry = new Driver("Джордж Бущ", 20);
        Driver driverSport = new Driver("Джо Байден",37);

        //создание грузовика
        Lorry camaz = new Lorry("Camaz","Lorry",6000,driverLorry,engineLorry,7000);

        System.out.println(camaz.toString());
        //изменил
        engineLorry.setCreator("BMW");
        System.out.println(camaz);

        //создание спорткара
        SportCar porshe = new SportCar("Porshe","SportCar",2500,driverSport,engineSport,500);

        System.out.println(porshe);
    }


}