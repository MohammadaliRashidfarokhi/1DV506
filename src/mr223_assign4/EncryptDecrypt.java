package mr223_assign4;

public class EncryptDecrypt {
    static String encryptLine(String txt) {
        String empty = "";

        for (int i = 0; i < txt.length(); i++) {
            empty += (char) ((int) txt.charAt(i) + 3);
        }

        return empty + "\n";
    }
    static String decryptLine(String message) {
        String empty2 = "";

        for (int x = 0; x < message.length(); x++) {
            empty2 += (char) ((int) message.charAt(x) - 3);
        }
        return empty2 + "\n";
    }
}