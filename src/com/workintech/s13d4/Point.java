package com.workintech.s13d4;

public class Point {
    protected int x;
    protected int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p) {
        int _X = x - p.getX();
        int _Y = y - p.getY();
        return Math.sqrt(_X * _X + _Y * _Y);
    }

    public double distance(int a, int b) {
        int _X = x - a;
        int _Y = y - b;
        return Math.sqrt(_X * _X + _Y * _Y);
    }
}
