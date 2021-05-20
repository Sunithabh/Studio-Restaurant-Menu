package Restaurant;

import java.util.ArrayList;

public class Menu {
    //static Scanner in = new Scanner(System.in);
        private ArrayList<MenuItem> mainMenu = new ArrayList<>();
        private double price = 0.0;
        // Top-level restaurant options/ array to hold Items
        //private ArrayList<MenuItem> appetizers = new ArrayList<>();
        //private ArrayList<MenuItem> mainCOurse = new ArrayList<>();
        //private ArrayList<MenuItem> dessert = new ArrayList<>();

        //constructors
        public void mainMenu() {
            addMenu();
            setMenu();
            getMenu();
            this.price = price;
        }

        //setters
        private void setMenu() {
        }
        private void setPrice(double price){
            this.price = price;
        }

        //getters
        private void getMenu() {
        }
        private double getPrice() {
            return price;
        }
        //method to add new Menu
        private void addMenu() {
          //appetizers
            mainMenu.add(new MenuItem());
           //main Course
           mainMenu.add(new MenuItem());
           //dessert
           mainMenu.add(new MenuItem());
        }


        public static void main(String[] args) {



        }
}
