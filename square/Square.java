package square;

import interfacecolorable.Colorable;

public class Square implements Colorable {
    private double side;
    private String color;
    private boolean filled = true;

    public Square(){}

    public Square(double side){
        this.side=side;
    }

    public Square(double side , String color, boolean filled){
        this.side=side;
        this.color=color;
        this.filled=false;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double Area(){
        return side*side;
    }

    @Override
    public void howtocolor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
