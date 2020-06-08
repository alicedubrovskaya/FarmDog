package model;

import model.dogs.Dog;

public class Veterinarian {
    private String name;
    private static final String INFORMATION_WHO = "Veterinarian ";
    private static final String INFORMATION_EXAMINATES = " examinates the dog ";
    private static final String INFORMATION_DOG_IS_ILL = "The dog is ill. Veterinarian treats the dog";
    private static final String INFORMATION_DOG_IS_HEALTHY = "The dog is healthy";


    public Veterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void examinateDog(Dog dog) {
        System.out.print(INFORMATION_WHO + this.getName() + INFORMATION_EXAMINATES + dog.getName() + ".");
        if (!dog.getHealthStatus()) {
            treat(dog);
            System.out.println(INFORMATION_DOG_IS_ILL);
        } else {
            System.out.println(INFORMATION_DOG_IS_HEALTHY);
        }
    }

    public void treat(Dog dog) {
        dog.setIsHealthy();
    }
}
