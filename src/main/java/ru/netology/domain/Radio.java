package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int firstStation = 0;
    private int lastStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > lastStation)
            return;
        if (currentStation < firstStation)
            return;
        this.currentStation = currentStation;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void changeNextStation() {
        if (currentStation == lastStation) {
            this.currentStation = firstStation;
        } else {
            currentStation++;
        }
    }

    public void changePrevStation() {
        if (currentStation == firstStation) {
            this.currentStation = lastStation;
        } else {
            currentStation--;
        }
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolume)
            currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume)
            currentVolume--;
    }
}
