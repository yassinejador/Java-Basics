import java.io.File;
public class FileMethods {  
    public static void main(String[] args) {
        File file=new File("Message.txt");
        if (file.exists()) {
            System.out.println("The File is exists");
            System.out.println("Path : "+file.getPath());
            System.out.println("The Absolute Path : "+file.getAbsolutePath());
            System.out.println("is File ? : "+file.isFile());
            System.out.println("length : "+file.length());
            System.out.println("can Execute ? : "+file.canExecute());
            System.out.println(file.setReadOnly());
            System.out.println(file.setWritable(true));
            file.delete();
        } else {
            System.out.println("The doesn't exists exists");
        }
    }
}