

package Encapsulation10;


    public class Main {
        
     public static void main(String[] args) {
        Desktop desktop = new Desktop();

        desktop.setBrand("ComputeMaster");
        desktop.setProcessor("Intel Core i7");
        desktop.setRamSize(32);

        desktop.upgradeRam(32);

        System.out.println("Brand: " + desktop.getBrand());
        System.out.println("Processor: " + desktop.getProcessor());
        System.out.println("RAM Size: " + desktop.getRamSize() + "GB");
    }
     
 }

    

