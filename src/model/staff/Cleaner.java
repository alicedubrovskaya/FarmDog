package model.staff;

import model.dogs.Dog;

public class Cleaner extends Staff {
    private static final String INFORMATION_WHO = "Cleaner ";
    private static final String INFORMATION_ACTION = " cleans aviary of the dog ";

    public Cleaner(String name, String typeOfActivity) {
        super(name, typeOfActivity);
    }

    @Override
    public void works(Dog dog) {
        dog.getAviaryToRest().setIsClear();
        System.out.println(INFORMATION_WHO + this.getName() + INFORMATION_ACTION + dog.getName());
    }
}
