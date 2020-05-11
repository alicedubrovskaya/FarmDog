package view;

import controller.ControlDogList;
import controller.ControlStaffList;
import service.StaffService;
import model.Dog;
import model.Staff;

public class AviaryCleaning {
    ControlDogList controlDogList;
    ControlStaffList controlStaffList;

    public AviaryCleaning(ControlDogList controlDogList, ControlStaffList controlStaffList){
        this.controlDogList=controlDogList;
        this.controlStaffList=controlStaffList;
    }

    public void cleanAviaries(){
        Staff cleaner = null;
        for (Staff staff: controlStaffList.getStaffList()){
            if (controlStaffList.getStaffTypeOfActivity(staff).equals("cleaner")){
                cleaner=staff;
            }
        }
        for (Dog dog: controlDogList.getDogList()){
            StaffService.clean(dog, cleaner);
        }
    }
}
