package com.epam;

import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

import com.epam.Operations;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String item;
    static double num1 = 0, num2, num3 = 0;

    public static void main(String[] args) throws IOException {


        try {
            Operations result = new Operations();
            boolean cont = true;
            while (cont) {


                String operation;
                if (num1 == 0) {
                    System.out.println("Enter num");
                    num1 = sc.nextDouble();
                }
                System.out.println("Enter your operation");
                operation = sc.next();

                System.out.println("Enter one more num");
                num2 = sc.nextDouble();
                switch (operation) {
                    case "+":
                        num3 = result.add(num1, num2);
                        System.out.println(num3);
                        break;

                    case "-":
                        num3 = result.substract(num1, num2);
                        System.out.println(num3);
                        break;

                    case "*":
                        num3 = result.multiply(num1, num2);
                        System.out.println(num3);
                        break;

                    case "/":
                        try{
                            num3 = result.divide(num1, num2);}
                        catch(ArithmeticException e){
                            System.out.println(e);
                             Main.main(args);
                        }
                        System.out.println(num3);
                        break;

                    default:
                        System.out.println("Incorrect input");
                }
                System.out.println("Do you want to proceed with the last result (y) or start from the beginning(n) or exit(0)? ");
                item = sc.next();
                if (item.equals("y")) {
                    num1 = num3;
                    Main.main(args);
                } else if (item.equals("n")) {
                    num1 = 0;
                } else if (item.equals("0")) {
                    cont=false;
                    System.out.println("Exit");
                    sc.close();
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input.Change input");

        }

    }
}







