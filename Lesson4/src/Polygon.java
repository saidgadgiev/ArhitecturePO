import java.util.List;

public class Polygon implements IShape {
    private List<Double> sides;

    public Polygon(List<Double> sides) {
        this.sides = sides;
    }

    @Override
    public double getArea() {
        // Implementation of area calculation for polygon
        return 0;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    public void setSides(List<Double> sides) {
        this.sides = sides;
    }
}