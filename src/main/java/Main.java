public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println("Площадь треугольника равна: " + square.squareTriangle(20.0, 10.0));
        System.out.println("Площадь прямоугольника равна: " + square.squareRectangle(15.0, 20.0));
        System.out.println("Площадь параллелограмма равна: " + square.squareParallelogram(5.0, 7.0));
        System.out.println("Площадь трапеции равна: " + square.squareTrapezoid(5.0, 4.0, 10.0));
    }
}