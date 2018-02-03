package by.kurlovich.cone.validator;

public class LineValidator {
    private final static String DELIMITER = "\\s";

    public boolean validateLine(String line) {
        String[] points = line.split(DELIMITER);

        return (points.length == 7);
    }
}
