public class OperadoresDeAsignacion {
    public static void main(String[] args) {
        System.out.println(" **** Operadores de asignacion ***** ");

        int myNumber = 10;

        System.out.println("Valor inicial de myNumber: " + myNumber);

        myNumber += 10; // myNumber = myNumber + 10
        System.out.println("Valor de myNumber despues de += 10: " + myNumber);

        myNumber -= 5; // myNumber = myNumber - 5
        System.out.println("Valor de myNumber despues de -= 5: " + myNumber);

        myNumber *= 3; // myNumber = myNumber * 3
        System.out.println("Valor de myNumber despues de *= 3: " + myNumber);

        // asignacion de variables múltiples

        int a = 120, b = 15, c = 32;

        System.out.printf("Valores iniciales: a = %d, b = %d, c = %d", a, b, c);
    }
}
