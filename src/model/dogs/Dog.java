package model.dogs;

import model.DogEnclousure;


public class Dog {
    private String name;
    private double age;
    private boolean healthy;
    private boolean fed;
    private boolean trained;
    private DogEnclousure aviaryToRest;
    private static final String NUTRITION = "Royal Canin";

    public boolean getHealthStatus() {
        return healthy;
    }

    public void setIsHealthy() {
        this.healthy = true;
    }

    public void setNotHealthy() {
        this.healthy = false;
    }

    public double getAge() {
        return age;
    }

    public DogEnclousure getAviaryToRest() {
        return aviaryToRest;
    }

    public void setIsTrained() {
        this.trained = true;
    }

    public void setNotTrained() {
        this.trained = false;
    }

    public void setIsFed() {
        this.fed = true;
    }

    public void setNotFed() {
        this.fed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setAviaryToRest(DogEnclousure aviaryToRest) {
        this.aviaryToRest = aviaryToRest;
    }

    public String getNUTRITION() {
        return NUTRITION;
    }

    public static class Builder {
        private Dog newDog;

        public Builder() {
            newDog = new Dog();
        }

        public Builder withName(String name) {
            newDog.name = name;
            return this;
        }

        public Builder withAge(double age) {
            newDog.age = age;
            return this;
        }

        public Builder withDogEnclousure(DogEnclousure aviaryToRest) {
            newDog.aviaryToRest = aviaryToRest;
            return this;
        }

        public Dog build() {
            return newDog;
        }
    }

}
