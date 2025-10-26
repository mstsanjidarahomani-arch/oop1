package Encapsulation9;


public class Main {
    
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        phone.setBrand("Walton");
        phone.setModel("W1000");
        phone.setStorageCapacity(60);

        phone.increaseStorage(30);

        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage Capacity: " + phone.getStorageCapacity() + "GB");
    }
    
 }

    

