package cryptool;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class CryptoolLauncher {
static Scanner keyboard = new Scanner(System.in);
    /*

     */
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Cryptool. Created by Kris S, and Amia C.");
        int runtime = 1;
        String cypherChoice;
        while(runtime != 0) {
            String resultText;
            System.out.println("Would you like to ENCRYPT or DECRYPT? Or Enter something else to exit.");
            cypherChoice = keyboard.next();
            System.out.println("Enter File Path to begin.");
            String filePath = keyboard.next();
            System.out.println("Now input your shift key. Integer (0-999999999) only.");
            int encryptionKey = keyboard.nextInt();

            switch (cypherChoice.toLowerCase()) {
                case "encrypt":
                    String ImportedText = ReadFromTxtFile.getFile(filePath);
                    resultText = Encryptor.encryptText(ImportedText, encryptionKey);
                    try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("ResultFile.txt"), "utf-8"))) {
                        writer.write(resultText);
                        System.out.println("File written: ResultFile.txt");
                    }
                    break;
                case "decrypt":
                    ImportedText = ReadFromTxtFile.getFile(filePath);
                    resultText = Encryptor.decryptText(ImportedText, encryptionKey);
                    try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("ResultFile.txt"), "utf-8"))) {
                        writer.write(resultText);
                        System.out.println("File written: ResultFile.txt");
                        // DatabaseConn.DatabaseUpdate(filePath, encryptionKey, resultText, cypherChoice);
                    }
                    break;
                default:
                    System.out.println("Exiting program.");
                    runtime = 0;
                    break;
            }
        }
    }
    }
