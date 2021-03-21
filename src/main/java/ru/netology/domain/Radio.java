package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int firstStation = 0;
    private int lastStation = 10;
    private int amountStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(
            int currentStation,
            int firstStation,
            int lastStation,
            int amountStation) {
        if (currentStation > lastStation)
            return;
        if (currentStation < firstStation)
            return;
        this.currentStation = currentStation;
        this.firstStation = firstStation;
        this.lastStation = lastStation;
        this.amountStation = amountStation;
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

    public int getCurrentStation() {
        return currentStation;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public int getAmountStation() {return amountStation; }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

 public Radio (int currentVolume, int minVolume, int maxVolume){
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
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
