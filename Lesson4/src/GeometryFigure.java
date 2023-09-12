import java.util.ArrayList;
import java.util.List;

public class GeometryFigure {
    private List<IShape> toolbox;

    public GeometryFigure() {
        toolbox = new ArrayList<>();
    }

    // Метод для добаления новой фигуры
    public void add(IShape figure) {
        toolbox.add(figure);
    }
    // Метод для удаления фигуры
    public void remove(IShape shape) {
        toolbox.remove(shape);
    }



    // Метод поиска необходимой фигуры
    public IShape findByArea(double area) {
        for (IShape shape : toolbox) {
            if (shape.getArea() == area) {
                return shape;
            }
        }
        return null;
    }
    // Метод отображения подробной информации о фигурк

    public void getInfo(int index) {
        if (index >= 0 && index < toolbox.size()) {
            IShape shape = toolbox.get(index);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        } else {
            System.out.println("Invalid index");
        }
    }

    // Метод вывода информации на дисплей
    public void displayInfo() {
        for (IShape shape : toolbox) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("-----------------------------"); // separation line
        }
    }

    public int getIndex(IShape foundShape) {
        return 0;
    }
}
