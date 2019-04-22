package cryptool;
import java.util.Scanner;

public class CryptoolLauncher {
static Scanner keyboard = new Scanner(System.in);
    /*

     */
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Cryptool, please enter the path pf your text file to begin.");
        String filePath = keyboard.nextLine();
        String ImportedText = ReadFromTxtFile.getFile(filePath); // Set the imported Text
        System.out.println(ImportedText); // This is a test, just to see if the file is there

    }
}