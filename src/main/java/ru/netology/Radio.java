package ru.netology;

import java.util.EnumSet;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio (int size) {
        maxStation = minStation + size - 1;    // Задание по улучшению
    }

    public Radio() {
    } // Задание по улучшению

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume--;
        }
    }
}

