import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String args[]) throws IOException {
        File f = new File("C:\\Users\\balav\\OneDrive\\Desktop\\vin.txt");
        if (f.createNewFile()) {
            System.out.println("file succesfull created");
        } else if (f.exists()) {
            if (f.exists()) {
                System.out.println("The name of the file is " + f.getName());
                System.out.println("It  is readable file " + f.canRead());
                System.out.println("It is writable file  " + f.canWrite());
                System.out.println("Get the absolute file locaton" + f.getAbsolutePath());
                System.out.println("The length of the file is " + f.length());
            }
        } else {
            System.out.println("external error while creating the file ");
        }
    }
}
