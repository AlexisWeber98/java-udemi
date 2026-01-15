public class TiposDatos {
    public static void main(String[] args) {

        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);

        short tipoShort = 32767;
        System.out.println("tipoShort = " + tipoShort);

        int tipoEntero = 2147483647;
        System.out.println("tipoEnter = " + tipoEntero);

        long tipoLong = 987654321098765432L; // Usar 'L' al final para indicar que es un long
        System.out.println("tipoLong = " + tipoLong);

        float tipoFloat = 3.1415F; // Usar 'F' al final para indicar que es un float
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouble = 2.31415D; // Usar 'D' al final para indicar que es un double (OPCIONAL)
        System.out.println("tipoDouble = " + tipoDouble);

        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);

        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; // Valor numérico correspondiente al carácter 'A'
        System.out.println("tipoChar = " + tipoChar);
    }
}
