package Model;


import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    private FileWriter fileWriter;

    public void writeToFile(String filePath, String string) throws IOException {
        FileWriter writer = new FileWriter(filePath, true);
        writer.write(string);
        writer.write("\n");
        writer.flush();
    }
}
