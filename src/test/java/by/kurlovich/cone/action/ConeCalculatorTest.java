package by.kurlovich.cone.action;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.kurlovich.cone.creator.ConeCreator;
import by.kurlovich.cone.entity.Cone;

public class ConeCalculatorTest {
	private ConeCalculator coneCalculator;
	private ConeCreator coneCreator;

	@BeforeClass
	public void setUp() {
		coneCalculator = new ConeCalculator();
		coneCreator = new ConeCreator();

	}

	@AfterClass
	public void tearDown() {
		coneCalculator = null;
		coneCreator = null;
	}

	@DataProvider(name = "goodCone")
	public Object[][] goodConeProvider() {
		return new Object[][] { { 3, 4, 6, 7, 11, 23, 4 } };
	}

	@DataProvider(name = "badCone")
	public Object[][] badConeProvider() {
		return new Object[][] { { 3, 4, 6, 7, 11, 23, 0 }, { 3, 4, 6, 3, 4, 6, 5 } };
	}

	@DataProvider(name = "conePoints")
	public Object[][] conePointsProvider() {
		return new Object[][] { { "3 4 6 7 11 23 4" } };
	}

	@Test(dataProvider = "goodCone")
	public void validateGoodConeTest(double[] points) {
		boolean expected = true;
		boolean actual = coneCalculator.isConeExist(points);

		Assert.assertTrue(expected == actual, "cone validtion failure");
	}

	@Test(dataProvider = "badCone")
	public void validateBadConeTest(double[] points) {
		boolean expected = false;
		boolean actual = coneCalculator.isConeExist(points);

		Assert.assertTrue(expected == actual, "cone validtion not working");
	}

	@Test(dataProvider = "conePoints")
	public void calculateHeigthTest(String points) {
		Cone cone = coneCreator.createCone(points);
		double expected = 18.81;
		double actual = coneCalculator.calculateHeight(cone);

		Assert.assertTrue(expected == actual, "cone height mismatch. Expected=" + expected + ", actual=" + actual);
	}
}
