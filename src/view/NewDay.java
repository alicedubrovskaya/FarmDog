package view;

import controller.ControlDogList;
import controller.ControlStaffList;
import controller.ControlTrainingGround;
import controller.ControlVeterinarian;
import model.Dog;
import model.DogEnclousure;
import model.Staff;

import java.util.ArrayList;
import java.util.List;

public class NewDay {
    ControlDogList controlDogList;
    ControlStaffList controlStaffList;
    ControlTrainingGround controlTrainingGround;
    ControlVeterinarian controlVeterinarian;
    private List<Dog> dogs=new ArrayList<>();



    public NewDay(ControlDogList controlDogList, ControlStaffList controlStaffList, ControlTrainingGround controlTrainingGround,
                  ControlVeterinarian controlVeterinarian){
        this.controlDogList=controlDogList;
        this.controlStaffList=controlStaffList;
        this.controlTrainingGround=controlTrainingGround;
        this.controlVeterinarian=controlVeterinarian;

        initializeDogs();
        initializeStaff();
        startNewDay();
    }

    public void initializeDogs(){
        controlDogList.add(new Dog("Charlie",10,false, false,false,
                new DogEnclousure(false)));
        controlDogList.add(new Dog("Coco", 3, true, false, true,
                new DogEnclousure(false)));
        controlDogList.add(new Dog("Molly",0.5, true, false, false,
                new DogEnclousure(false)));
    }

    public void initializeStaff(){
        controlStaffList.add(new Staff("Tom","feeder"));
        controlStaffList.add(new Staff("Oliver","cleaner"));
        controlStaffList.add(new Staff("Olivia","trainer"));
    }

    public void startNewDay(){
        Feeding morningFeeding=new Feeding(controlDogList,controlStaffList);
        morningFeeding.feedDogs();

        VeterinarianExamination veterinarianExamination=new VeterinarianExamination(controlDogList, controlVeterinarian);
        veterinarianExamination.examinateDogs();

        AviaryCleaning aviaryCleaning=new AviaryCleaning(controlDogList, controlStaffList);
        aviaryCleaning.cleanAviaries();

        DogsMainAtivities dogsMainAtivities=new DogsMainAtivities(controlDogList, controlStaffList,controlTrainingGround);
        dogsMainAtivities.doActions();

        Feeding eveningFeeding=new Feeding(controlDogList,controlStaffList);
        eveningFeeding.feedDogs();
    }
}
