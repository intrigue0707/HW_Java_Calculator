package com.epam;
import com.epam.Main;


/**
 * Created by Maryia_Ihnatsenka on 2015-10-27.
 */

public class Operations {

    double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }


    double substract(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    double divide(double num1, double num2) {
        if(num2==0) {
            throw new ArithmeticException ("Divide by zero is prohibited");
        }
           double result = num1 / num2;
        return result;
    }

}




