
public class Main{
    public static void main(String[] args) {
        // Создайте экземпляр класса GeometryFigure
        GeometryFigure figureBox = new GeometryFigure();

        // Добавляем круг

        Circle circle = new Circle(10);
        figureBox.add(circle);

        // Добавляем прямоугольник

        Rectangle rectangle = new Rectangle(4, 6);
        figureBox.add(rectangle);
        
        // Добавляем треугольники
        Triangle triangle2 = new Triangle(10, 15, 19);
        figureBox.add(triangle2);


        // Отображать информацию обо всех фигурах
        
        figureBox.displayInfo();

        // Найдите фигуру
        IShape foundShape = figureBox.findByArea(24);
        if (foundShape != null) {
            System.out.println("Фигура найденна");
            figureBox.getInfo(figureBox.getIndex(foundShape));
            System.out.println("-------------------");
        }
        else {
            System.out.println("Фигура Не найденна");
        }
        // Удалите фигуру и отобразите обновленную информацию

        figureBox.remove(circle);
        
        figureBox.displayInfo();
    }
}