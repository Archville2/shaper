package by.kurlovich.cone.validator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class PointValidatorTest {
    PointValidator pointValidator;

    @BeforeClass
    public void setUp() {
        pointValidator = new PointValidator();
    }

    @AfterClass
    public void tearDown() {
        pointValidator = null;
    }

    @DataProvider(name = "goodDataPoints")
    public Object[][] goodDataProvider() {
        return new Object[][]{
                {"3 4 6 7 11 23 2"},
                {"3.1 2.4 11 5.6 1.2 5.4 3"}
        };
    }

    @DataProvider(name = "badDataPoints")
    public Object[][] badDataProvider() {
        return new Object[][]{
                {"3 4 6 7 11 23 aa"}
        };
    }

    @Test(dataProvider = "goodDataPoints")
    public void goodPointValidatorTest(String line) {
        boolean expected = true;
        boolean actual = pointValidator.validatePoint(line);

        Assert.assertTrue(expected == actual, "non number found");
    }

    @Test(dataProvider = "badDataPoints")
    public void badPointValidatorTest(String line) {
        boolean expected = true;
        boolean actual = pointValidator.validatePoint(line);

        Assert.assertFalse(expected == actual, "no bad numbers found");
    }
}

