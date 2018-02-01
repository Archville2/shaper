package by.kurlovich.cone.validator;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class LineValidator {
    private final static String DELIMITER = "\\s";

    public boolean validateLine(String line) {
        String[] points = line.split(DELIMITER);

        return (points.length == 7);
    }
}
