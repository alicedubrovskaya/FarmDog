package model;

import java.util.ArrayList;
import java.util.List;

public class TrainingGround {
    private List<Dog> trainingDogs;

    public TrainingGround(){
        trainingDogs=new ArrayList<>();
    }

    public void addToTrainingDog(Dog trainingDog) {
        trainingDogs.add(trainingDog);
    }

    public void clearTrainingDogs() {
        trainingDogs.clear();
    }

    public List<Dog> getTrainingDogs() {
        return trainingDogs;
    }
}
