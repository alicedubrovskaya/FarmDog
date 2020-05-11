package controller;

import model.Dog;
import model.DogEnclousure;
import model.DogList;

import java.util.List;

public class ControlDogList {
    private DogList dogList;

    public ControlDogList(DogList dogList){
        this.dogList=dogList;
    }

    public void add(Dog dog){
        dogList.addDogToList(dog);
    }

    public List<Dog> getDogList() {
        return dogList.getDogList();
    }

    public String getDogName(Dog dog){
            return dog.getName();
    }

    public double getDogAge(Dog dog){
        return dog.getAge();
    }

    public DogEnclousure getDogAviaryToRest(Dog dog){
        return dog.getAviaryToRest();
    }

    public void setDogFed(Dog dog, boolean fed){
        dog.setFed(fed);
    }

    public void setDogEnclousureEmpty(Dog dog, boolean isEmpty){
        dog.getAviaryToRest().setEmpty(isEmpty);
    }
}
