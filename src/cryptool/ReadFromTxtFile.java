package cryptool;
import java.nio.file.*;

public class ReadFromTxtFile {
    public static String setFile(String fileName)throws Exception
    {
        String data;
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static String getFile(String filePath) throws Exception
    {
        String data = setFile(filePath);
        return data;
    }
}
