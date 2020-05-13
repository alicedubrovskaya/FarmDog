package model.dogs;

import model.dogs.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogList {
    private List<Puppy> puppyList = new ArrayList<>();
    private List<AdultDog> adultDogList = new ArrayList<>();
    private List<ElderlyDog> elderlyDogList = new ArrayList<>();

    public void addToPuppyList(Puppy puppy) {
        puppyList.add(puppy);
    }

    public List<Puppy> getPuppyList() {
        return puppyList;
    }

    public void addToAdultDogList(AdultDog adultDog) {
        adultDogList.add(adultDog);
    }

    public List<AdultDog> getAdultDogList() {
        return adultDogList;
    }

    public void addToElderlyDogList(ElderlyDog elderlyDog) {
        elderlyDogList.add(elderlyDog);
    }

    public List<ElderlyDog> getElderlyDogList() {
        return elderlyDogList;
    }
}
