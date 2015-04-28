/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CI;

/**
 *
 * @author user
 */
public class MathFunctions {
	
	public MathFunctions() {}

    double result;

    double add(double number1, double number2) {
        result = number1 + number2;
        return result;
    }

    double subtract(double number1, double number2) {
        result = number1 - number2;
        return result;
    }

    double multiply(double number1, double number2) {
        result = number1 * number2;
        return result;
    }

    double divide(double number1, double number2) {
        result = number1 / number2;
        return result;
    }

    double factorial(double number1) {

        if (number1 == 0 || number1 == 1) {
            return 1;
        }
        result = number1 * factorial(number1 - 1);
        return result;
    }

    double power(double number1, double number2) {
        result = Math.pow(number1, number2);
        return result;
    }

    double log(double number1) {
        result = Math.log(number1);
        return result;
    }

}
