package view;

import controller.ControlDogList;
import controller.ControlStaffList;
import controller.ControlTrainingGround;
import model.dogs.Dog;
import model.staff.Staff;
import model.staff.Trainer;

import java.util.List;

public class DogsMainAtivities {
    private ControlDogList controlDogList;
    private ControlStaffList controlStaffList;
    private ControlTrainingGround controlTrainingGround;

    public DogsMainAtivities(ControlDogList controlDogList, ControlStaffList controlStaffList,
                             ControlTrainingGround controlTrainingGround) {
        this.controlDogList = controlDogList;
        this.controlStaffList = controlStaffList;
        this.controlTrainingGround = controlTrainingGround;
    }

    public void doActions() {
        actionOfTheDog();
        startTrainingGround();
        dogsWantToEat();
        returnDogsToAviaries();
    }

    public void actionOfTheDog() {
        for (Dog dog : controlDogList.getPuppyList()) {
            controlDogList.setDogEnclousureIsEmpty(dog);
            controlTrainingGround.add(dog);
        }
        for (Dog dog : controlDogList.getAdultDogList()) {
            controlDogList.setDogEnclousureIsEmpty(dog);
        }
        for (Dog dog : controlDogList.getElderlyDogList()) {
            controlDogList.setDogEnclousureNotEmpty(dog);
        }
    }

    public void startTrainingGround() {
        Staff staff = null;
        for (Trainer trainer : controlStaffList.getTrainerList()) {
            staff = trainer;
        }

        List<Dog> trainingDogs = controlTrainingGround.getTrainingGroundDogs();
        for (Dog dog : trainingDogs) {
            staff.works(dog);
        }
        controlTrainingGround.clear();
    }

    public void dogsWantToEat() {
        for (Dog dog : controlDogList.getPuppyList()) {
            controlDogList.setDogNotFed(dog);
        }
        for (Dog dog : controlDogList.getAdultDogList()) {
            controlDogList.setDogNotFed(dog);
        }
        for (Dog dog : controlDogList.getElderlyDogList()) {
            controlDogList.setDogNotFed(dog);
        }
    }

    public void returnDogsToAviaries() {
        for (Dog dog : controlDogList.getPuppyList()) {
            controlDogList.setDogEnclousureNotEmpty(dog);
        }
        for (Dog dog : controlDogList.getAdultDogList()) {
            controlDogList.setDogEnclousureNotEmpty(dog);
        }

    }
}
