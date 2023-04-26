package Tuan2.Bai6_1;

public abstract class Square extends Rectangle {
    protected double side;
    public Square() {
    }
    public Square(double side){
        this.side=side;
    }
    public Square(double side, String color, boolean filled){
        super();
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLenggth(double lenggth) {
        super.setLenggth(lenggth);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "width=" + width +
                "lenggth=" + lenggth +
                '}';
    }
}
