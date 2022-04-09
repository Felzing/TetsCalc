import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    int [] arabicNumbers = new int[10];
//    void initArabicNumbers(){
//        for (int i = 0; i < 10; i++) {
//            arabicNumbers[i] = i + 1;
//        }
//    }
    String [] romanicNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    String[] input;

    BufferedReader reader;

    String firstValue;

    String secondValue;

    public Calculator() throws IOException {

        for (int i = 0; i < 10; i++) {
           arabicNumbers[i] = i + 1;
       }
        reader = new BufferedReader(new InputStreamReader(System.in));
        input = reader.readLine().split(" ");
        if( input.length != 3) {
            System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
//        if (!MathOperations.values().equals(input[1])){
//            System.out.println("Строка не является математической операцией");
//        }
        firstValue = input[0];
        secondValue = input[2];

        reader.close();
    }
}