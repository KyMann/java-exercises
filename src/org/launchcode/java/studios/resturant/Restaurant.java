package org.launchcode.java.studios.resturant;

import org.launchcode.java.studios.resturant.methods.Menu;

import java.util.Scanner;

/**
 * Created by KyleLaptop on 3/13/2017.
 */


public class Restaurant {
    //init variables_______
    private static Menu thisMenu = new Menu();
    private String restaurantName;

    static private String show = "0 - Show menu";
    static private String add  = "1 - Add to menu";
    static private String remove = "2 - Remove from menu";

    //getters and setters______
    //should do some work to present this menu? Or should that be in a menu method?
    public Menu getThisMenu() {
        return thisMenu;
    }

    public void setThisMenu(Menu thisMenu) {
        this.thisMenu = thisMenu;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    //methods________
    public static void main(String[] args) {
        while (Boolean.TRUE) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(Restaurant.show);
            System.out.println(Restaurant.add);
            System.out.println(Restaurant.remove);

            Integer option = Integer.parseInt(scanner.nextLine());
            if (option.equals(1)) {
                thisMenu.makeItem();
            }
            else if (option.equals(0)) {
                thisMenu.display();
            }
            else if (option.equals(2)) {
                thisMenu.removeFromMenu();
            }
        }
    }
}
