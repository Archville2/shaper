package by.kurlovich.cone.parser;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LineParserTest {
	LineParser lineParser;

	@BeforeClass
	public void setUp() {
		lineParser = new LineParser();

	}

	@AfterClass
	public void tearDown() {
		lineParser = null;
	}
	
	@DataProvider(name = "validatedLines")
    public Object[][] validatedLinesProvider() {
        return new Object[][]{
                {"3 4 6 7 11 23 2"}
        };
    }
	
	@Test (dataProvider = "validatedLines")
	public void parseLinesTest(String line) {
		double[] expected = {3,4,6,7,11,23,2};
		double[] actual = lineParser.parseLine(line);
		
		Assert.assertTrue(Arrays.equals(expected, actual));
	}

}
