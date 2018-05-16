package com.mycompany.salestax;

import static com.mycompany.salestax.States.*;
import java.util.Scanner; 
import java.util.*;
/**
 *
 * @author 204641
 */
public class Main {
    
    static Scanner input = new Scanner(System.in);
    private static Map<String, Double> netProfitMap = new HashMap<>();

    public static void main(String args[]){
        System.out.println("Choose your product by number: 1 - Groceries.");
        if (input.nextInt() == 1) {
            System.out.println("Input product price:" );
            Double productionPrice = input.nextDouble();
            Double overallPrice = States.calculateGroceryPriceForStateWithMaxTax(productionPrice);
            System.out.printf("Product price in all states: %.2f", overallPrice);
            for(Map.Entry entry:States.getStatesMap().entrySet()){
                State state = (State) entry.getValue();
                Double netProfit = States.calculateProductPrice(productionPrice, state);
                netProfitMap.put(state.getStateName(), netProfit);
                System.out.print("\nNet profit in " + entry.getKey());
                System.out.printf(" is: %.2f", netProfit);
            }
        }
    }

    public static Map<String, Double> getNetProfitMap() {
        return netProfitMap;
    }
}
