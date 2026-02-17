package ru.netology.radio;

public class Radio {
    private int currentStationNumber;
    private int getCurrentSoundVolume;
    private int defaultMaxStationNumbers = 10;
    private final int minStationNumber = 0;
    private final int maxSoundVolume = 100;
    private final int minSoundVolume = 0;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentSoundVolume() {
        return getCurrentSoundVolume;
    }

    public int getDefaultMaxStationNumbers() {
        return defaultMaxStationNumbers;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }


    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.defaultMaxStationNumbers = numberOfStations;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > defaultMaxStationNumbers - 1 || newCurrentStationNumber < minStationNumber) {
            return;
        }
        this.currentStationNumber = newCurrentStationNumber;
    }

    public void next() {
        if (currentStationNumber < defaultMaxStationNumbers - 1) {
            currentStationNumber++;
        } else {
            currentStationNumber = minStationNumber;
        }
    }

    public void prev() {
        if (currentStationNumber > minStationNumber) {
            currentStationNumber--;
        } else {
            currentStationNumber = defaultMaxStationNumbers - 1;
        }
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume > maxSoundVolume || newCurrentSoundVolume < minSoundVolume) {
            return;
        }
        this.getCurrentSoundVolume = newCurrentSoundVolume;

    }

    public void volumeUp() {
        if (getCurrentSoundVolume < maxSoundVolume) {
            getCurrentSoundVolume++;
        } else {
            getCurrentSoundVolume = maxSoundVolume;
        }
    }

    public void volumeDown() {
        if (getCurrentSoundVolume > minSoundVolume) {
            getCurrentSoundVolume--;
        } else {
            getCurrentSoundVolume = minSoundVolume;
        }
    }
}
