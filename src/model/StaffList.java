package model;

import model.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffList {
    private List<Staff> staffList;
    public StaffList(){
        staffList=new ArrayList<>();
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void addToStaffList(Staff staff){
        staffList.add(staff);
    }
}
