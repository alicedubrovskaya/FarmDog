package model.dogs;

import model.DogEnclousure;

public class Puppy extends Dog {
    private static final String NUTRITION = "Royal Canin for puppies";

    @Override
    public String getNUTRITION() {
        return NUTRITION;
    }

    public static class Builder {
        private Puppy newPuppy;

        public Builder() {
            newPuppy = new Puppy();
        }

        public Builder withName(String name) {
            newPuppy.setName(name);
            return this;
        }

        public Builder withAge(double age) {
            newPuppy.setAge(age);
            return this;
        }

        public Builder withDogEnclousure(DogEnclousure aviaryToRest) {
            newPuppy.setAviaryToRest(aviaryToRest);
            return this;
        }

        public Puppy build() {
            return newPuppy;
        }
    }
}
