package by.kurlovich.cone.parser;

import java.util.Arrays;

/**
 * parse received string for the digits.
 * @param 	line 	incoming string with digits separated by space.
 * @return 			array of doubles.
 */

public class LineParser {
	public double[] parseLine (String line) {
		String[] pointsArray = line.split("\\s");
		
		return Arrays.stream(pointsArray).mapToDouble(Double::parseDouble).toArray();
	}
}
