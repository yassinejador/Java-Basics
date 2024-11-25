import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileReaderMethods {
    public static void main(String[] args) {
        try {
            FileReader filereader=new FileReader("Message.txt");
            int data=filereader.read(); //How This Works ?  
            while (data!=-1) {
                System.out.print((char)data);
                data=filereader.read();
            }
            filereader.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }  catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
