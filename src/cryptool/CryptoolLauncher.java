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
        System.out.println("                                                                                                                                                    \n" +
                "                                                                                                                                                    \n" +
                "        CCCCCCCCCCCCC                                                                       tttt                                            lllllll \n" +
                "     CCC::::::::::::C                                                                    ttt:::t                                            l:::::l \n" +
                "   CC:::::::::::::::C                                                                    t:::::t                                            l:::::l \n" +
                "  C:::::CCCCCCCC::::C                                                                    t:::::t                                            l:::::l \n" +
                " C:::::C       CCCCCCrrrrr   rrrrrrrrryyyyyyy           yyyyyyyppppp   ppppppppp   ttttttt:::::ttttttt       ooooooooooo      ooooooooooo    l::::l \n" +
                "C:::::C              r::::rrr:::::::::ry:::::y         y:::::y p::::ppp:::::::::p  t:::::::::::::::::t     oo:::::::::::oo  oo:::::::::::oo  l::::l \n" +
                "C:::::C              r:::::::::::::::::ry:::::y       y:::::y  p:::::::::::::::::p t:::::::::::::::::t    o:::::::::::::::oo:::::::::::::::o l::::l \n" +
                "C:::::C              rr::::::rrrrr::::::ry:::::y     y:::::y   pp::::::ppppp::::::ptttttt:::::::tttttt    o:::::ooooo:::::oo:::::ooooo:::::o l::::l \n" +
                "C:::::C               r:::::r     r:::::r y:::::y   y:::::y     p:::::p     p:::::p      t:::::t          o::::o     o::::oo::::o     o::::o l::::l \n" +
                "C:::::C               r:::::r     rrrrrrr  y:::::y y:::::y      p:::::p     p:::::p      t:::::t          o::::o     o::::oo::::o     o::::o l::::l \n" +
                "C:::::C               r:::::r               y:::::y:::::y       p:::::p     p:::::p      t:::::t          o::::o     o::::oo::::o     o::::o l::::l \n" +
                " C:::::C       CCCCCC r:::::r                y:::::::::y        p:::::p    p::::::p      t:::::t    tttttto::::o     o::::oo::::o     o::::o l::::l \n" +
                "  C:::::CCCCCCCC::::C r:::::r                 y:::::::y         p:::::ppppp:::::::p      t::::::tttt:::::to:::::ooooo:::::oo:::::ooooo:::::ol::::::l\n" +
                "   CC:::::::::::::::C r:::::r                  y:::::y          p::::::::::::::::p       tt::::::::::::::to:::::::::::::::oo:::::::::::::::ol::::::l\n" +
                "     CCC::::::::::::C r:::::r                 y:::::y           p::::::::::::::pp          tt:::::::::::tt oo:::::::::::oo  oo:::::::::::oo l::::::l\n" +
                "        CCCCCCCCCCCCC rrrrrrr                y:::::y            p::::::pppppppp              ttttttttttt     ooooooooooo      ooooooooooo   llllllll\n" +
                "                                            y:::::y             p:::::p                                                                             \n" +
                "                                           y:::::y              p:::::p                                                                             \n" +
                "                                          y:::::y              p:::::::p                                                                            \n" +
                "                                         y:::::y               p:::::::p                                                                            \n" +
                "                                        yyyyyyy                p:::::::p                                                                            \n" +
                "                                                               ppppppppp                                                                            \n" +
                "                                                                                                                                                    \n" +
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
