package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    int numStations = 30;

    @Test
        // Анализ граничных значений MAX
    void shouldStepMaxToMin() {
        int expected = 0;
        Radio radio = new Radio(numStations);
        radio.setMaxStation();                      // Установить максимальное значение станции
        radio.setNextCurrentStation();              // Переключить на следующую
        int actual = radio.getCurrentStation();     // Получить текущее значение
        assertEquals(actual, expected);

    }

    @Test
        // Анализ граничных значений MIN
    void shouldStepMinToMax() {
        int expected = numStations - 1;
        Radio radio = new Radio(numStations);
        radio.setMinStation();                      // Установить минимальное значение станции
        radio.setPrevCurrentStation();              // Переключить на предыдущую
        int actual = radio.getCurrentStation();     // Получить текущее значение
        assertEquals(actual, expected);

    }

    @Test
        // Анализ работы логики переключения
    void shouldStepNextStation() {
        int expected = 1;
        Radio radio = new Radio(numStations);
        radio.setMinStation();                      // Установить минимальное значение станции
        radio.setNextCurrentStation();              // Переключить на следующую
        int actual = radio.getCurrentStation();     // Получить текущее значение
        assertEquals(actual, expected);

    }

    @Test
        // Анализ работы логики переключения
    void shouldStepPrevStation() {
        int expected = numStations - 2;
        Radio radio = new Radio(numStations);
        radio.setMaxStation();                      // Установить максимальное значение станции
        radio.setPrevCurrentStation();              // Переключить на предыдущую
        int actual = radio.getCurrentStation();     // Получить текущее значение
        assertEquals(actual, expected);

    }

    @Test
    void shouldSetManualStation() {                                    // Номер станции не выходи за допустимые диапазоны
        int expected = 20;
        Radio radio = new Radio(numStations);
        radio.manualSetCurrentStation(20);              // Установить значение станции
        int actual = radio.getCurrentStation();                        // Получить текущее значение
        assertEquals(actual, expected);

    }

    @Test
    void shouldSetMaxManualStation() {                                // Номер станции имеет граничное значение
        int expected = 29;
        Radio radio = new Radio(numStations);
        radio.manualSetCurrentStation(29);              // Установить значение станции
        int actual = radio.getCurrentStation();                        // Получить текущее значение
        assertEquals(actual, expected);

    }

    @Test
    void shouldNoSetManualStation() {                                // Номер станции имеет граничное значение
        int expected = 0;
        Radio radio = new Radio(numStations);
        radio.manualSetCurrentStation(30);              // Установить значение станции
        int actual = radio.getCurrentStation();                        // Получить текущее значение
        assertEquals(actual, expected);

    }

    @Test
        // Анализ граничных значений MAX
    void shouldNoStepMaxVolume() {
        int expected = 100;
        Radio radio = new Radio();
        radio.setMaxVolume();                       // Установить иаксимальное значение громкости
        radio.setNextVolumeLevel();                 // Повысить уровень
        int actual = radio.getCurrentVolume();      // Получить текущее значение
        assertEquals(actual, expected);

    }

    @Test
        // Анализ граничных значений MIN
    void shouldNoStepMinVolume() {
        int expected = 0;
        Radio radio = new Radio();
        radio.setMinVolume();                       // Установить минимальное значение громкости
        radio.setPrevVolumeLevel();                 // Понизить уровень
        int actual = radio.getCurrentVolume();      // Получить текущее значение
        assertEquals(actual, expected);

    }

    @Test
        // Анализ работы логики переключения
    void shouldStepMinVolume() {
        int expected = 1;
        Radio radio = new Radio();
        radio.setMinVolume();                       // Установить минимальное значение громкости
        radio.setNextVolumeLevel();                 // Повысить уровень
        int actual = radio.getCurrentVolume();      // Получить текущее значение
        assertEquals(actual, expected);

    }

    @Test
        // Анализ работы логики переключения
    void shouldStepMaxVolume() {
        int expected = 99;
        Radio radio = new Radio();
        radio.setMaxVolume();                       // Установить минимальное значение громкости
        radio.setPrevVolumeLevel();                 // Понизить уровень
        int actual = radio.getCurrentVolume();      // Получить текущее значение
        assertEquals(actual, expected);

    }

}