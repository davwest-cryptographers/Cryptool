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
        System.out.println("Welcome to Cryptool.");
        System.out.println("\n" +
                " $$$$$$\\                                 $$\\                         $$\\ \n" +
                "$$  __$$\\                                $$ |                        $$ |\n" +
                "$$ /  \\__| $$$$$$\\  $$\\   $$\\  $$$$$$\\ $$$$$$\\    $$$$$$\\   $$$$$$\\  $$ |\n" +
                "$$ |      $$  __$$\\ $$ |  $$ |$$  __$$\\\\_$$  _|  $$  __$$\\ $$  __$$\\ $$ |\n" +
                "$$ |      $$ |  \\__|$$ |  $$ |$$ /  $$ | $$ |    $$ /  $$ |$$ /  $$ |$$ |\n" +
                "$$ |  $$\\ $$ |      $$ |  $$ |$$ |  $$ | $$ |$$\\ $$ |  $$ |$$ |  $$ |$$ |\n" +
                "\\$$$$$$  |$$ |      \\$$$$$$$ |$$$$$$$  | \\$$$$  |\\$$$$$$  |\\$$$$$$  |$$ |\n" +
                " \\______/ \\__|       \\____$$ |$$  ____/   \\____/  \\______/  \\______/ \\__|\n" +
                "                    $$\\   $$ |$$ |                                       \n" +
                "                    \\$$$$$$  |$$ |                                       \n" +
                "                     \\______/ \\__|                                       \n" +
                " ~ Created by Kris S. and Amia C. \n");
        boolean runtime = true;
        String cypherChoice;
        while(runtime != false) {
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
                        System.out.println(resultText);
                    }
                    break;
                case "decrypt":
                    ImportedText = ReadFromTxtFile.getFile(filePath);
                    resultText = Encryptor.decryptText(ImportedText, encryptionKey);
                    try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("ResultFile.txt"), "utf-8"))) {
                        writer.write(resultText);
                        System.out.println("File written: ResultFile.txt");
                        System.out.println(resultText);
                    }
                    break;
                default:
                    System.out.println("Exiting program.");
                    runtime = false;
                    break;
            }
        }
    }
    }
