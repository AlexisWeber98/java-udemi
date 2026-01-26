public class OperadoresUnarios {
    public static void main(String[] args) {

        System.out.println("Operadores Unarios");

        int a = 2, result;

        // operafor positivo

        result = +a;
        System.out.println("Resultado de +a: " + result);

        // operador negativo
        // cambia el signo del valor
        result = -a;
        System.out.println("Resultado de -a: " + result);

        // operadores de incre,emto y decremento

        // pre-incremento

        result = ++a; // primero incrementa y luego asigna
        System.out.println("Resultado de ++a: " + result);

        System.out.println("Valor de a despues de ++a: " + a);

        // post-incremento
        a = 3;

        result = a++; // primero asigna y luego incrementa
        System.out.println("Resultado de a++: " + result);
    }
}
