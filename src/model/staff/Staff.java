package model.staff;

import model.dogs.Dog;

public class Staff {
    private String name;
    private String typeOfActivity;
    private static final String INFORMATION_WORK = "Staff works";
    private static final String INFORMATION_NUTRITION = ". Nutrition";


    public Staff(String name, String typeOfActivity) {
        this.name = name;
        this.typeOfActivity = typeOfActivity;
    }

    public String getTypeOfActivity() {
        return typeOfActivity;
    }

    public String getName() {
        return name;
    }

    public void works(Dog dog) {
        System.out.println(INFORMATION_WORK);
    }

    public void works(Dog dog, String nutrition) {
        System.out.print(INFORMATION_WORK + INFORMATION_NUTRITION);
    }
}


