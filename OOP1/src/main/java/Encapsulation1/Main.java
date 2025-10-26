
package Encapsulation1;


public class Main {
 
    public static void main(String[] args) {
        
        Person person = new Person();

        person.setName("Sanjida");
        person.setAge(20);
        person.setCountry("Bangladesh");

        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}

