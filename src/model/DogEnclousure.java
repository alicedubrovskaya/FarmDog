package model;

public class DogEnclousure {
    private boolean isEmpty; //there is no dog at this moment
    private boolean isClear;

    public DogEnclousure(boolean isClear){
        this.isClear=isClear;
        isEmpty=false;
    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public void setClear(boolean isClear) {
        this.isClear = isClear;
    }
}
