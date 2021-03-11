import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstStr = scanner.next();
        String arithStr = scanner.next();
        String secondStr = scanner.next();
        Logic.logic(firstStr, arithStr, secondStr);
    }
}

