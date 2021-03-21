package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio(8, 0, 15, 15);

        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeAmountStation(){
        Radio radio = new Radio(0, 0, 15, 15);
        assertEquals(15, radio.getAmountStation());
    }

    @Test
    public void shouldSetCurrentStationFirst() {
        Radio radio = new Radio(0, 0, 15, 15);
        assertEquals(0, radio.getFirstStation());
    }

    @Test
    public void shouldSetCurrentStationUnderFirst(){
        Radio radio = new Radio(-1, 0, 15, 15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationLast() {
        Radio radio = new Radio(15, 0, 15, 15);
        assertEquals(15, radio.getLastStation());
    }

    @Test
    public void shouldSetCurrentStationAfterLast() {
        Radio radio = new Radio(16, 0, 15, 15);

       assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextStationPreLast() {
        Radio radio = new Radio(14, 0, 15, 15);

        radio.changeNextStation();
        assertEquals(15, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextStationBetweenLastFirst() {
        Radio radio = new Radio(10, 0, 15, 15);

        radio.changeNextStation();
        assertEquals(11, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextStationFirst() {
        Radio radio = new Radio(0, 0, 15, 15);

        radio.changeNextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextStationLast() {
        Radio radio = new Radio(15, 0, 15, 15);

        radio.changeNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStationUnderFirst() {
        Radio radio = new Radio(1, 0, 15, 15);

        radio.changePrevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStationBetweenLastFirst() {
        Radio radio = new Radio(5, 0, 15, 15);

        radio.changePrevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStationLast() {
        Radio radio = new Radio(15, 0, 15, 15);

        radio.changePrevStation();
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStationFirst() {
        Radio radio = new Radio(0, 0, 15, 15);

        radio.changePrevStation();
        assertEquals(15, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio(8, 0, 100);

      assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMax() {
        Radio radio = new Radio(100, 0, 100);

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetCurrentVolumeOverMax() {
        Radio radio = new Radio(101, 0, 100);

      assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMin() {
        Radio radio = new Radio(0, 0, 100);

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldSetCurrentVolumeUnderMin() {
        Radio radio = new Radio(-1, 0, 100);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio(50, 0, 100);

        radio.increaseCurrentVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeMax() {
        Radio radio = new Radio(100, 0, 100);

        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio(55, 0, 100);

        radio.decreaseCurrentVolume();
        assertEquals(54, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeMin() {
        Radio radio = new Radio(0, 0, 100);

        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}