import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMethods {
    public static void main(String[] args) {
        try {
            FileWriter filewriter=new FileWriter("Message.txt");
            filewriter.write("Hello World\nHow are you fine ?");
            filewriter.append("\n:)");
            filewriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
