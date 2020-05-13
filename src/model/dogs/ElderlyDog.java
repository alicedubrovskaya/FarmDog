package model.dogs;

import model.DogEnclousure;

public class ElderlyDog extends Dog {
    private static final String NUTRITION = "Royal Canin for elderly dogs";

    @Override
    public String getNUTRITION() {
        return NUTRITION;
    }

    public static class Builder {
        private ElderlyDog newElderlyDog;

        public Builder() {
            newElderlyDog = new ElderlyDog();
        }

        public Builder withName(String name) {
            newElderlyDog.setName(name);
            return this;
        }

        public Builder withAge(double age) {
            newElderlyDog.setAge(age);
            return this;
        }

        public Builder withDogEnclousure(DogEnclousure aviaryToRest) {
            newElderlyDog.setAviaryToRest(aviaryToRest);
            return this;
        }

        public ElderlyDog build() {
            return newElderlyDog;
        }
    }
}
