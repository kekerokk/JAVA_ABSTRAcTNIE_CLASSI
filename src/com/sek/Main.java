package com.sek;

import java.awt.*;
abstract class Shape {
    private String color;

    public Shape(String color)
    {
        this.color = color;
    }

    public String toString()
    {
        return "Цвет фигуры: " + color;
    }

    abstract public double getArea();
}

class Rectangle extends Shape{
    private double length,width;

    public Rectangle(String color, double length,double width)
    {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        return length*width;
    }

    public String toString()
    {
        return super.toString() + "\n" + "Длина:" + length + "\n" + "Ширина: " + width;
    }
}
class Triangle extends Shape{
    private double base,height;

    public Triangle(String color, double base,double height)
    {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getArea()
    {
        return 0.5*base*height;
    }

    public String toString()
    {
        return super.toString() + "\n" + "База:" + base + "\n" + "Высота: " + height;
    }
}

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Rectangle("RED",5,4);
    }
}
