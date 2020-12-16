/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainventory;
import java.util.Scanner;

/**
 *Java Inventory Tracker Program
 * Version 1.1.1
 * By: Jacob Mason
 */
public class JavaInventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Welcoming the user and explaining the program
        System.out.println("Welcome to the Inventory Tracker Program");
        System.out.println("This program can accept the name and cost of 10 items");
        System.out.println("And then it can display a table with the names costs"
                + "and prices");
        System.out.println("\n\nPrices are calculated with a 30% markup");

    
       
        String products[] = new String[10];
        double cost[] = new double[10];
        for(int x = 1;x < 11; x++)
        {
            //User product name input
            System.out.print("Product " + x + " name: ");
            Scanner input = new Scanner(System.in);
            products[x-1] = input.next();
            
            //User cost input
            System.out.print("Enter the product cost: $");
            Scanner input2 = new Scanner(System.in);
            cost[x-1] = input2.nextDouble();
        }
      
       
    
    
        
    //Formating table header
    System.out.format("\n\n%1s%15s%15s\n", "Item Name", "Item Cost","Item Price");
    
    
    //Creating variables for values
        double price;    
        double total = 0;
        //Loop to display table
        for(int i = 0; i<10;i++ ){
            price = cost[i] * 1.3;
            System.out.printf("%-16s$%.2f", products[i], cost[i]);
            System.out.print("         ");
            System.out.printf("$%.2f", price);
            System.out.println();
            total += cost[i];//Calculating total cost
        }
        //Displaying total cost
        System.out.print("\nThe total cost of the products is: $");
        System.out.printf("%.2f", total);
        
        System.out.println("\n\nThank you for using the Java Inventory Tracker."
                + " Goodbye.");
    }
    
}
