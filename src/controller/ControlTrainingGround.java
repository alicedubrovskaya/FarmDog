package controller;

import model.dogs.Dog;
import model.TrainingGround;

import java.util.List;

public class ControlTrainingGround {
    private TrainingGround trainingGround;

    public ControlTrainingGround(TrainingGround trainingGround) {
        this.trainingGround = trainingGround;
    }

    public List<Dog> getTrainingGroundDogs() {
        return trainingGround.getTrainingDogs();
    }

    public void add(Dog dog) {
        trainingGround.addToTrainingDog(dog);
    }

    public void clear() {
        trainingGround.clearTrainingDogs();
    }
}
