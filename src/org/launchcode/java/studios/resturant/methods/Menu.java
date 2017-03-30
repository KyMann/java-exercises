package org.launchcode.java.studios.resturant.methods;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by KyleLaptop on 3/13/2017.
 */
public class Menu {
    //init variables _____
    private ArrayList<MenuItem> menuBoard = new ArrayList<>();
    private LocalDateTime lastUpdated;
    private ArrayList<String> categories = new ArrayList<>();


    //constructors
    public Menu() {
        lastUpdated =  LocalDateTime.now();
    }


    //getters and setters__________
    public ArrayList<MenuItem> getMenuBoard() {
        return menuBoard;
    }

    public void setMenuBoard(ArrayList<MenuItem> menuBoard) {
        this.menuBoard = menuBoard;
    }


    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    //this should have a constructor to update everytime the menu is changed
    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    //this should have a constructor to include categories from the MenuBoard
    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    //methods
    public void addToMenuBoard(MenuItem foody) { //make sure there is already a
        this.menuBoard.add(foody);
    }

    public void removeFromMenu() {
        Scanner ascanner = new Scanner(System.in);
        System.out.println("Enter the name of the food to remove:");
        MenuItem badItem = null;
        String aname = ascanner.nextLine();
        for (MenuItem item : menuBoard) { //loop through everything in the menu's list
            //if the name matches feed it into remove
            if (item.getName().equalsIgnoreCase(aname)) {
                badItem = item;
            }
        }
        menuBoard.remove(badItem);
    }
    public void display() {
        for ( MenuItem item : this.getMenuBoard()) {
            item.display();
            System.out.println("");
        }
        System.out.println((this.getLastUpdated()));
    }
    public void makeItem() {
        Scanner otherscanner = new Scanner(System.in);
        System.out.println("Enter Name");
        String aname = otherscanner.nextLine();
        System.out.println("Enter Price");
        Double aprice = Double.parseDouble(otherscanner.next());
        otherscanner.nextLine();
        System.out.println("Enter the Description");
        String adescription = otherscanner.nextLine();
        System.out.println("Enter the Category");
        String acategory = otherscanner.nextLine();
        addToMenuBoard(new MenuItem(aprice, aname, adescription, acategory));
    }
}
