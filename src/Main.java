


import java.util.Random;

class StringRandomizer {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random RANDOM = new Random();

    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }
}

    class PasswordMaker {
    private static final Random RANDOM = new Random();
    private static final int MAGIC_NUMBER = RANDOM.nextInt(6) + 5; // între 5 și 10
    private static final String magicString = StringRandomizer.generateRandomString(20);

    public PasswordMaker() {}

    public String getPassword() {
        String randomPart = StringRandomizer.generateRandomString(MAGIC_NUMBER);
        String magicPart = StringRandomizer.generateRandomString(10);
        String lengthPart = String.valueOf(magicString.length());
        int randomInt = RANDOM.nextInt(51);

        return randomPart + magicPart + lengthPart + randomInt;
    }

    public static void main(String[] args) {
        PasswordMaker parola = new PasswordMaker();
        System.out.println("Generated Password: " + parola.getPassword());
    }
}
