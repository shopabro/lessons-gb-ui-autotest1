package ru.gb.lesson.home;

import java.lang.Math;

public class Triangle4 {

    private int a;
    private int b;
    private int c;



    public Triangle4(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double  areaТriangle() {
        double p = (a + b + c) / 2;;
        double  s = (p * (p - a) * (p - b) * (p - c)) ;
        return Math.sqrt(s);
    }

}
