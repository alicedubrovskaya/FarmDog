package service;

import model.Dog;
import model.Staff;

public class StaffService {
    public static void feed(Dog dog, String nutrition, Staff staff){
        dog.setFed(true);
        System.out.println("Feeder "+staff.getName()+" feeds the dog "+dog.getName()+" with "+nutrition);
    }

    public static void clean(Dog dog, Staff staff){
        dog.getAviaryToRest().setClear(true);
        System.out.println("Cleaner "+staff.getName()+" cleans aviary of the dog "+dog.getName());
    }

    public static void train(Dog dog, Staff staff){
        dog.setTrained(true);
        System.out.println("Trainer "+ staff.getName()+" trains the dog "+dog.getName());
    }
}
