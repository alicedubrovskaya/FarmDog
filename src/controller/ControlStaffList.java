package controller;

import model.staff.*;
import view.Feeding;

import java.util.List;

public class ControlStaffList {
    private StaffList staffList;

    public ControlStaffList(StaffList staffList) {
        this.staffList = staffList;
    }

    public void addToFeederList(Feeder feeder) {
        staffList.addToFeederList(feeder);
    }

    public List<Feeder> getFeederList() {
        return staffList.getFeederList();
    }

    public void addToCleanerList(Cleaner cleaner) {
        staffList.addToCleanerList(cleaner);
    }

    public List<Cleaner> getCleanerList() {
        return staffList.getCleanerList();
    }

    public void addToTrainerList(Trainer trainer) {
        staffList.addToTrainerList(trainer);
    }

    public List<Trainer> getTrainerList() {
        return staffList.getTrainerList();
    }
}
