// Created by Paul A. Gureghian in Sept 2020.
// This Java program calculates the area of 3 different shapes, Triangle, Rectangle, Circle.

// Import modules 
import java.util.*;

// Define a class
public class AreaCalculator {

    // Define the main function
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("\n Shape Area Calculator \n");

        while (true) {

            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println();
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Circle");
            System.out.println("4) Quit");
            System.out.println();

            System.out.println("Which shape: ");

            int shape = keyboard.nextInt();
            System.out.println();

            // Check for user input
            if(shape == 1) {
                area_triangle(5,6);
            
            } else if(shape == 2) {
                
            }

            } 
        }

}

}
