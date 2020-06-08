package view;

import controller.ControlDogList;
import controller.ControlStaffList;
import model.dogs.Dog;
import model.staff.Cleaner;
import model.staff.Staff;

public class AviaryCleaning {
    private ControlDogList controlDogList;
    private ControlStaffList controlStaffList;

    public AviaryCleaning(ControlDogList controlDogList, ControlStaffList controlStaffList) {
        this.controlDogList = controlDogList;
        this.controlStaffList = controlStaffList;
    }

    public void cleanAviaries() {
        Staff staff = null;
        for (Cleaner cleaner : controlStaffList.getCleanerList()) {
            staff = cleaner;
        }
        for (Dog dog : controlDogList.getPuppyList()) {
            staff.works(dog);
        }
        for (Dog dog : controlDogList.getAdultDogList()) {
            staff.works(dog);
        }
        for (Dog dog : controlDogList.getElderlyDogList()) {
            staff.works(dog);
        }
    }
}
