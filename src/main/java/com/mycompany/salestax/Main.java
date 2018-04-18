package com.mycompany.salestax;

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
    
    public static void main(String args[]){
        
        System.out.println("Input state name: (Arkansas, Georgia and Iowa available)");
        String stateName = input.next();
        System.out.println("Choose your product by number: 1 - Groceries.");
        if (input.nextInt() == 1) {
            taxName = "groceryTax";
            States.getGroceryTaxByState(stateName, taxName);
        }
        
        for(Map.Entry state:States.getStatesMap().entrySet()){  
            if (stateName.equals(state.getKey())){
                System.out.println(state.getKey()+" "+state.getValue());
            }
                        
        }
    }
    
}
