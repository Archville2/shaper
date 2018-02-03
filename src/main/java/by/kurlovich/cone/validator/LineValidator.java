package by.kurlovich.cone.validator;

/**
 * validates received string line. If string has 7 chars 
 * separated by space returns true.
 * @param 	line 	incoming string.
 * @return 			true/false.
 */

public class LineValidator {
    private final static String DELIMITER = "\\s";

    public boolean validateLine(String line) {
        String[] points = line.split(DELIMITER);

        return (points.length == 7);
    }
}
