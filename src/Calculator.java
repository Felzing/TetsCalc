import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {
    int [] arabicNumbers = new int[10];
    void initArabicNumbers(){
        for (int i = 0; i < 10; i++) {
            arabicNumbers[i] = i + 1;
        }
    }
    String [] romanicInput = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    Map<Integer, String> romanicOutPut = new HashMap<>();
    void initMap (){
        romanicOutPut.put(1, "I");
        romanicOutPut.put(5, "V");
        romanicOutPut.put(10, "X");
        romanicOutPut.put(50, "L");
        romanicOutPut.put(100, "C");
        romanicOutPut.put(500, "D");
    }
    int[] divs = {500, 100, 50, 10, 5, 1};
    StringBuilder stringBuilder = new StringBuilder();

    String arabicToRonanConverter(int number){
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List <RomanNums> romanNumerals = RomanNums.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNums currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }


    String[] input;

    BufferedReader reader;

    String firstValue;

    String secondValue;

    public Calculator() throws IOException {
        initMap ();
        initArabicNumbers();
        reader = new BufferedReader(new InputStreamReader(System.in));
        input = reader.readLine().split(" ");
        if( input.length != 3) {
            System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");

        }else {
            firstValue = input[0];
            secondValue = input[2];
        }



        reader.close();
    }
}