import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String args[]) throws IOException {
        File f = new File("C:\\Users\\balav\\OneDrive\\Desktop\\vin.txt");
        if (f.createNewFile()) {
            System.out.println("file succesfull created");
        } else if (f.exists()) {
            System.out.println("already file is exists");
        } else {
            System.out.println("external error while creating the file ");
        }
    }
}
