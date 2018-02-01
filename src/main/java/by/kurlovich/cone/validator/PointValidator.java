package by.kurlovich.cone.validator;

import org.apache.log4j.Logger;

public class PointValidator {
    private static Logger logger = Logger.getLogger(PointValidator.class);
    private final String IS_NUMBER_REGEX = "^-?[0-9]\\d*(\\.\\d+)?$";
    private final static String DELIMITER = "\\s";

    public boolean validatePoint(String line) {
        String[] points = line.split(DELIMITER);

        if (points.length == 7) {
            return validateNumbers(points);
        }

        return false;
    }

    private boolean validateNumbers(String[] numbers) {
        for (String number : numbers) {
            if (!number.matches(IS_NUMBER_REGEX)) {
                return false;
            }
        }
        return true;
    }
}
