package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double userRadius = Double.valueOf(inputObject.nextLine());
//        Double calcRadius = Math.PI * userRadius * userRadius;
        Double areaOfCircle = Circle.getArea(userRadius);
        System.out.println("The area of a circle of radius " + userRadius + " is: " + areaOfCircle);


    }
}
