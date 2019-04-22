package cryptool;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromTxtFile {
    public static void readFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\ks145244\\Desktop\\TestFiles\\TestDoc.txt");
        Scanner SFile = new Scanner(file);

        while (SFile.hasNextLine())
            System.out.println(SFile.nextLine());
    }
}
