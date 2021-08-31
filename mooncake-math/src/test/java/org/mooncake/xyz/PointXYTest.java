package org.mooncake.xyz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.mooncake.xyz.point.Point2D;
import org.mooncake.xyz.point.PointXY;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * @project mooncake
 * @created 2021-08-31 12:43
 * <p>
 * @author Alexander A. Kropotin
 */
@DisplayName("The PointXYTest test cases")
public class PointXYTest {

    static Stream<Arguments> getXAngleTestParamsProvider() {
        return Stream.of(
                arguments(1, 0, Math.toRadians(0)),
                arguments(1, 1, Math.toRadians(45)),
                arguments(0, 1, Math.toRadians(90)),
                arguments(-1, 1, Math.toRadians(-45)),
                arguments(-1, 0, Math.toRadians(0)),
                arguments(-1, -1, Math.toRadians(45)),
                arguments(0, -1, Math.toRadians(-90)),
                arguments(1, -1, Math.toRadians(-45))
        );
    }

    static Stream<Arguments> getRadiusTestParamsProvider() {
        return Stream.of(
                arguments(1, 0, 1),
                arguments(1, 1, 1.4142135623730951),
                arguments(0, 1, 1),
                arguments(-1, 1, 1.4142135623730951),
                arguments(-1, 0, 1),
                arguments(-1, -1, 1.4142135623730951),
                arguments(0, -1, 1),
                arguments(1, -1, 1.4142135623730951)
        );
    }

    @DisplayName("[positive]: test polar x angle calculation for the points from p1(1, 0) to p8(-1, 1) with step is 45 degree")
    @MethodSource("getXAngleTestParamsProvider")
    @ParameterizedTest
    public void getXAngle_createPointByCartesianXYCoordinates_returnRightPolarXAngle(double x, double y, double expectedXAngle) {
        double actualXAngle = new PointXY(x, y).getXAngle();

        assertTrue(
                actualXAngle == expectedXAngle,
                String.format("Expected %s, but was %s", Math.toDegrees(expectedXAngle), Math.toDegrees(actualXAngle))
        );
    }

    @DisplayName("[positive]: test polar radius calculation for the points from p1(1, 0) to p8(-1, 1) with step is 45 degree")
    @MethodSource("getRadiusTestParamsProvider")
    @ParameterizedTest
    public void getRadius_createPointByCartesianXYCoordinates_returnRightPolarRadius(double x, double y, double expectedRadius) {
        double actualRadius = new PointXY(x, y).getRadius();

        assertTrue(
                actualRadius == expectedRadius,
                String.format("Expected %s, but was %s", expectedRadius, actualRadius)
        );
    }
}
