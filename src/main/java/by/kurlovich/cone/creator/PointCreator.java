package by.kurlovich.cone.creator;

import by.kurlovich.cone.entity.Point;

public class PointCreator {
	public Point createPoint(double x, double y, double z) {
		return new Point(x, y, z);

	}
}
