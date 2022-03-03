package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test                                           // Анализ граничных значений MAX
    void  shouldStepMaxToMin() {
        int expected = 0;
        Radio radio = new Radio();
        radio.setMaxStation();                      // Установить максимальное значение станции
        radio.setNextCurrentStation();              // Переключить на следующую
        int actual = radio.getCurrentStation();     // Получить текущее значение
        assertEquals(actual,expected);

    }

    @Test                                           // Анализ граничных значений MIN
    void  shouldStepMinToMax() {
        int expected = 9;
        Radio radio = new Radio();
        radio.setMinStation();                      // Установить минимальное значение станции
        radio.setPrevCurrentStation();              // Переключить на предыдущую
        int actual = radio.getCurrentStation();     // Получить текущее значение
        assertEquals(actual,expected);

    }

    @Test                                           // Анализ работы логики переключения
    void  shouldStepNextStation() {
        int expected = 1;
        Radio radio = new Radio();
        radio.setMinStation();                      // Установить минимальное значение станции
        radio.setNextCurrentStation();              // Переключить на следующую
        int actual = radio.getCurrentStation();     // Получить текущее значение
        assertEquals(actual,expected);

    }

    @Test                                           // Анализ работы логики переключения
    void  shouldStepPrevStation() {
        int expected = 8;
        Radio radio = new Radio();
        radio.setMaxStation();                      // Установить максимальное значение станции
        radio.setPrevCurrentStation();              // Переключить на предыдущую
        int actual = radio.getCurrentStation();     // Получить текущее значение
        assertEquals(actual,expected);

    }

    @Test                                           // Анализ граничных значений MAX
    void  shouldNoStepMaxVolume() {
        int expected = 10;
        Radio radio = new Radio();
        radio.setMaxVolume();                       // Установить иаксимальное значение громкости
        radio.setNextVolumeLevel();                 // Повысить уровень
        int actual = radio.getCurrentVolume();      // Получить текущее значение
        assertEquals(actual,expected);

    }

    @Test                                           // Анализ граничных значений MIN
    void  shouldNoStepMinVolume() {
        int expected = 0;
        Radio radio = new Radio();
        radio.setMinVolume();                       // Установить минимальное значение громкости
        radio.setPrevVolumeLevel();                 // Понизить уровень
        int actual = radio.getCurrentVolume();      // Получить текущее значение
        assertEquals(actual,expected);

    }

    @Test                                           // Анализ работы логики переключения
    void  shouldStepMinVolume() {
        int expected = 1;
        Radio radio = new Radio();
        radio.setMinVolume();                       // Установить минимальное значение громкости
        radio.setNextVolumeLevel();                 // Повысить уровень
        int actual = radio.getCurrentVolume();      // Получить текущее значение
        assertEquals(actual,expected);

    }

    @Test                                           // Анализ работы логики переключения
    void  shouldStepMaxVolume() {
        int expected = 9;
        Radio radio = new Radio();
        radio.setMaxVolume();                       // Установить минимальное значение громкости
        radio.setPrevVolumeLevel();                 // Понизить уровень
        int actual = radio.getCurrentVolume();      // Получить текущее значение
        assertEquals(actual,expected);

    }

}