import java.io.IOException;
import java.text.ParseException;

public class RunCalc {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        try {
            calculator.setFirstNumber(Integer.parseInt(calculator.getInputSplit(0)));
            calculator.setSecondNumber(Integer.parseInt(calculator.getInputSplit(2)));
            switch (calculator.getInputSplit(1)){
                case "+":
                    System.out.println(calculator.getFirstNumber() + calculator.getSecondNumber());
                    break;
                case "-":
                    System.out.println(calculator.getFirstNumber() - calculator.getSecondNumber());
                    break;
                case "*":
                    System.out.println(calculator.getFirstNumber() * calculator.getSecondNumber());
                    break;
                case "/":
                    System.out.println(calculator.getFirstNumber() / calculator.getSecondNumber());
                    break;
                default:
                    System.out.println("Введена неверная математическая операция");

            }
        }catch (NumberFormatException e){
            switch (calculator.getInputSplit(1)){
                case "+":

                    System.out.println(calculator.getRomanNumbersValue(calculator.getRomanNumbers(0) + calculator.getRomanNumbers(2)));

                    break;
                case "-":
                    System.out.println(calculator.getRomanNumbersValue(calculator.getRomanNumbers(0) - calculator.getRomanNumbers(2)));
                    break;
                case "*":
                    System.out.println(calculator.getRomanNumbersValue(calculator.getRomanNumbers(0) * calculator.getRomanNumbers(2)));
                    break;
                case "/":
                    System.out.println(calculator.getRomanNumbersValue(calculator.getRomanNumbers(0) /calculator.getRomanNumbers(2)));
                    break;
                default:
                    System.out.println("Введена неверная математическая операция");

            }

        }

    }
}
