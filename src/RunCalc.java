import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.Arrays;

import static java.util.Arrays.*;

public class RunCalc {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();


        try {
                int first = Integer.parseInt(calculator.firstValue);
                int second = Integer.parseInt(calculator.secondValue);

            switch (calculator.input[1]){
                case "+" :
                    System.out.println(first + second);
                    break;
                case "-" :
                    System.out.println(first - second);
                    break;
                case "*" :
                    System.out.println(first * second);
                    break;
                case "/" :
                    System.out.println(first / second);
                    break;
                default:
                    System.out.println("Введена неверная математическая операция");

            }
        }catch (NumberFormatException e)
        { try {

            int first = binarySearch(calculator.romanicNumbers, calculator.firstValue) + 1;
            System.out.println(first);
            int second = binarySearch(calculator.romanicNumbers, calculator.secondValue) + 1;
            System.out.println(second);



            switch (calculator.input[1]) {
                case "+":
                    System.out.println(calculator.romanicNumbers[first + second - 1] );

                    break;
                case "-":
                    System.out.println(calculator.romanicNumbers[first - second - 1]);
                    break;
                case "*":
                    System.out.println(calculator.romanicNumbers[(first * second) - 1]);
                    break;
                case "/":
                    System.out.println(calculator.romanicNumbers[(first / second) - 1]);
                    break;
                default:
                    System.out.println("Введена неверная математическая операция");

            }

        } catch (NullPointerException ex) {
            System.out.println("Используются одновременно разные системы счисления");
        }

        }

    }
}
