package model.dogs;

import model.DogEnclousure;

public class AdultDog extends Dog {
    private static final String NUTRITION = "Royal Canin for adult dogs";

    @Override
    public String getNUTRITION() {
        return NUTRITION;
    }

    public static class Builder {
        private AdultDog newAdultDog;

        public Builder() {
            newAdultDog = new AdultDog();
        }

        public Builder withName(String name) {
            newAdultDog.setName(name);
            return this;
        }

        public Builder withAge(double age) {
            newAdultDog.setAge(age);
            return this;
        }

        public Builder withDogEnclousure(DogEnclousure aviaryToRest) {
            newAdultDog.setAviaryToRest(aviaryToRest);
            return this;
        }

        public AdultDog build() {
            return newAdultDog;
        }
    }
}
