package view;

import controller.ControlDogList;
import controller.ControlStaffList;
import service.StaffService;
import model.Dog;
import model.Staff;

public class Feeding {
    ControlDogList controlDogList;
    ControlStaffList controlStaffList;

    public Feeding(ControlDogList controlDogList, ControlStaffList controlStaffList) {
        this.controlDogList = controlDogList;
        this.controlStaffList=controlStaffList;
    }

    public void feedDogs(){
        Staff feeder=null;
        for (Staff staff: controlStaffList.getStaffList()){
            if (controlStaffList.getStaffTypeOfActivity(staff).equals("feeder")){
                feeder=staff;
            }
        }

        for (Dog dog: controlDogList.getDogList()){
            String nutrition;
            double age=controlDogList.getDogAge(dog);
            if (age<1){
                nutrition="Royal Canin for puppies";
            }
            else if (age<8){
                nutrition="Royal Canin for adult dogs";
            }
            else {
                nutrition="Royal Canin for elderly dogs";
            }
            StaffService.feed(dog, nutrition, feeder);
        }
    }

}
