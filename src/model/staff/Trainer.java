package model.staff;

import model.dogs.Dog;

public class Trainer extends Staff {
    private static final String INFORMATION_WHO = "Trainer ";
    private static final String INFORMATION_ACTION = " trains the dog ";

    public Trainer(String name, String typeOfActivity) {
        super(name, typeOfActivity);
    }

    @Override
    public void works(Dog dog) {
        dog.setIsTrained();
        System.out.println(INFORMATION_WHO + this.getName() + INFORMATION_ACTION + dog.getName());
    }
}
