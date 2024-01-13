package RandEmail;

public class GenerateRandomEmail {
    public static String getRandomEmail() {
        return "kona.sl." + System.currentTimeMillis() + "@gmail.com";
    }
    public static void main(String[] args) {

        // Display the generated email
        System.out.println(GenerateRandomEmail.getRandomEmail());
    }
}
