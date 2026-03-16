import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // declarar un arreglo
        int[] numbers;
        // inicializar un arreglo
        numbers = new int[5];

        // declarar e inicialiar un arreglo
        int[] numbers2 = new int[5];

        // modificacion de un arreglo

        // asignar un valor a una posicion del arreglo
        numbers[0] = 10;
        numbers[1] = 20;

        // el resto de las posiciones del arreglo se inicializan con el valor por
        // defecto (0 para int)

        numbers2[0] = 13;
        numbers2[1] = 21;
        numbers2[4] = 64;

        System.out.println("primer elemento del arreglo numbers2: " + numbers2[0]);
        System.out.println("segundo elemento del arreglo numbers2: " + numbers2[1]);
        System.out.println("ultimo elemento del arreglo numbers2: " + numbers2[4]);

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("elemento en la posicion " + i + ": " + numbers2[i]);
        }

        // asignar un valores del arreglo

        int[] numbers3 = { 1, 3, 5, 7, 9 };

        for (int i = 0; i < numbers3.length; i++)
            System.out.println("elemento en la posicion " + i + ": " + numbers3[i]);

        // inttrodicir valores a un arreglo

        Scanner console = new Scanner(System.in);
        System.out.println("\n\ningrese el tamaño del arreglo: ");
        int size = console.nextInt();

        int[] userNumbers = new int[size];

        System.out.println("ingrese valores del  arreglo ");
        for (int i = 0; i < size; i++) {
            System.out.println("ingrese el valor para la posicion " + i + ": ");
            userNumbers[i] = console.nextInt();
        }

        System.out.println("\nValores del arreglo ingresados por el usuario:    \n");
        console.close();

        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("elemento en la posicion " + i + ": " + userNumbers[i]);
        }
    }
}
