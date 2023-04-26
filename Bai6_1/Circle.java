package Tuan2.Bai6_1;

public abstract class Circle extends Shape{
    protected double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }
    public Circle (double radius){
        this.radius = radius;
    }
    public Circle(double radius ,String color,boolean filled  ){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                "filled='" + filled +'\'' +
                "radius='" + radius +'\''+
                '}';
    }
}
