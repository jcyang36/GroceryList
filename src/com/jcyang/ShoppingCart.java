package com.jcyang;

import java.util.ArrayList;

public class ShoppingCart {

   private ArrayList<GroceryItem> groceryItems;

   public void ShoppingCart(){
       groceryItems= new ArrayList<GroceryItem>();

   }

    public ArrayList<GroceryItem> getGroceryItems() {
        return groceryItems;
    }

    public void setGroceryItems(ArrayList<GroceryItem> groceryItems) {
        this.groceryItems = groceryItems;
    }


}
