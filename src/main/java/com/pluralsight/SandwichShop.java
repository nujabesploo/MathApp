package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        //Declare a scanner for user input//
        Scanner in = new Scanner(System.in);

        //Prompt the user for the size of the sandwich(1 or 2)
        System.out.print("Please Enter 1 or 2 for Regular or Large Price: ");
        float num = 0;
        String age_class = " ";
        int number = in.nextInt();


        if (number == 1) {
            System.out.print("How old are you: ");
            int age = in.nextInt();
            float regular_base_price = 5.45f;
            float discount = .10f;
            age_class = name(age);
            num = discount_calc(regular_base_price, discount, age);

        } else if (number == 2) {
            System.out.println("How old are you: ");
            int age = in.nextInt();
            float large_base_price = 8.95f;
            float discount = .20f;
            num = discount_calc(large_base_price, discount, age);
            age_class = name(age);
        }

        System.out.printf("Welcome to Good Burger!\nYou're a %s and Your price is %.2f ", age_class, num);

    }

    public static float discount_calc(float price , float percentage, int age)
    {

        float total = 0;
        if(age <= 17)
        {
            total = percentage * price;
        }
        else if(age >= 65)
        {
            total = percentage * price;
        }

        total = price - total;

        return total;
    }

    public static String name(int age)
    {
        String citizen = " ";
        if(age <= 64)
        {
            citizen = "student";
        }
        else{
            citizen = "senior citizen";
        }

        return citizen;
    }

}
