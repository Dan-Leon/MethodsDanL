package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int userSelection = 0;
        double width;
        double height;
        double radius;
        double base;
        double area;
        while (userSelection < 1 || userSelection > 4) {
            System.out.println("Which of these shapes would you like the calculated area for?");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            userSelection = getSelection("Please choose the shape you would an area measurement for: ");

            switch (userSelection) {
                case 1:
                    System.out.println("You chose to calculate the area of a square.");
                    width = getInput("Please enter the width: ");
                    area = square(width);
                    System.out.println("The area of the square is: " + area);
                    break;
                case 2:
                    System.out.println("You chose to calculate the area of a rectangle.");
                    width = getInput("Please enter the width: ");
                    height = getInput("Please enter the height: ");
                    area = rectangle(width, height);
                    System.out.println("The area of the rectangle is: " + area);
                    break;
                case 3:
                    System.out.println("You chose to calculate the area of a triangle.");
                    base = getInput("Please enter the base measurement: ");
                    height = getInput("Please enter the height: ");
                    area = triangle(base, height);
                    System.out.println("The area of the triangle is: " + area);
                    break;
                case 4:
                    System.out.println("You chose to calculate the area of a circle.");
                    radius = getInput("Please enter the radius (measure from the center to the outer edge): ");
                    area = circle(radius);
                    System.out.println("The area of the circle is: " + area);
                    break;
                default:
                    System.out.println("You have made an invalid entry.");
            }
        }

    }

    private static double square(double sizeWidth) {
        double result = sizeWidth * sizeWidth;
        return result;
    }

    private static double rectangle(double sizeWidth, double sizeHeight) {
        double result = sizeWidth * sizeHeight;
        return result;
    }

    private static double triangle(double sizeBase, double sizeHeight) {
        double result = .5 * sizeBase * sizeHeight;
        return result;
    }

    private static double circle(double sizeRadius) {
        double result = 3.14159 * (sizeRadius * sizeRadius);
        return result;
    }
    private static double getInput(String sLabel){
        double nItem;
        Scanner sc = new Scanner(System.in);
        System.out.print(sLabel);
        nItem = sc.nextDouble();
        return nItem;
    }
    private static int getSelection(String sLabel){
        int nItem;
        Scanner sc = new Scanner(System.in);
        System.out.print(sLabel);
        nItem = sc.nextInt();
        return nItem;
    }


}
