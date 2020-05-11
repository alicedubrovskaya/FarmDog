package controller;

import model.Staff;
import model.StaffList;

import java.util.List;

public class ControlStaffList {
    private StaffList staffList;
    public ControlStaffList(StaffList staffList){
        this.staffList=staffList;
    }

    public void add(Staff staff){
        staffList.addToStaffList(staff);
    }

    public List<Staff> getStaffList() {
        return staffList.getStaffList();
    }

    public String getStaffTypeOfActivity(Staff staff){
        return staff.getTypeOfActivity();
    }
}
