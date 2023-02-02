package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);

        int expected = 9;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNegative() {
        Radio cond = new Radio();
        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationMoreThanTheRequired() {
        Radio cond = new Radio();
        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationOnTheFirst() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);

        cond.nextStation();

        int expected = 1;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationLast() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);

        cond.nextStation();

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationAccordingToTheList() {
        Radio cond = new Radio();
        cond.setCurrentStation(5);

        cond.nextStation();

        int expected = 6;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationToTheList() {
        Radio cond = new Radio();
        cond.setCurrentStation(7);

        cond.prevStation();

        int expected = 6;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationTheFirst() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);

        cond.prevStation();

        int expected = 9;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(10);

        int expected = 10;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume2() {
        Radio cond = new Radio();

        cond.setCurrentVolume(11);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume3() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

