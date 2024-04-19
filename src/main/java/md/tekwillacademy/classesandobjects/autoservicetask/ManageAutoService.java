package md.tekwillacademy.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage masterLuxObject = new Garage("Ion Creanga 23", 3, 220 );
        System.out.println(masterLuxObject.address);

        Garage autoLux = new Garage();
        System.out.println(autoLux.numberOfBoxes);
        autoLux.address = "Stefan Cel Mare 233";
        autoLux.dimensionSqFt = 250.6;
        autoLux.numberOfBoxes= 5;
        System.out.println("Informatii despre obiectul autoLux de pe adresa " + autoLux.address +
                " cu numarul de boxe "+ autoLux.numberOfBoxes +" si dimensiunea "+ autoLux.dimensionSqFt);

        Tool hammer001 = new Tool("Hammer");
        System.out.println(hammer001.material);

        Tool key = new Tool("Lucky Key");
        System.out.println(key.nameOfTheTool);

        Worker mirceaCelBatran = new Worker("Ion");
        System.out.println(mirceaCelBatran.pricePerHour);
        mirceaCelBatran.yearsOfExperience = 5;
        System.out.println(mirceaCelBatran.yearsOfExperience);

        Worker marcelCelPuternic = new Worker();

        Car masinaLuiNicoleta = new Car("Ferrari", "Red", 3, 4500);

        System.out.println(masinaLuiNicoleta.make);
        Car masinaLuiAdrian = new Car("Mercedes", "Black", 3, 5000 );
        System.out.println(masinaLuiAdrian.colorofTheCar);





    }
}
