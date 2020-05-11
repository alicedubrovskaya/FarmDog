package view;

import controller.ControlDogList;
import controller.ControlStaffList;
import controller.ControlTrainingGround;
import model.*;
import service.StaffService;

import java.util.List;

public class DogsMainAtivities {
    ControlDogList controlDogList;
    ControlStaffList controlStaffList;
    ControlTrainingGround controlTrainingGround;

    public DogsMainAtivities(ControlDogList controlDogList,ControlStaffList controlStaffList,
                             ControlTrainingGround controlTrainingGround) {
       this.controlDogList=controlDogList;
       this.controlStaffList=controlStaffList;
       this.controlTrainingGround=controlTrainingGround;
    }

    public void doActions(){
        actionOfTheDog();
        startTrainingGround();
        dogsWantToEat();
        returnDogsToAviaries();
    }

    public void actionOfTheDog() { //work, training or rest
        for (Dog dog : controlDogList.getDogList()) {
            double age = controlDogList.getDogAge(dog);
            if (age < 1) {  //puppy
                controlDogList.setDogEnclousureEmpty(dog,true);
                controlTrainingGround.add(dog);
            } else if (age < 8) { //adult dog
                controlDogList.setDogEnclousureEmpty(dog,true);
            } else { //elderly dog
                controlDogList.setDogEnclousureEmpty(dog,false);
            }
        }
    }

    public void startTrainingGround() {
        Staff trainer = null;
        for (Staff staff : controlStaffList.getStaffList()) {
            if (controlStaffList.getStaffTypeOfActivity(staff).equals("trainer")) {
                trainer = staff;
            }
        }

        List<Dog> trainingDogs = controlTrainingGround.getTrainingGroundDogs();
        for (Dog dog : trainingDogs) {
           StaffService.train(dog, trainer);
        }
        controlTrainingGround.clear();
    }

    public void dogsWantToEat() {
        for (Dog dog : controlDogList.getDogList()) {
            controlDogList.setDogFed(dog,false);
        }
    }

    public void returnDogsToAviaries() {
        for (Dog dog : controlDogList.getDogList()) {
            if (controlDogList.getDogAge(dog) < 8) {
               controlDogList.setDogEnclousureEmpty(dog,false);
            }
        }
    }
}
