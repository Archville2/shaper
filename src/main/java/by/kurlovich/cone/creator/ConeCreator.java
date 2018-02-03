package by.kurlovich.cone.creator;

import by.kurlovich.cone.action.ConeCalculator;
import by.kurlovich.cone.entity.Cone;
import by.kurlovich.cone.entity.Point;
import by.kurlovich.cone.parser.LineParser;
import by.kurlovich.cone.util.IDGenerator;

public class ConeCreator {
	public Cone createCone(String line) {
		LineParser lineParser = new LineParser();
		PointCreator pointCreator = new PointCreator();
		IDGenerator idGenerator = new IDGenerator();
		ConeCalculator coneCalculator = new ConeCalculator();

		double[] points = lineParser.parseLine(line);

		if (coneCalculator.isConeExist(points)) {
			double radius = points[6];
			int coneID = idGenerator.generateID();
			Point top = pointCreator.createPoint(points[0], points[1], points[2]);
			Point base = pointCreator.createPoint(points[3], points[4], points[5]);

			return new Cone(coneID, top, base, radius);
		}

		return null;
	}
}
