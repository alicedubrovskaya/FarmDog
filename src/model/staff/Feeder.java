package model.staff;

import model.dogs.Dog;

public class Feeder extends Staff {
    private static final String INFORMATION_WHO = "Feeder ";
    private static final String INFORMATION_ACTION = " feeds the dog ";
    private static final String INFORMATION_NUTRITION = " with ";

    public Feeder(String name, String typeOfActivity) {
        super(name, typeOfActivity);
    }

    @Override
    public void works(Dog dog, String nutrition) {
        dog.setIsFed();
        System.out.println(INFORMATION_WHO + this.getName() + INFORMATION_ACTION + dog.getName() + INFORMATION_NUTRITION + nutrition);
    }
}
