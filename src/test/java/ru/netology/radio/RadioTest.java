package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void stationNumberTest() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfStationsTest() {
        Radio radio = new Radio(10);

        int expected = 10;
        int actual = radio.getDefaultMaxStationNumbers();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberMoreMaxTest() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(13);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberLessMinTest() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-5);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTest() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(5);
        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextAfterMaxTest() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousTest() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousAfterMinTest() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void soundVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(10);

        int expected = 10;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeMoreMaxTest() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(110);

        int expected = radio.getMinSoundVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeLessMinTest() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(-5);

        int expected = radio.getMinSoundVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpTest() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(10);
        radio.volumeUp();

        int expected = 11;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpAfterMaxTest() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(45);
        radio.volumeDown();

        int expected = 44;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownAfterMinTest() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
