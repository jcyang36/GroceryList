package com.jcyang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Create an array list of strings to store the grocery list
        * */

        ShoppingCart shoppingCart = new ShoppingCart();
        String entered="y";
        String itemName="";
        double itemPrice=0;
        String itemDescription="";
        String newLine="";
        double total = 0;
        Scanner keyboard = new Scanner(System.in);
        ArrayList<GroceryItem> groceryItems2= new ArrayList<GroceryItem>();

        do{
            System.out.print("Enter an item to add to your grocery list:");
            GroceryItem groceryItem = new GroceryItem();
            itemName = keyboard.nextLine();
            groceryItem.setName(itemName);
            System.out.print("Enter item's price:");
            itemPrice=keyboard.nextDouble();
            newLine=keyboard.nextLine();
            groceryItem.setPrice(itemPrice);
            ArrayList<GroceryItem> groceryItems =shoppingCart.getGroceryItems();
            groceryItems2.add(groceryItem);
            shoppingCart.setGroceryItems(groceryItems2);
            System.out.print("Do you want to continue?");
            entered = keyboard.nextLine();
        }while(entered.equalsIgnoreCase("y")||!entered.equalsIgnoreCase("n"));

            for (GroceryItem item: shoppingCart.getGroceryItems()){
                System.out.print("Item: ");
                System.out.println(item.getName());
                System.out.print("Price: ");
                System.out.println(item.getPrice());
                total+= item.getPrice();
            }
            System.out.println("Total price: " + total);
    }
}