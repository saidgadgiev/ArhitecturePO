public class Rectangle implements IShape {
    private double lenght;
    private double widht;

    public Rectangle (double lenght, double widht) {
        this.lenght = lenght;
        this.widht = widht;
    }
    @Override
    public double getArea() {
        return lenght * widht;
    }

    @Override
    public double getPerimeter() {
        return 2 * (lenght + widht);
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }
}