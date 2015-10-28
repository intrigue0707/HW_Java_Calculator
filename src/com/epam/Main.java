package com.epam;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
import com.epam.Operations;

public class Main {

    public static void main(String[] args) throws IOException  {

        Scanner sc = new Scanner(System.in);
try{
        Operations result = new Operations();

        String item;
        boolean cont=true;
        while(cont){
        double num1, num2, num3;
        String operation;

    System.out.println("Enter num");
    num1 = sc.nextDouble();

    System.out.println("Enter your operation");
    operation = sc.next();

    System.out.println("Enter one more num");
    num2 = sc.nextDouble();

            switch (operation) {
                case "+":
                    num3 = result.add(num1, num2);
                    System.out.println(num3  + "Do you want to proceed? y/n");
                    item = sc.next();
                    if (item.equals("y")){
                        cont=true;
                    }else if (item.equals("n")) {
                        cont = false;
                        System.out.println("Exit");
                    }
                    break;

                case "-":
                    num3 = result.substract(num1, num2);
                    System.out.println(num3  + "Do you want to proceed? y/n");
                    item = sc.next();
                    if (item.equals("y")){
                        cont=true;
                    }else if (item.equals("n")) {
                        cont = false;
                        System.out.println("Exit");
                    }
                    break;

                case "*":
                    num3 = result.multiply(num1, num2);
                    System.out.println(num3  + "Do you want to proceed? y/n");
                    item = sc.next();
                    if (item.equals("y")){
                        cont=true;
                    }else if (item.equals("n")) {
                        cont = false;
                        System.out.println("Exit");
                    }
                    break;

                case "/":
                    if (num2==0)
                    {
                        System.out.println("Divide by zero is prohibited");}
                    else{
                    num3 = result.divide(num1, num2);
                    System.out.println(num3  + "Do you want to proceed? y/n");
                    item = sc.next();
                    if (item.equals("y")){
                        cont=true;
                    }else if (item.equals("n")) {
                        cont = false;
                        System.out.println("Exit");
                    }}
                    break;
            }
    }
    }catch (InputMismatchException e){
    System.out.println("Incorrect input.Change input");
    Main.main(args);
}

    }}







