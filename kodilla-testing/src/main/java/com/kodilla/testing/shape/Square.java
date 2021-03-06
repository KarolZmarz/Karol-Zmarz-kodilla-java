package com.kodilla.testing.shape;
import java.util.Objects;

public class Square implements Shape {

    private double side;
    private String name = "Square";

    public Square(double side) {
        this.side = side;
    }
    @Override
    public String getShapeName() {
        return name;
    }
    @Override
    public double getField() {
        return side*side ;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0 &&
                Objects.equals(name, square.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(side, name);
    }
}
