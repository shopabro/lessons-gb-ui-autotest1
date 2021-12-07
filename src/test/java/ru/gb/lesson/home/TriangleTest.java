package ru.gb.lesson.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    void arenaTriangle() {
        Triangle4 triangle4 = new Triangle4(3,4,5);
        double actualResult = triangle4.areaТriangle();
        assertEquals(6, actualResult);
    }
}
