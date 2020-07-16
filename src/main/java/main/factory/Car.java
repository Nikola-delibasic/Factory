
package main.factory;

public class Car {
    
    private String model;
    private int buildYear;
    private String color;
    private int MaxSpeed;
    private int Ccm;
    private int consumption;
    private int Milage;
    private int fuel;
    
    public Car() {
        this.model = "undefined";
        this.buildYear = -1;
        this.color = "undefined";
        this.MaxSpeed = -1;
        this.Ccm = -1;
        this.consumption = 0;
        this.Milage = 0;
        this.fuel = 0;
    }
    
     public Car(String customModel, int BuildYear, String customcolor, int maxSpeed, int customCcm) {
        this.model = customModel;
        this.buildYear = BuildYear;
        this.color = customcolor;
        this.MaxSpeed = maxSpeed;
        this.Ccm = customCcm;
        this.consumption = consumption;
        this.fuel = fuel;
        
    }

    public Car(String model, int buildYear, int maxSpeed, int Ccm, int consumption, int Milage) {
        this.model = model;
        this.buildYear = buildYear;
        this.MaxSpeed = maxSpeed;
        this.Ccm = Ccm;
        this.consumption = consumption;
        this.Milage = Milage;
        this.fuel = fuel;
    }
    
     
     
    public String getModel() {
      return this.model;
    }
    
    public void setModel(String customModel){
        this.model =customModel;
    }
    
    public int getBuildYear(){
        return this.buildYear;
    }
    
    public void setBuildYear(int customBuildYear){
        this.buildYear = customBuildYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.MaxSpeed = maxSpeed;
    }

    public int getCcm() {
        return Ccm;
    }

    public void setCcm(int ccm) {
        this.Ccm = ccm;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int Consumption) {
        this.consumption = consumption; 
    }
    
    public int getMilage() {
        return Milage;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int Fuel) {
        this.fuel = fuel;
    }
    
    
    public void setMilage(int milage) {
        this.Milage = milage;
    }

    public void printAttributes(){
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Ccm: " + this.getCcm());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Kilometraza: " + this.getMilage());
        System.out.println("Trenutno goriva: " + this.getFuel() + " L ");
        System.out.println("Max Speed: " + this.getMaxSpeed());
        System.out.println();
    }
    
    public void goToTravel(int distance) {
        int fuelNeededForTravel = (distance / 100) * this.getConsumption();
        
        if (this.getFuel() > (distance / 100) * this.getConsumption()) {
            System.out.println("Uspesno predjen put od " + distance);
            this.setMilage(this.getMilage() + distance);
        }else{
            System.out.println("Nemate dovoljno goriva za put " + distance);
        }
       this.setMilage(this.getMilage() + distance);
    }

    
    
    
                
                
       
    }
    

