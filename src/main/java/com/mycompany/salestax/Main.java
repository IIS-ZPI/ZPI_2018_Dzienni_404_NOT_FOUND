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
    static Double productPrice;
    static Double netProfit;
    public static void main(String args[]){
        
        System.out.println("(Arkansas, Georgia and Iowa available)");
        
        System.out.println("Choose your product by number: 1 - Groceries.");
        if (input.nextInt() == 1) {
            taxName = "groceryTax";
            System.out.println("Input product price:" );
            productionPrice = input.nextDouble();
            System.out.println("MaxPrice" + calculateGroceryPriceForStateWithMaxTax(productionPrice));
            for(Map.Entry entry:States.getStatesMap().entrySet()){
                State state = (State) entry.getValue();
                productPrice = States.calculateProductPrice(productionPrice, state);
                System.out.println("Product price with tax and profit is: " + productPrice);
                System.out.println("Net profit in " + entry.getKey() + " is : " + netProfit);
            }
        }
    }
    
}
