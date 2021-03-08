package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationFirst() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(0);
        assertEquals(0, radio.getFirstStation());
    }

    @Test
    public void shouldSetCurrentStationLast() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(9);
        assertEquals(9, radio.getLastStation());
    }

    @Test
    public void shouldSetCurrentStationAfterLast() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationUnderFirst() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextStationPreLast() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());

        radio.changeNextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextStationBetweenLastFirst() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());

        radio.changeNextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextStationFirst() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.changeNextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextStationLast() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());

        radio.changeNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStationUnderFirst() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        assertEquals(1, radio.getCurrentStation());

        radio.changePrevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevRadioStationBetweenLastFirst() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());

        radio.changePrevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStationLast() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());

        radio.changePrevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStationFirst() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());

        radio.changePrevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(10);
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void shouldSetCurrentVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldSetCurrentVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());

        radio.increaseCurrentVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());

        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());

        radio.decreaseCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}