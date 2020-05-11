package model;

public class Dog {
    private String name;
    private double age;
    private boolean healthy;
    private boolean fed;
    private boolean trained;
    private DogEnclousure aviaryToRest;

    public Dog(String name, double age, boolean healthy, boolean fed, boolean trained, DogEnclousure aviaryToRest){
        this.name=name;
        this.age=age;
        this.healthy=healthy;
        this.fed=fed;
        this.trained=trained;
        this.aviaryToRest=aviaryToRest;
    }

    public boolean getHealthStatus() {
        return healthy;
    }

    public void setHealthStatus(boolean healthy){
        this.healthy=healthy;
    }

    public double getAge() {
        return age;
    }

    public DogEnclousure getAviaryToRest() {
        return aviaryToRest;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public void setFed(boolean fed) {
        this.fed = fed;
    }

    public String getName() {
        return name;
    }

}
