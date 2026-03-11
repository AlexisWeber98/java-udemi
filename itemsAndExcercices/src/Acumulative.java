public class Acumulative {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println(" sumamos " + result + " + " + i);

            result += i;

        }
        System.out.println("result = " + result);

        System.out.println(" -----------------------  ahora con do while --------------------");
        int result2 = 0;
        int i = 1;
        do {
            System.out.println("sumamos " + result2 + " + " + i);
            result2 += i;
            i++;
        } while (i < 10);
        System.out.println("result2 = " + result2);

        System.out.println("-----------------------  ahora con while --------------------");
        int result3 = 0;
        int j = 1;
        while (j <= 15) {
            System.out.println("sumamos " + result3 + " + " + j);
            result3 += j;
            j++;
        }
        System.out.println("result3 = " + result3);
    }
}
