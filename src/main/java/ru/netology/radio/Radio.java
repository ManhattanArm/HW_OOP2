package ru.netology.radio;

public class Radio {
    public int currentStationNumber;
    public int currentSoundVolume;
    int maxStationNumbers = 10;
    int minStationNumber = 0;
    int maxSoundVolume = 100;
    int minSoundVolume = 0;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.maxStationNumbers = numberOfStations;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > maxStationNumbers - 1 || newCurrentStationNumber < minStationNumber) {
            return;
        }
        this.currentStationNumber = newCurrentStationNumber;
    }

    public void next() {
        if (currentStationNumber < maxStationNumbers - 1) {
            currentStationNumber++;
        } else {
            currentStationNumber = minStationNumber;
        }
    }

    public void prev() {
        if (currentStationNumber > minStationNumber) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStationNumbers - 1;
        }
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume > maxSoundVolume || newCurrentSoundVolume < minSoundVolume) {
            return;
        }
        this.currentSoundVolume = newCurrentSoundVolume;

    }

    public void volumeUp() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume++;
        } else {
            currentSoundVolume = maxSoundVolume;
        }
    }

    public void volumeDown() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume--;
        } else {
            currentSoundVolume = minSoundVolume;
        }
    }
}
