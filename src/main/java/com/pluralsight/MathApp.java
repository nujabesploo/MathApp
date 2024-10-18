package com.pluralsight;
import java.util.Random;
import java.util.Scanner;

public class MathApp {

        public static void main(String[] args) {
            //Determine the smallest and largest number//
            int bobSalary = 65000;
            int garySalary = 55000;
            int highestSalary = Math.min(bobSalary, garySalary);
            int carPrice = 72000;
            int truckPrice = 62500;

            System.out.printf("The Highest Salary: %d\n", highestSalary);

            // Area of a circle and Square root//
            final double area_of_radius = 7.25;
            System.out.printf("Area of a circle: %f\n", Math.PI * Math.pow(area_of_radius,2));

           final double square_root = 5.0;
            System.out.printf("The square root is: %f\n", Math.sqrt(5.0));

            //Distance between two points//
            double distance;
            int x_one = 5;
            int y_one = 10;
            int x_two = 85;
            int y_two = 50;
            int x_final = x_two - x_one;
            int y_final = y_two - y_one;


            distance = Math.sqrt((Math.pow(x_final,2) + (Math.pow(y_final,2))));
            System.out.printf("The distance between two points: %2.0f \n", distance);

            //Absolute number of a number//
            double absolute_value = Math.abs(-3.8);

            //Find a random number between 0 and 1//

            double random_number =  Math.random();
            System.out.printf("Your random number is: %f\n", random_number);

            Random ran_number = new Random();



            for(int i = 0; i <= 10;i++)
            {
                int final_number = ran_number.nextInt(10);
                System.out.printf(" Random number is: %d \n", final_number);
            }


        }
    }


