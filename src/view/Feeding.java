package view;

import controller.ControlDogList;
import controller.ControlStaffList;
import model.dogs.Dog;
import model.staff.Feeder;
import model.staff.Staff;

public class Feeding {
    private ControlDogList controlDogList;
    private ControlStaffList controlStaffList;

    public Feeding(ControlDogList controlDogList, ControlStaffList controlStaffList) {
        this.controlDogList = controlDogList;
        this.controlStaffList = controlStaffList;
    }

    public void feedDogs() {
        Staff staff = null; //? Тип ссылки Staff, а метод вызывается тот, который определен только в Feeder
        //?  (не переопределенный из Staff) Тогда ссылку на объект нужно обязательно указывать Feeder?
        for (Feeder feeder : controlStaffList.getFeederList()) {
            staff = feeder;
        }

        for (Dog dog : controlDogList.getPuppyList()) {
            staff.works(dog, dog.getNUTRITION());
        }

        for (Dog dog : controlDogList.getAdultDogList()) {
            staff.works(dog, dog.getNUTRITION());
        }

        for (Dog dog : controlDogList.getElderlyDogList()) {
            staff.works(dog, dog.getNUTRITION());
        }
    }

}
