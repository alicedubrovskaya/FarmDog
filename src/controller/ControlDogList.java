package controller;

import model.dogs.*;
import model.DogEnclousure;

import java.util.List;

public class ControlDogList {
    private DogList dogList;

    public ControlDogList(DogList dogList) {
        this.dogList = dogList;
    }

    public String getDogName(Dog dog) {
        return dog.getName();
    }

    public double getDogAge(Dog dog) {
        return dog.getAge();
    }

    public DogEnclousure getDogAviaryToRest(Dog dog) {
        return dog.getAviaryToRest();
    }

    public void setDogIsFed(Dog dog) {
        dog.setIsFed();
    }

    public void setDogNotFed(Dog dog) {
        dog.setNotFed();
    }

    public void setDogEnclousureIsEmpty(Dog dog) {
        dog.getAviaryToRest().setIsEmpty();
    }

    public void setDogEnclousureNotEmpty(Dog dog) {
        dog.getAviaryToRest().setNotEmpty();
    }

    public void addToPuppyList(Puppy puppy) {
        dogList.addToPuppyList(puppy);
    }

    public List<Puppy> getPuppyList() {
        return dogList.getPuppyList();
    }

    public void addToAdultDogList(AdultDog adultDog) {
        dogList.addToAdultDogList(adultDog);
    }

    public List<AdultDog> getAdultDogList() {
        return dogList.getAdultDogList();
    }

    public void addToElderlyDogList(ElderlyDog elderlyDog) {
        dogList.addToElderlyDogList(elderlyDog);
    }

    public List<ElderlyDog> getElderlyDogList() {
        return dogList.getElderlyDogList();
    }
}
