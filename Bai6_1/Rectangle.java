package Tuan2.Bai6_1;

public abstract class Rectangle extends Shape {
    protected double width;
    protected double lenggth;

    public Rectangle() {
        this.width = 1.0;
        this.lenggth = 1.0;
    }

    public Rectangle(double width, double lenggth) {
        this.width = width;
        this.lenggth = lenggth;
    }

    public Rectangle(double width, double lenggth, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenggth = lenggth;
    }

    public double getLenggth() {
        return lenggth;
    }

    public void setLenggth(double lenggth) {
        this.lenggth = lenggth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenggth=" + lenggth +
                ", color=" + color +
                ", filled=" + filled +
                '}';
    }
}
