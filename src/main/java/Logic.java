public class Logic {

    public static void logic(String firstString, String arithmetic, String secondString) {
        int first = 0;
        int second = 0;
        int result = 0;

        boolean flag = false;
        try {
            first = Integer.parseInt(firstString);
            second = Integer.parseInt(secondString);
        } catch (Exception e) {
            try {
                first = RomanArabicConverter.romanToArabic(firstString);
                second = RomanArabicConverter.romanToArabic(secondString);
                flag = true;
            } catch (Exception e1) {
                System.out.println("Wrong data");
                System.exit(0);
            }
        }
        if (first < 0 || first > 10 || second < 0 || second > 10) {
            System.out.println("Numbers must be from 1 to 10 inclusive");
            System.exit(0);
        }
        CalculatorOperation operation = new CalculatorOperation();
        try {
            switch (arithmetic) {
                case "+":
                    result = operation.add(first, second);
                    break;
                case "-":
                    result = operation.subtract(first, second);
                    break;
                case "*":
                    result = operation.multiply(first, second);
                    break;
                case "/":
                    result = operation.divide(first, second);
                    break;
                default:
                    throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Inappropriate arithmetic operation");
            System.exit(0);
            e.printStackTrace();
        }
        if (flag) {
            String roman = RomanArabicConverter.arabicToRoman(result);
            System.out.println(roman);
        } else System.out.println(result);
    }
}


