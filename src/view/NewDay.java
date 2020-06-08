package view;

import controller.ControlDogList;
import controller.ControlStaffList;
import controller.ControlTrainingGround;
import controller.ControlVeterinarian;
import model.dogs.AdultDog;
import model.dogs.Dog;
import model.DogEnclousure;
import model.dogs.ElderlyDog;
import model.dogs.Puppy;
import model.staff.Cleaner;
import model.staff.Feeder;
import model.staff.Trainer;

import java.util.ArrayList;
import java.util.List;

public class NewDay {

    private ControlDogList controlDogList;
    private ControlStaffList controlStaffList;
    private ControlTrainingGround controlTrainingGround;
    private ControlVeterinarian controlVeterinarian;

    public NewDay(ControlDogList controlDogList, ControlStaffList controlStaffList, ControlTrainingGround controlTrainingGround,
                  ControlVeterinarian controlVeterinarian) {
        this.controlDogList = controlDogList;
        this.controlStaffList = controlStaffList;
        this.controlTrainingGround = controlTrainingGround;
        this.controlVeterinarian = controlVeterinarian;

        initializeDogs();
        initializeStaff();
        startNewDay();
    }

    public void initializeDogs() {
        controlDogList.addToPuppyList(new Puppy.Builder()
                .withName("Molly")
                .withAge(0.5)
                .withDogEnclousure(new DogEnclousure())
                .build());
        controlDogList.addToAdultDogList(new AdultDog.Builder()
                .withName("Coco")
                .withAge(3)
                .withDogEnclousure(new DogEnclousure())
                .build());
        controlDogList.addToElderlyDogList(new ElderlyDog.Builder()
                .withName("Charlie")
                .withAge(10)
                .withDogEnclousure(new DogEnclousure())
                .build());
    }

    public void initializeStaff() {
        controlStaffList.addToFeederList(new Feeder("Tom", "feeder"));
        controlStaffList.addToCleanerList(new Cleaner("Oliver", "cleaner"));
        controlStaffList.addToTrainerList(new Trainer("Olivia", "trainer"));
    }

    public void startNewDay() {
        Feeding morningFeeding = new Feeding(controlDogList, controlStaffList);
        morningFeeding.feedDogs();

        VeterinarianExamination veterinarianExamination = new VeterinarianExamination(controlDogList, controlVeterinarian);
        veterinarianExamination.examinateDogs();

        AviaryCleaning aviaryCleaning = new AviaryCleaning(controlDogList, controlStaffList);
        aviaryCleaning.cleanAviaries();

        DogsMainAtivities dogsMainAtivities = new DogsMainAtivities(controlDogList, controlStaffList, controlTrainingGround);
        dogsMainAtivities.doActions();

        Feeding eveningFeeding = new Feeding(controlDogList, controlStaffList);
        eveningFeeding.feedDogs();
    }
}
