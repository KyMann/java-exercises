package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by KyleLaptop on 2/27/2017.
 */
public class Area {
    public static void main (String[] args) {
    //ask for area

    // take in radius, use scanner for input?
        Scanner scanner;
        scanner = new java.util.Scanner(System.in); //why is this named scanner??
        Double radius = 0.0;


        while(radius <= 0.0){
            System.out.println("Enter a radius");
            radius = Double.parseDouble(scanner.next());

            if(radius <0) {
                System.out.println("radius must be positive!");
            }
        }

        Double area = Math.PI * radius * radius;
        System.out.println("The Area is " + area);

    //convert radius to a float use
    //float radiius = Float.valueOf( radius );
    //area = radius * radius * Double pi = 3.14

    //return number of area
    }
}
