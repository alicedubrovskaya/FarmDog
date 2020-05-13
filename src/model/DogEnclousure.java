package model;

public class DogEnclousure {
    private boolean isEmpty;
    private boolean isClear;

    public void setIsEmpty() {
        this.isEmpty = true;
    }

    public void setNotEmpty() {
        this.isEmpty = false;
    }

    public void setIsClear() {
        this.isClear = true;
    }

    public void setNotClear() {
        this.isClear = false;
    }
}
