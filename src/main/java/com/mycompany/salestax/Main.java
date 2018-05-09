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
    static String stateName;
    static String taxName;
    static Double productionPrice;
    public static void main(String args[]){
        
        System.out.println("(Arkansas, Georgia and Iowa available)");
        
        System.out.println("Choose your product by number: 1 - Groceries.");
        if (input.nextInt() == 1) {
            taxName = "groceryTax";
            System.out.println("Input product price:" );
            productionPrice = input.nextDouble();
            Double overallPrice = States.calculateGroceryPriceForStateWithMaxTax(productionPrice);
            System.out.printf("Product price with tax and profit is: %.2f", overallPrice);
            for(Map.Entry entry:States.getStatesMap().entrySet()){
                State state = (State) entry.getValue();
                Double netProfit = States.calculateProductPrice(productionPrice, state);
                System.out.print("\nNet profit in " + entry.getKey());
                System.out.printf(" is: %.2f", netProfit);
            }
        }
    }
}
