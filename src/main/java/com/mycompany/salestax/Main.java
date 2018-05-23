package com.mycompany.salestax;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author 204641
 */
public class Main {

    static Scanner input = new Scanner(System.in);
    private static Map<String, Double> netProfitMap = new HashMap<>();

    public static void main(String args[]) {

        String csvFile = "product_list.csv";
        String line;
        Double productionPrice;

        System.out.println("1 - input product data manually.\n"
                + "2 - read products from file.");
        int nextInt = input.nextInt();
        if (nextInt == 1) {
            System.out.println("Choose your product by number: 1 - Groceries.");
            if (input.nextInt() == 1) {
                System.out.println("Input product price:");
                productionPrice = input.nextDouble();
                calculateDisplayNetProfitForAllStatesForGroceries(productionPrice);
            }
        } else if (nextInt == 2) {
            try {
                Scanner scan = new Scanner(new File(csvFile));
                while (scan.hasNext()) {
                    line = scan.nextLine();
                    // use comma as separator
                    String[] productData = line.split(",", -1);
                    if (productData[1].trim().equals("groceries")) {
                        productionPrice = parseDouble(productData[2]);
                        System.out.println("Product name: " + productData[0]
                                + ", type:" + productData[1] + ", production price:" + productData[2]);
                        calculateDisplayNetProfitForAllStatesForGroceries(productionPrice);
                    } else {
                        System.out.println("No implementation for" + productData[1] + ".");
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Map<String, Double> getNetProfitMap() {
        return netProfitMap;
    }

    public static void calculateDisplayNetProfitForAllStatesForGroceries(Double productionPrice) {
        Double overallPrice = States.calculateGroceryPriceForStateWithMaxTax(productionPrice);
        System.out.printf("Product price in all states: %.2f", overallPrice);
        for (Map.Entry entry : States.getStatesMap().entrySet()) {
            State state = (State) entry.getValue();
            Double netProfit = States.calculateProductPrice(productionPrice, state);
            netProfitMap.put(entry.getKey().toString(), netProfit);
            System.out.print("\n" + entry.getKey());
            if(entry.getKey().toString().length() < 8)
                System.out.print("\t");
            System.out.printf("\t\tTax: " + state.getGroceryTax());
            System.out.printf("\t Net profit: %.2f", netProfit);
        }
        System.out.println("\n");
    }
}
