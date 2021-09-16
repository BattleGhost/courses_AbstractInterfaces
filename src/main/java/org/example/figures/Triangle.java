package org.example.figures;

public class Triangle extends Shape{
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    @Override
    public double square() {
        return Math.abs((firstPoint.getX() * secondPoint.getY() +
                secondPoint.getX()*thirdPoint.getY() +
                thirdPoint.getX()*firstPoint.getY() -
                firstPoint.getY()*secondPoint.getX() -
                secondPoint.getY()*thirdPoint.getX() -
                thirdPoint.getY()*firstPoint.getX())/2.);
    }

    @Override
    public double perimeter() {
        return Math.sqrt(Math.pow(firstPoint.getX() - secondPoint.getX(), 2) +
                        Math.pow(firstPoint.getY() - secondPoint.getY(), 2)) +
                Math.sqrt(Math.pow(secondPoint.getX() - thirdPoint.getX(), 2) +
                        Math.pow(secondPoint.getY() - thirdPoint.getY(), 2)) +
                Math.sqrt(Math.pow(thirdPoint.getX() - firstPoint.getX(), 2) +
                        Math.pow(thirdPoint.getY() - firstPoint.getY(), 2));
    }

    @Override
    public void move(double dx, double dy) {

    }

    @Override
    public String toString() {
        return "Triangle" + super.toString();
    }
}
