package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    static Scanner in = new Scanner(System.in);
    public static void addMenuOptions() {
        // Top-level menu options
        HashMap<String, String> menuOptions = new HashMap<>();
        menuOptions.put("search", "Search");
        menuOptions.put("list", "List");
    }

    String menuOptions = getUserInput();

    private String getUserInput() {
        return null;
    }
}
