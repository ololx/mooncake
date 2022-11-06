package io.github.ololx.mooncake.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mooncake.xyz.vector.Vector2;
import org.mooncake.xyz.vector.Vector2d;

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
@DisplayName("The VectorXYD test cases")
public class VectorXYDTest {

    @DisplayName("[positive]: test constructor of VectorXY")
    @MethodSource("providesRandomXYValues")
    @ParameterizedTest
    void new_whenConstructorCalledWithArgs_thenCreateVectorWithXY(double x, double y) {
       final VectorXY<?> vector = new VectorXYD(x, y);

       assertNotNull(vector);
       assertEquals(x, vector.getX());
       assertEquals(y, vector.getY());
    }

    static Stream<Arguments> providesRandomXYValues() {
        Random doubleRandom = new Random();
        double min = 0.0, max = Double.MAX_VALUE;
        DoubleFunction<Double> random = value -> min + (max - min) * doubleRandom.nextDouble();

        return IntStream.range(0, 20)
                .asDoubleStream()
                .mapToObj(index -> arguments(random.apply(index), random.apply(index)));
    }
}
