import java.io.IOException;
import java.util.Arrays;



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

            int first = Arrays.asList(calculator.romanicNumbers).indexOf(calculator.firstValue) + 1;
            int second = Arrays.asList(calculator.romanicNumbers).indexOf(calculator.secondValue) + 1;




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

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Используются одновременно разные системы счисления");
        }

        }

    }
}
