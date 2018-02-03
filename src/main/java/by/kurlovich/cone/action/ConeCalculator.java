package by.kurlovich.cone.action;

import static java.lang.Math.sqrt;
import static java.lang.Math.PI;
import static java.lang.Math.hypot;

import java.math.BigDecimal;
import java.math.RoundingMode;

import by.kurlovich.cone.entity.Cone;
import by.kurlovich.cone.entity.Point;

public class ConeCalculator {
	public boolean isConeExist(double[] points) {
		return (points[0] != points[3] && points[1] != points[4] && points[2] != points[5] && points[6] > 0);
	}

	public double calculateHeight(Cone cone) {
		Point top = cone.getTop();
		Point base = cone.getBase();

		double x1 = top.getX();
		double y1 = top.getY();
		double z1 = top.getZ();

		double x2 = base.getX();
		double y2 = base.getY();
		double z2 = base.getZ();

		double result = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
		return new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
	}

	public double calculateVolume(Cone cone) {
		double height = calculateHeight(cone);
		double radius = cone.getRadius();
		double result = 1.0 / 3.0 * PI * height * (radius * radius);

		return new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
	}

	public double calculateSpace(Cone cone) {
		double height = calculateHeight(cone);
		double radius = cone.getRadius();
		double length = hypot(height, radius);
		double result = PI * radius * length + PI * radius * radius;
		
		return new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
	}
}
