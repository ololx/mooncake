package org.mooncake.xyz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.mooncake.xyz.point.Point2D;
import org.mooncake.xyz.point.PointXY;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @project mooncake
 * @created 2021-08-31 12:43
 * <p>
 * @author Alexander A. Kropotin
 */
@DisplayName("The PointXYTest tests")
public class PointXYTest {

    @DisplayName("[positive]: test polar x angle calculation for the point p = (1, 0)")
    @Test
    public void getXAngle_getXAngleForPointXPos1Y0_returnAngle0() {
        Point2D pointP = new PointXY(1, 0);
        double expectedXAngle = Math.toRadians(0);

        double actualXAngle = pointP.getXAngle();

        assertTrue(
                actualXAngle == expectedXAngle,
                String.format("Expected %s, but was %s", expectedXAngle, actualXAngle)
        );
    }

    @DisplayName("[positive]: test polar x angle calculation for the point p = (1, 1)")
    @Test
    public void getXAngle_getXAngleForPointXPos1YPos1_returnAnglePos45() {
        Point2D pointP = new PointXY(1, 1);
        double expectedXAngle = Math.toRadians(45);

        double actualXAngle = pointP.getXAngle();

        assertTrue(
                actualXAngle == expectedXAngle,
                String.format("Expected %s, but was %s", expectedXAngle, actualXAngle)
        );
    }

    @DisplayName("[positive]: test polar x angle calculation for the point p = (0, 1)")
    @Test
    public void getXAngle_getXAngleForPointX0YPos1_returnAnglePos90() {
        Point2D pointP = new PointXY(0, 1);
        double expectedXAngle = Math.toRadians(90);

        double actualXAngle = pointP.getXAngle();

        assertTrue(
                actualXAngle == expectedXAngle,
                String.format("Expected %s, but was %s", expectedXAngle, actualXAngle)
        );
    }

    @DisplayName("[positive]: test polar x angle calculation for the point p = (-1, 0)")
    @Test
    public void getXAngle_getXAngleForPointXNeg1Y0_returnAngle0() {
        Point2D pointP = new PointXY(-1, 0);
        double expectedXAngle = Math.toRadians(0);

        double actualXAngle = pointP.getXAngle();

        assertTrue(
                actualXAngle == expectedXAngle,
                String.format("Expected %s, but was %s", expectedXAngle, actualXAngle)
        );
    }

    @DisplayName("[positive]: test polar x angle calculation for the point p = (0, -1)")
    @Test
    public void getXAngle_getXAngleForPointX0YNeg1_returnAngleNeg90() {
        Point2D pointP = new PointXY(0, -1);
        double expectedXAngle = Math.toRadians(-90);

        double actualXAngle = pointP.getXAngle();

        assertTrue(
                actualXAngle == expectedXAngle,
                String.format("Expected %s, but was %s", expectedXAngle, actualXAngle)
        );
    }
}
