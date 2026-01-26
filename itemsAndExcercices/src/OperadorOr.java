public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("Operador OR");

        boolean a = true, b = false;

        boolean result = a || b;
        System.out.println("Resultado de a || b: " + result);

        a = false;
        result = a || b;
        System.out.println("Resultado de a || b: " + result);

        a = true;
        b = true;
        result = a || b;
        System.out.println("Resultado de a || b: " + result);
        System.out.println("Operador OR exclusivo");
        a = true;
        b = false;
        result = a ^ b;

    }
}
