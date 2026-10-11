package problem6;
public class Square extends Forme {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSurface() {
        // Round to 2 decimal places to avoid floating point precision issues
        return (side * side) ;
    }

    public String toString() {
        return String.format("Square (side %.1f cm)", side);
    }
}