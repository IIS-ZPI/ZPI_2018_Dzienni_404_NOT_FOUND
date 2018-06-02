package com.mycompany.salestax;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 204641
 */
public class States {

	private static Map<String, State> statesMap = new HashMap<>();
	private static String stateName;
	static final double profit = 0.10;

	static {
		State state = new State();
		stateName = "Arkansas";
		state.setGroceryTax(0.08);
		statesMap.put(stateName, state);

		state = new State();
		stateName = "Georgia";
		state.setGroceryTax(0.04);
		statesMap.put(stateName, state);

		state = new State();
		stateName = "Iowa";
		state.setGroceryTax(0.0);
		statesMap.put(stateName, state);

		state = new State();
		stateName = "Kansas";
		state.setGroceryTax(0.065);
		statesMap.put(stateName, state);

		state = new State();
		stateName = "Kentucky";
		state.setGroceryTax(0.0);
		statesMap.put(stateName, state);

		state = new State();
		stateName = "Louisiana";
		state.setGroceryTax(0.07);
		statesMap.put(stateName, state);

		state = new State();
		stateName = "Maine";
		state.setGroceryTax(0.0);
		statesMap.put(stateName, state);

		state = new State();
		stateName = "Maryland";
		state.setGroceryTax(0.0);
		statesMap.put(stateName, state);

		state = new State();
		stateName = "Massachusetts";
		state.setGroceryTax(0.0);
		statesMap.put(stateName, state);

		state = new State();
		stateName = "Michigan";
		state.setGroceryTax(0.0);
		statesMap.put(stateName, state);

		state = new State();
		stateName = "Minnesota";
		state.setGroceryTax(0.0);
		statesMap.put(stateName, state);

		state = new State();
		stateName = "Mississippi";
		state.setGroceryTax(0.07);

		statesMap.put(stateName, state);
		state = new State();
		stateName = "Missouri";
		state.setGroceryTax(0.01225);
		statesMap.put(stateName, state);
	}

	public static Map<String, State> getStatesMap() {
		return statesMap;
	}

	public static Double getGroceryTaxByState(String stateName, String taxName) {
		State currentState = new State();
		Double stateGroceryTax = 0.0;
		for (Map.Entry state : States.getStatesMap().entrySet()) {
			if (stateName.equals(state.getKey())) {
				currentState = (State) state.getValue();
				stateGroceryTax = currentState.getGroceryTax();
				break;
			}
		}
		return stateGroceryTax;
	}

	public static Double getMaxGroceryTax() {
		State firstState = statesMap.get("Iowa");
		State otherState;

		Double maxGroceryTax = firstState.getGroceryTax();
		for (Map.Entry state : States.getStatesMap().entrySet()) {
			otherState = (State) state.getValue();
			if (maxGroceryTax < otherState.getGroceryTax()) {
				maxGroceryTax = otherState.getGroceryTax();
			}
		}
		return maxGroceryTax;
	}

	public static Double calculateGroceryPriceForStateWithMaxTax(Double productionPrice) {
		Double minPrice = productionPrice + productionPrice * getMaxGroceryTax();
		Double maxPrice = minPrice + productionPrice * profit;
		return maxPrice;
	}

	public static Double calculateProductPrice(Double productionPrice, State state) {
		Double stateGroceryTax = state.getGroceryTax();

		// can be passed as argument
		Double priceWithMaxTax = calculateGroceryPriceForStateWithMaxTax(productionPrice);
		Double netProfit = priceWithMaxTax - productionPrice * (1 + stateGroceryTax);

		return netProfit;
	}

	public static String getStateName() {
		return stateName;
	}
}
