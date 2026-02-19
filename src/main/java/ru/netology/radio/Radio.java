package ru.netology.radio;

public class Radio {
    private int currentStationNumber;
    private int currentSoundVolume;
    private int defaultStation = 10;
    private final int minStationNumber = 0;
    private final int maxSoundVolume = 100;
    private final int minSoundVolume = 0;

    public Radio() {}

    public Radio(int numberOfStations) {
        this.defaultStation = numberOfStations;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public int getDefaultStation() {
        return defaultStation;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > defaultStation - 1 || newCurrentStationNumber < minStationNumber) {
            return;
        }
        this.currentStationNumber = newCurrentStationNumber;
    }

    public void next() {
        if (currentStationNumber < defaultStation - 1) {
            currentStationNumber++;
        } else {
            currentStationNumber = minStationNumber;
        }
    }

    public void prev() {
        if (currentStationNumber > minStationNumber) {
            currentStationNumber--;
        } else {
            currentStationNumber = defaultStation - 1;
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
