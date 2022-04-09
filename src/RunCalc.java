import java.io.IOException;
import java.util.Arrays;



public class RunCalc {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите 2 числа (от 1 до 10 или от I до X) и знак мамтематической операции между ними через пробел. Оба числа должны быть из одной системы счисления - арабской или римской");
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

            int first = Arrays.asList(calculator.romanInput).indexOf(calculator.firstValue) + 1;
            int second = Arrays.asList(calculator.romanInput).indexOf(calculator.secondValue) + 1;
            int result;



            switch (calculator.input[1]) {
                case "+":
                    result = first + second;
                    System.out.println(calculator.arabicToRonanConverter(result));

                    break;
                case "-":
                    result = first - second;
                    if(result < 0) System.out.println("Римские цифры не имеют отрицательных значений");
                    else System.out.println(calculator.arabicToRonanConverter(result));
                    break;
                case "*":
                    result = first * second;
                    System.out.println(calculator.arabicToRonanConverter(result));
                    break;
                case "/":
                    result = first / second;
                    System.out.println(calculator.arabicToRonanConverter(result));
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
