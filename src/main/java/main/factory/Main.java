package main.factory;

public class Main {

    public static void main(String[] args) {
       System.out.println("Start");
    
       
    Car  audi8 = new Car();    
    audi8.printAttributes();
    
    audi8.setModel("Audi broj 8");
    audi8.setCcm(1500);
    audi8.setBuildYear(2003);
    audi8.setColor("green");
    
    audi8.printAttributes();
    
   
    Car fiatPunto = new Car();
    fiatPunto.setModel("Fiat Grande");
    fiatPunto.setBuildYear (2001);
    
    fiatPunto.printAttributes();
    
    
    
    Car lada = new Car("Lada Niva", 1999, "black", 150, 1500);
    
    
    lada.printAttributes();
   
    Car Yugo = new Car("Yugo 45", 1999, 150, 120, 10, 12000);
    Yugo.printAttributes();
    
//    prvo putovanje
    Yugo.setMaxFuel(60);
    Yugo.setFuel(0);
    Yugo.setConsumption(10);
    
    Yugo.fuelUp(70);
    
    Yugo.goToTravel(300);
    Yugo.printAttributes();
    
//    drugo putovanje
    Yugo.goToTravel(50);
    Yugo.printAttributes();
    
    Yugo.goToTravel(25);
    Yugo.printAttributes();
    
    }
    
    
    
}
