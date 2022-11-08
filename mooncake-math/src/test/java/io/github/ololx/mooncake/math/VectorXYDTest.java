package io.github.ololx.mooncake.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mooncake.xyz.vector.Vector2;
import org.mooncake.xyz.vector.Vector2d;

import java.math.BigDecimal;
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

    @MethodSource("providesRandomXYValues")
    @ParameterizedTest
    void new_whenConstructorCalledWithArgs_thenCreateVectorWithXY(double x, double y) {
       final VectorXYD vector = new VectorXYD(x, y);

       assertNotNull(vector);
       assertEquals(x, vector.getX());
       assertEquals(y, vector.getY());
    }

    @MethodSource("providesRandomXYValues")
    @ParameterizedTest
    void getX_whenMethodCalled_thenReturnVectorXValue(double x) {
        final VectorXYD vector = new VectorXYD(x, 0);

        assertEquals(x, vector.getX());
    }

    @MethodSource("providesRandomXYValues")
    @ParameterizedTest
    void setX_whenMethodCalled_thenSetVectorXValue(double x) {
        final VectorXYD vector = new VectorXYD(0, 0);
        vector.setX(x);

        assertNotEquals(0, vector.getX());
        assertEquals(x, vector.getX());
    }

    @MethodSource("providesRandomXYValues")
    @ParameterizedTest
    void getY_whenMethodCalled_thenReturnVectorYValue(double y) {
        final VectorXYD vector = new VectorXYD(0, y);

        assertEquals(y, vector.getY());
    }

    @MethodSource("providesRandomXYValues")
    @ParameterizedTest
    void setY_whenMethodCalled_thenSetVectorYValue(double y) {
        final VectorXYD vector = new VectorXYD(0, 0);
        vector.setY(y);

        assertNotEquals(0, vector.getY());
        assertEquals(y, vector.getY());
    }

    static Stream<Arguments> providesRandomXYValues() {
        DoubleFunction<Double> random = getDoubleRandomFunction();

        return IntStream.range(0, 20)
                .asDoubleStream()
                .mapToObj(index -> arguments(random.apply(index), random.apply(index)));
    }

    static DoubleFunction<Double> getDoubleRandomFunction() {
        Random doubleRandom = new Random();
        double min = 0.0, max = Double.MAX_VALUE;

        return value -> min + (max - min) * doubleRandom.nextDouble();
    }
}
