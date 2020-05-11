package model;

public class Staff {
    private String name;
    private String typeOfActivity; //cleaner, trainer, feeder

    public Staff(String name, String typeOfActivity){
        this.name=name;
        this.typeOfActivity=typeOfActivity;
    }

    public String getTypeOfActivity() {
        return typeOfActivity;
    }

    public String getName() {
        return name;
    }
}
