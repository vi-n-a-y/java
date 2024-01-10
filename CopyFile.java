import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Desktop\\sin.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Desktop\\vin.txt");
        int i;
        while ((i = fis.read()) != -1) {
            fos.write((char) i);
        }
        System.out.println("success full copy the data");
        fis.close();
        fos.close();
    }
}
