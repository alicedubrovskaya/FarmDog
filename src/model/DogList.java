package model;

import model.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogList {
    private List<Dog> dogList;
    public DogList(){
        dogList=new ArrayList<>();
    }

    public void addDogToList(Dog dog){
        dogList.add(dog);
    }

    public List<Dog> getDogList() {
        return dogList;
    }
}
