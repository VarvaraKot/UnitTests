public class Square {

    public double squareTriangle(double base, double height) {
        return (base * height) / 2;
    }

    public double squareRectangle(double lenght, double widht) {
        return lenght * widht;
    }

    public double squareParallelogram(double base, double height) {
        return base * height;
    }

    public double squareTrapezoid(double base1, double base2, double height) {
        return (base1 + base2) / 2 * height;
    }
}
