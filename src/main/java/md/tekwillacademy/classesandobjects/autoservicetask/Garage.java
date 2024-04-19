package md.tekwillacademy.classesandobjects.autoservicetask;

import java.sql.SQLOutput;

public class Garage {
    String address;

    int numberOfBoxes;

    double dimensionSqFt;

public Garage(String addressUsedforinitialization, int numberOfBoxes, double dimensionSqFt){
    address = addressUsedforinitialization;
    this.numberOfBoxes = numberOfBoxes;
    this.dimensionSqFt = dimensionSqFt;
}
public Garage(){
    System.out.println("A fost creeat un obiect care insa nu are nici un  parametru populat cu date concrecte," +
            "acesta este constructor definit fara parametri");

}
}
