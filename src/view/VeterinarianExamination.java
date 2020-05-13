package view;

import controller.ControlDogList;
import controller.ControlVeterinarian;

import model.dogs.Dog;

public class VeterinarianExamination {
    private ControlDogList controlDogList;
    private ControlVeterinarian controlVeterinarian;

    public VeterinarianExamination(ControlDogList controlDogList, ControlVeterinarian controlVeterinarian) {
        this.controlVeterinarian = controlVeterinarian;
        this.controlDogList = controlDogList;
    }

    public void examinateDogs() {
        for (Dog dog : controlDogList.getPuppyList()) {
            controlVeterinarian.getVeterinarian().examinateDog(dog);
        }
        for (Dog dog : controlDogList.getAdultDogList()) {
            controlVeterinarian.getVeterinarian().examinateDog(dog);
        }
        for (Dog dog : controlDogList.getElderlyDogList()) {
            controlVeterinarian.getVeterinarian().examinateDog(dog);
        }
    }
}
