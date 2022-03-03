package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentStation(){

        return currentStation;
    }

    public void setMaxStation() {
        currentStation = 9;
    }

    public void setMinStation() {
        currentStation = 0;
    }

    public void setNextCurrentStation() {

        currentStation = currentStation == 9 ? 0 : ++currentStation;
    }

    public void setPrevCurrentStation() {

        currentStation = currentStation == 0 ? 9 : --currentStation;
    }

    public int getCurrentVolume(){

        return currentVolume;
    }

    public void setMaxVolume() {
        currentVolume = 10;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void setNextVolumeLevel() {

        if (currentVolume == 10) {
            return;
        } else {
            currentVolume++;
        }
    }

    public void setPrevVolumeLevel() {

        if (currentVolume == 0) {
            return;
        } else {
            currentVolume--;
        }
    }

}
