package models;

public abstract class Vehicle {

    private String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    @Override
    public abstract void start(){
        System.out.println("starting");
    }
}
