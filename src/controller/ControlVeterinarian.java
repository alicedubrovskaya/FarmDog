package controller;

import model.Veterinarian;

public class ControlVeterinarian {
    private Veterinarian veterinarian;

    public ControlVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public String getVeterinarianName() {
        return veterinarian.getName();
    }
}
