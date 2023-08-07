import exception.NotFormatException;
import exception.NotOperationException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String read = scanner.nextLine();
        String[] array = read.split("\\s");
        if (array.length != 3) {
            throw new NotFormatException("Format of the mathematical operation does not satisfy");
        }
        String firstStr = array[0];
        String arithStr = array[1];
        if (!Pattern.matches("[+*/\\-]", arithStr)) {
            throw new NotOperationException("String is not a mathematical operation");
        }
        String secondStr = array[2];
        Logic.logic(firstStr, arithStr, secondStr);
    }
}

