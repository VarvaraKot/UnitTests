import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTests {
    Square sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new Square();
    }

    @BeforeAll
    static void started() {
        System.out.println("tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("test completed");
    }

    @AfterAll
    static void finishedAll() {
        System.out.println("tests completed");
    }

    @Test
    public void testSquareTriangle() {
        //arrange
        double a = 20.0, b = 10.0, expected = 100.0;
        //act
        double result = sut.squareTriangle(a, b);
        //assert
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("source")
    public void testSquareRectangle(double a, double b, double expected) {
        //act
        double result = sut.squareRectangle(a, b);
        //assert
        assertEquals(result, expected);
    }

    private static Stream<Arguments> source() {
        return Stream.of(Arguments.of(15.0, 20.0, 300.0));
    }

    @Test
    public void testSquareParallelogram() {
        //arrange
        double a = 5.0;
        double b = 7.0;
        double expected = 35.00;
        //act
        double result = sut.squareParallelogram(a, b);
        //assert
        assertEquals(result, expected);
    }

    @Test
    public void testSquareTrapezoid() {
        //arrange
        double a = 5.0;
        double b = 4.0;
        double c = 10.0;
        double expected = 45.0;
        //act
        double result = sut.squareTrapezoid(a, b, c);
        //assert
        assertEquals(result, expected);

    }
}
