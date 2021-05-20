package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class RestaurantMenu {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        // Top-level restaurant options
        HashMap<String, String> restaurantChoices = new HashMap<>();
        restaurantChoices.put("search", "Search");
        restaurantChoices.put("list", "List");

        System.out.println("Welcome to Restaurant Menu App!");
      while(true) {
          String restaurantChoice = getUserInput();
      }

    }

    private static String getUserInput() {
        return null;
    }
}
