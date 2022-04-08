import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.System.in;

public class Calculator {
    String number;
    private int [] arabicNumbers = new int[10];
    private Map<String, Integer> romanNumbers = new HashMap<>();

    public int[] getArabicNumbers() {
        return arabicNumbers;
    }

    public void setArabicNumbers(int[] arabicNumbers) {
        this.arabicNumbers = arabicNumbers;
    }

    public int getRomanNumbers(int i) {


        return romanNumbers.get(getInputSplit(i));
    }


    public void setRomanNumbers(Map<String, Integer> romanNumbers) {
        this.romanNumbers = romanNumbers;
    }
    public String getRomanNumbersValue(int i){
        for (Map.Entry<String, Integer> entry :
            romanNumbers.entrySet()){
            if(entry.getValue() == i) number = entry.getKey();

        }
        return number;
    }

    public BufferedReader getReader() {
        return reader;
    }

    public void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInputSplit(int i) {
        return inputSplit[i];
    }

    public void setInputSplit(String[] inputSplit) {
        this.inputSplit = inputSplit;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getMathAction() {
        return mathAction;
    }

    public void setMathAction(String mathAction) {
        this.mathAction = mathAction;
    }

    private BufferedReader reader;
    private String input;
    private String[] inputSplit;
    private int firstNumber;
    private int secondNumber;
    private String mathAction;
    public Calculator() throws IOException {
        for (int i = 0; i < arabicNumbers.length ; i++) {
            arabicNumbers[i] = i + 1;
        }
        romanNumbers.put("I", 1);
        romanNumbers.put("II", 2);
        romanNumbers.put("III", 3);
        romanNumbers.put("IV", 4);
        romanNumbers.put("V", 5);
        romanNumbers.put("VI", 6);
        romanNumbers.put("VII", 7);
        romanNumbers.put("VIII", 8);
        romanNumbers.put("IX", 9);
        romanNumbers.put("X", 10);
        reader = new BufferedReader(new InputStreamReader(in));
        input = reader.readLine();
        inputSplit = input.split(" ");
        reader.close();
    }


}
