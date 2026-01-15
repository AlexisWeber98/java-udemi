public class CreateEmail {
    public static void main(String[] args) {
        final String name = "Ubaldo Acosta Soto";
        final String company = "Global Mentoring";
        final String domain = "com";

        StringBuilder email = new StringBuilder();
        email.append(name.replace(" ", ".").toLowerCase()).append("@").append(company.replace(" ", "").toLowerCase())
                .append(".").append(domain);

        System.out.println("Generated Email: " + email.toString());

    }

}
