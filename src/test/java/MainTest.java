import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import com.mycompany.salestax.Main;

public class MainTest {

	private static final double DELTA = 0.01;
	private static final double PRODUCT_23point53_DOLLARS = 23.53;

	/* IOWA */
	@Test
	public void testShouldCalculateNetProfitForIowa0PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Iowa");

		assertEquals(4.24, profit, DELTA);
	}

	/* ARKANSAS */
	@Test
	public void testShouldCalculateNetProfitForArkansas8PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Arkansas");

		assertEquals(2.35, profit, DELTA);
	}

	/* MISSOURI */
	@Test
	public void testShouldCalculateNetProfitForMissouri1dot225PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Missouri");

		assertEquals(3.95, profit, DELTA);
	}

	/* LOUISIANA */
	@Test
	public void testShouldCalculateNetProfitForLouisiana7PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Louisiana");

		assertEquals(2.59, profit, DELTA);
	}

	/* GEORGIA */
	@Test
	public void testShouldCalculateNetProfitForGeorgia4PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Georgia");

		assertEquals(3.29, profit, DELTA);
	}

	/* MARYLAND */
	@Test
	public void testShouldCalculateNetProfitForMaryland0PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Maryland");

		assertEquals(4.24, profit, DELTA);
	}

	/* MAINE */
	@Test
	public void testShouldCalculateNetProfitForMaine0PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Maine");

		assertEquals(4.24, profit, DELTA);
	}

	/* KANSAS */
	@Test
	public void testShouldCalculateNetProfitForKansas6dot5PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Kansas");

		assertEquals(2.71, profit, DELTA);
	}

	/* MISSISIPI */
	@Test
	public void testShouldCalculateNetProfitFoMissisippi7PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Mississippi");

		assertEquals(2.59, profit, DELTA);
	}

	/* MASSACHUSETS */
	@Test
	public void testShouldCalculateNetProfitForMassachusets0PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Massachusetts");

		assertEquals(4.24, profit, DELTA);
	}

	/* KENTUCKY */
	@Test
	public void testShouldCalculateNetProfitForKentucky0PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Kentucky");

		assertEquals(4.24, profit, DELTA);
	}

	/* MICHIGAN */
	@Test
	public void testShouldCalculateNetProfitForMichigan0PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Michigan");

		assertEquals(4.24, profit, DELTA);
	}

	/* MINNESOTA */
	@Test
	public void testShouldCalculateNetProfitForMinnesota0PercentTax() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_23point53_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Minnesota");

		assertEquals(4.24, profit, DELTA);
	}

}