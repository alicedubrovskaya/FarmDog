package view;

import controller.ControlDogList;
import controller.ControlVeterinarian;

import model.Dog;
import service.VeterinarianService;

public class VeterinarianExamination {
    ControlDogList controlDogList;
    ControlVeterinarian controlVeterinarian;


    public VeterinarianExamination(ControlDogList controlDogList, ControlVeterinarian controlVeterinarian) {
       this.controlVeterinarian=controlVeterinarian;
       this.controlDogList=controlDogList;
    }

    public void examinateDogs() {
        for (Dog dog : controlDogList.getDogList()) {
            VeterinarianService.examinateDog(dog, controlVeterinarian.getVeterinarianName());
        }
    }
}
