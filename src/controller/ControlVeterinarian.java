package controller;

import model.Veterinarian;

public class ControlVeterinarian {
    private Veterinarian veterinarian;

    public ControlVeterinarian(Veterinarian veterinarian){
        this.veterinarian=veterinarian;
    }

    public String getVeterinarianName() {
        return veterinarian.getName();
    }
}
