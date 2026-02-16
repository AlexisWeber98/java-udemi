public class TernaryOperator {
    public static void main(String[] args) {
        // Sintaxis: variable = (condition) ? valueIfTrue : valueIfFalse;

        int number = 4;

        String result = (number % 2 == 0) ? "pair" : "impair";
        System.out.println(result);

        int age = 16;
        String isAdult = (age >= 18) ? "is Adult" : "is not adult";
        System.out.println(isAdult);

        number = 10;
        String isPositive = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(isPositive);
    }
}
