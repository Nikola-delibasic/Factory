
package main.factory;

public class Car {
    
    private String model;
    private int buildYear;
    private String color = "undefined";
    private int maxSpeed;
    private int Ccm;
    private int consumption;
    private int milage;
    
    public Car() {
        this.model = "";
        this.buildYear = -1;
        this.color = "undefined";
        this.maxSpeed = -1;
        this.Ccm = -1;
        this.consumption = 0;
        this.milage = 0;
    }
    
     public Car(String customModel, int BuildYear, String color, int maxSpeed, int Ccm) {
        this.model = customModel;
        this.buildYear = BuildYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.Ccm = Ccm;
        
    }

    public Car(String model, int buildYear, int maxSpeed, int Ccm, int consumption, int milage) {
        this.model = model;
        this.buildYear = buildYear;
        this.maxSpeed = maxSpeed;
        this.Ccm = Ccm;
        this.consumption = consumption;
        this.milage = milage;
        
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
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
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

    public void setConsumption(int consumption) {
        this.consumption = consumption; 
    }
    
    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public void printAttributes(){
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Ccm: " + this.getCcm());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Kilometraza: " + this.getMilage());
        System.out.println("Max Speed: " + this.getmaxSpeed());
        System.out.println();
    }
    
    public void goToTravel(int distance) {
       this.setMilage(this.getMilage() + distance);
    }

    
    
    
}
