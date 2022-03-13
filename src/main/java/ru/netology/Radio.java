package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int numStations = 10;            //Максимальное кол-во радиостанций

    public Radio() {
    }

    public Radio(int numStations) {
        this.numStations = numStations;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setMaxStation() {
        this.currentStation = numStations - 1;
    }

    public void setMinStation() {
        this.currentStation = 0;
    }

    public void setNextCurrentStation() {

        this.currentStation = currentStation == numStations - 1 ? 0 : ++currentStation;
    }

    public void setPrevCurrentStation() {

        this.currentStation = currentStation == 0 ? numStations - 1 : --currentStation;
    }

    public void manualSetCurrentStation(int manualInputStation) {

        if (manualInputStation > numStations - 1) {
            return;
        } else {
            this.currentStation = manualInputStation;
        }
    }

    public int getCurrentVolume() {

        return this.currentVolume;
    }

    public void setMaxVolume() {
        this.currentVolume = 100;
    }

    public void setMinVolume() {
        this.currentVolume = 0;
    }

    public void setNextVolumeLevel() {

        if (currentVolume == 100) {
            return;
        } else {
            this.currentVolume++;
        }
    }

    public void setPrevVolumeLevel() {

        if (currentVolume == 0) {
            return;
        } else {
            this.currentVolume--;
        }
    }

}
