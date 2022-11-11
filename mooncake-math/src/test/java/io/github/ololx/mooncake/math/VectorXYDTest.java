package io.github.ololx.mooncake.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.function.DoubleFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * project mooncake
 * created 06.11.2022 19:21
 *
 * @author Alexander A. Kropotin
 */
public class VectorXYDTest {

    @MethodSource("providesXYValues")
    @ParameterizedTest
    void new_whenConstructorCalledWithArgs_thenCreateVectorWithXY(double x, double y) {
       final VectorXYD vector = new VectorXYD(x, y);

       assertNotNull(vector);
       assertEquals(x, vector.getX());
       assertEquals(y, vector.getY());
    }

    @MethodSource("providesXYValues")
    @ParameterizedTest
    void getX_whenMethodCalled_thenReturnVectorXValue(double x) {
        final VectorXYD vector = new VectorXYD(x, 0);

        assertEquals(x, vector.getX());
    }

    @MethodSource("providesXYValues")
    @ParameterizedTest
    void setX_whenMethodCalled_thenSetVectorXValue(double x) {
        double initialX = 31 * x - 1;
        final VectorXYD vector = new VectorXYD(initialX, 0);
        vector.setX(x);

        assertNotEquals(initialX, vector.getX());
        assertEquals(x, vector.getX());
    }

    @MethodSource("providesXYValues")
    @ParameterizedTest
    void getY_whenMethodCalled_thenReturnVectorYValue(double y) {
        final VectorXYD vector = new VectorXYD(0, y);

        assertEquals(y, vector.getY());
    }

    @MethodSource("providesXYValues")
    @ParameterizedTest
    void setY_whenMethodCalled_thenSetVectorYValue(double y) {
        double initialY = 31 * y - 1;
        final VectorXYD vector = new VectorXYD(0, initialY);
        vector.setY(y);

        assertNotEquals(initialY, vector.getY());
        assertEquals(y, vector.getY());
    }

    @MethodSource("providesXYValues")
    @ParameterizedTest
    void length_whenMethodCalled_thenReturnVectorLength(double x, double y) {
        final VectorXYD vector = new VectorXYD(x, y);

        assertEquals(Math.hypot(x, y), vector.length());
    }

    @MethodSource("providesXYValues")
    @ParameterizedTest
    void normalize_whenMethodCalled_thenReturnNormalizedVector(double x, double y) {
        final VectorXYD vector = new VectorXYD(x, y);
        final VectorXYD normalizedVector = vector.normalize();

        assertNotEquals(vector, normalizedVector);
        assertEquals(vector.getX() / vector.length(), normalizedVector.getX());
        assertEquals(vector.getY() / vector.length(), normalizedVector.getY());
    }

    static Stream<Arguments> providesXYValues() {
        Random doubleRandom = new Random();
        double min = Double.MIN_VALUE, max = Double.MAX_VALUE;
        DoubleFunction<Double> random = value -> min + (max - min) * doubleRandom.nextDouble();

        return Stream.concat(
                Stream.of(arguments(0, 0)),
                IntStream.range(0, 20)
                        .asDoubleStream()
                        .mapToObj(index -> arguments(random.apply(index), random.apply(index)))
        );
    }

    @MethodSource("providesScalars")
    @ParameterizedTest
    void add_whenAddScalar_thenAddScalarToXYAndReturnNewVector(double scalar) {
        final VectorXYD vector = new VectorXYD(0, 0);
        final VectorXYD addedVector = vector.add(scalar);

        assertEquals(vector.getX() + scalar, addedVector.getX());
        assertEquals(vector.getY() + scalar, addedVector.getY());
    }

    static Stream<Arguments> providesScalars() {
        Random doubleRandom = new Random();
        double min = Double.MIN_VALUE, max = Double.MAX_VALUE;
        DoubleFunction<Double> random = value -> min + (max - min) * doubleRandom.nextDouble();

        return IntStream.range(0, 20)
                .asDoubleStream()
                .mapToObj(index -> arguments(random.apply(index)));
    }

    @MethodSource("providesVectors")
    @ParameterizedTest
    void add_whenAddAnotherVector_thenAddTheirXYAndReturnNewVector(VectorXYD otherVector) {
        final VectorXYD vector = new VectorXYD(0, 0);
        final VectorXYD addedVector = vector.add(otherVector);

        assertEquals(vector.getX() + otherVector.getX(), addedVector.getX());
        assertEquals(vector.getY() + otherVector.getY(), addedVector.getY());
    }

    static Stream<Arguments> providesVectors() {
        Random doubleRandom = new Random();
        double min = Double.MIN_VALUE, max = Double.MAX_VALUE;
        DoubleFunction<Double> random = value -> min + (max - min) * doubleRandom.nextDouble();

        return IntStream.range(0, 20)
                .asDoubleStream()
                .mapToObj(index -> {
                    return arguments(new VectorXYD(random.apply(index), random.apply(index)));
                });
    }
}
