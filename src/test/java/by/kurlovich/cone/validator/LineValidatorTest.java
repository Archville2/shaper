package by.kurlovich.cone.validator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class LineValidatorTest {
    LineValidator lineValidator;

    @BeforeClass
    public void setUp() {
        lineValidator = new LineValidator();
    }

    @AfterClass
    public void tearDown() {
        lineValidator = null;
    }

    @DataProvider(name = "goodDataLines")
    public Object[][] goodLinesProvider() {
        return new Object[][]{
                {"3 4 6 7 11 23 2"}
        };
    }

    @DataProvider(name = "badDataLines")
    public Object[][] badLinesProvider() {
        return new Object[][]{
                {"3 4 6 7 11 23 2 1"}
        };
    }

    @Test(dataProvider = "goodDataLines")
    public void goodLineValidatorTest(String line) {
        int expected = 7;
        int actual = line.split("\\s").length;

        assertTrue("lines length are mismatch", expected == actual);
    }

    @Test(dataProvider = "badDataLines")
    public void badLineValidatorTest(String line) {
        int expected = 7;
        int actual = line.split("\\s").length;

        assertFalse("lines length are the same", expected == actual);
    }
}
