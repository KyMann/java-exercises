package org.launchcode.java.studios.resturant.methods;

/**
 * Created by KyleLaptop on 3/13/2017.
 */

import java.time.LocalDateTime;


public class MenuItem {
    //init ____________
    private Double price;
    private String name; //should be final?
    private String description;
    private String category;
    private final LocalDateTime initilized = LocalDateTime.now(); //final - date never changes

    //constructors_______________
    public MenuItem(double aPrice, String aName, String aDescription, String aCategory) {
        this.price = aPrice;
        this.name = aName;
        this.description = aDescription;
        this.category = aCategory;
    }

    //getters and Setters __________
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getInitilized() {
        return initilized;
    }


    //methods __________
    //needs a method to compare current date to Initilized, return new or not.
    public Boolean isNew() {
        if (LocalDateTime.now().compareTo(getInitilized()) > 2600000) { //1 month roughly
            return Boolean.TRUE;
        }
        else {
            return Boolean.FALSE;
        }
    }
    public void display() {
        if (this.isNew()) {
            System.out.println("New item!");
        }
        System.out.println(this.getName());
        System.out.println(this.getPrice());
        System.out.println(this.getDescription());
        System.out.println(this.getCategory());
    }
}
