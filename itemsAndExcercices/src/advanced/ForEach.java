package advanced;

public class ForEach {
    public static void main(String[] args) {

        int ages[] = { 5, 10, 15, 22, 13, 35, 39 };

        for (int age : ages) {
            System.out.println("age: " + age);
        }
    }
}
