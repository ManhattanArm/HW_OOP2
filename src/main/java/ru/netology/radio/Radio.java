package ru.netology.radio;

public class Radio {
    public int currentStationNumber;
    public int currentSoundVolume;
    int maxStationNumber = 9;
    int maxSoundVolume = 100;
    int minStationNumber = 0;
    int minSoundVolume = 0;

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > maxStationNumber || newCurrentStationNumber < minStationNumber) {
            return;
        }
        this.currentStationNumber = newCurrentStationNumber;
    }

    public void next() {
        if (currentStationNumber < maxStationNumber) {
            currentStationNumber++;
        } else {
            currentStationNumber = minStationNumber;
        }
    }

    public void prev() {
        if (currentStationNumber > minStationNumber) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStationNumber;
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
