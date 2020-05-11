package service;

import model.Dog;

public class VeterinarianService {

    public static void examinateDog(Dog dog, String veterinarianName){
        System.out.print("Veterinarian "+veterinarianName+" examinates the dog "+dog.getName()+".");
        if (dog.getHealthStatus()==false){
            treat(dog);
            System.out.println("The dog is ill. Veterinarian treats the dog");
        }else
        {
            System.out.println("The dog is healthy");
        }
    }

    public static void treat(Dog dog){
        dog.setHealthStatus(true);
    }
}
