package model.staff;

import model.staff.Staff;
import view.Feeding;

import java.util.ArrayList;
import java.util.List;

public class StaffList {
    private List<Feeder> feederList = new ArrayList<>();
    private List<Cleaner> cleanerList = new ArrayList<>();
    private List<Trainer> trainerList = new ArrayList<>();

    public List<Feeder> getFeederList() {
        return feederList;
    }

    public void addToFeederList(Feeder feeder) {
        feederList.add(feeder);
    }

    public void addToCleanerList(Cleaner cleaner) {
        cleanerList.add(cleaner);
    }

    public List<Cleaner> getCleanerList() {
        return cleanerList;
    }

    public void addToTrainerList(Trainer trainer) {
        trainerList.add(trainer);
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }
}
