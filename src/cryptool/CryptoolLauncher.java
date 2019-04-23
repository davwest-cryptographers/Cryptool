package cryptool;
import java.util.Scanner;

public class CryptoolLauncher {
static Scanner keyboard = new Scanner(System.in);
    /*

     */
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Cryptool, please enter the path of your text file to begin.");
        String filePath = keyboard.nextLine();
        System.out.println("Now input your chosen shift. Integer (0-999999999) only.");
        int encryptionKey = keyboard.nextInt();
        String ImportedText = ReadFromTxtFile.getFile(filePath); // Set the imported Text
        System.out.println(ImportedText); // This is a test, just to see if the file is there
        String encryptedText = Encryptor.encryptText(ImportedText, encryptionKey);
        String decryptedText = Encryptor.decryptText(encryptedText, encryptionKey);

        System.out.println(encryptedText);
        System.out.println(decryptedText);


    }
}