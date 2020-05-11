import controller.ControlDogList;
import controller.ControlStaffList;
import controller.ControlTrainingGround;
import controller.ControlVeterinarian;
import model.*;
import model.DogList;
import model.StaffList;
import view.NewDay;

public class Main {

    public static void main(String[] args) {

        DogList dogList=new DogList();
        StaffList staffList=new StaffList();
        TrainingGround trainingGround=new TrainingGround();
        Veterinarian veterinarian=new Veterinarian("Kate");

        ControlDogList controlDogList=new ControlDogList(dogList);
        ControlStaffList controlStaffList=new ControlStaffList(staffList);
        ControlTrainingGround controlTrainingGround=new ControlTrainingGround(trainingGround);
        ControlVeterinarian controlVeterinarian=new ControlVeterinarian(veterinarian);

        NewDay newDay=new NewDay(controlDogList, controlStaffList, controlTrainingGround, controlVeterinarian);

    }
}
