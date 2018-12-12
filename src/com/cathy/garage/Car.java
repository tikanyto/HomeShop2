package com.cathy.garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{
    private int door;
    private int literPer100km;
    private String motor;
    private List<String> options = new ArrayList<String>();

    public Car(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimensions, int weight, int door, int litrePer100km, String motor, List<String> options) {
        super(modelName, description, manufacturer, year, color, speed, dimensions, weight);
        this.door = door;
        this.literPer100km = litrePer100km;
        this.motor = motor;
        this.options = options;
    }

    /** surcharge methode existante
     * declarer les methodes avec la meme signature
     */
        @Override
        public void start() {
            System.out.println("Je suis " + modelName + " je consomme " + literPer100km + "l au 100km et je démarre !" );
        }

        @Override
        public void stop() {
            System.out.println("Je suis " + modelName + " j'arrête mon moteur " + motor);
        }

    public void startHeadLight(){
        System.out.println("J'allume mes phares");
    }
    public void openTrunk(){
        System.out.println("J'ouvre mon coffre");
    }

    public int getDoor() {
        return door;
    }

    public int getLitrePer100km() {
        return literPer100km;
    }

    public String getMotor() {
        return motor;
    }

    public List<String> getOptions() {
        return options;
    }
}
