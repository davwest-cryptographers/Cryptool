package cryptool;

/**
 * Encryptor Class
 *
 * Contains methods for encrypting and decrypting strings
 */

public class Encryptor {

    /**
     *
     * @param key Passphrase
     * @param raw The text to be encypted
     *
     */
    public static String encryptText(String raw, int key) {
        String encryptMessage = "";
        int len = raw.length();
        for (int x = 0; x < len; x++) {
                encryptMessage += (char) (raw.charAt(x) + key);
        }
        return encryptMessage;
    }

    public static String decryptText(String raw, int key) {
        String decryptMessage = "";
        int len = raw.length();
        for (int x = 0; x < len; x++) {
                decryptMessage += (char) (raw.charAt(x) - key);
        }
        return decryptMessage;
    }
}
