package by.kurlovich.cone.parser;

import java.util.Arrays;

public class LineParser {
	public double[] parseLine (String line) {
		String[] pointsArray = line.split("\\s");
		
		return Arrays.stream(pointsArray).mapToDouble(Double::parseDouble).toArray();
	}
}
