package com.sek;

import java.awt.*;
interface Movable{

}
abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color,boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public Shape(){}
    public String GetColor(){return "Цвет фигуры: " + color;}
    public void SetColor(String _color){color = _color;}
    public boolean IsFilled(){return filled;}
    public void SetFilled(boolean filled){this.filled = filled;}

    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}
class Rectangle extends Shape{
    protected double length,width;

    public Rectangle(String color,boolean filled, double length,double width)
    {
        super(color,filled);
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length,double width)
    {
        this.length = length;
        this.width = width;
    }
    public Rectangle(){};

    public double getArea()
    {
        return length*width;
    }
    public double getPerimeter(){return 2*(length+width);}
    public String toString()
    {
        return "Цвет: " + super.color + "\n" + "Длина:" + length + "\n" + "Ширина: " + width;
    }
    public double GetWidth(){return width;}
    public void SetWidth(double width){this.width = width;}
    public double GetLength(){return length;}
    public void SetLength(double length){this.length = length;}
}
class Square extends Rectangle{
    public double side;
    public String color;
    public boolean filled;

    public Square(String color,boolean filled, double side)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){return side;}
    public void setSide(double side){this.side = side;}
}
class Circle extends Shape{
    protected double radius;
    public Circle(){};
    public Circle(double radius){this.radius = radius;}
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius(){return radius;}
    public void SetRadius(double radius){this.radius = radius;}
    public double getArea(){
        return 3.14 * Math.sqrt(radius);
    }
    public double getPerimeter(){
        return 2*radius*3.14;
    }
    public String toString(){
        return "Цвет: " + color + "Заполнен ли: " + filled + "Радиус: " + radius;
    }
}

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Rectangle("RED",true,5,4);
        System.out.println(s1.toString());
        System.out.println(s1.GetColor());
        Shape s2 = new Square("blue",true,3);
    }
}
