public class FormateoDeCadenas {
    public static void main(String[] args) {

        String name = "Matías";
        int age = 30;
        double salary = 21000.50;

        // string format

        var message = String.format("Nombre: %s, age: %d, Salary: $%.2f", name, age, salary);
        System.out.println(message);

        // printf

        System.out.printf("Nombre: %s, age: %d, Salary: $%.2f%n", name, age, salary);

        // bloques de texto

        int employeeId = 12;
        var messages = """
                %nPerson Details:\s
                ------------------------%n
                \tName : %s
                \tAge  : %d
                \tSalary : $%2f
                \tEmployee ID : %04d
                """.formatted(name, age, salary, employeeId);

        // formateo con printf

        System.out.println("""
                %nPerson Details:\s
                ------------------------%n
                \tName : %s
                \tAge  : %d
                \tSalary : $%2f
                \tEmployee ID : %04d
                """.formatted(name, age, salary, employeeId));

        System.out.println(messages);
    }
}
