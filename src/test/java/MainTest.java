import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import com.mycompany.salestax.Main;

public class MainTest {

	private static final double PRODUCT_20_DOLLARS = 20.00;

	@Test
	public void testShouldCalculateNetProfitForIowa0PercentTaxWhenGroceriesCost20Dollars() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_20_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Iowa");

		assertEquals(3.6, profit, 0.01);
	}

	@Test
	public void testShouldCalculateNetProfitForArkansas8PercentTaxWhenGroceriesCost20Dollars() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(PRODUCT_20_DOLLARS);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Arkansas");

		assertEquals(2.0, profit, 0.01);
	}

	@Test
	public void testShouldCalculateNetProfitForMissouri1dot225PercentTaxWhenGroceriesCost12Dollars12Cents() {
		Main.calculateDisplayNetProfitForAllStatesForGroceries(12.12);

		Map<String, Double> map = Main.getNetProfitMap();
		double profit = map.get("Missouri");

		assertEquals(2.03, profit, 0.01);
	}

}