package com.example;

import java.util.Scanner;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        double a, b, c, d;
        c = 0;
        c = c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        a = sc.nextDouble();

        System.out.print("Enter second number: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        b = sc.nextDouble();
        sc.close();

        double result;
        try{
            result = addNumbers(a,b);
            System.out.print("Result: " + result);
        }
        catch(Exception e){
            throw e;
        }
        finally{
            return;
        }
    }

    public static double addNumbers(double x, double y) {
        return x + y;
    }
}