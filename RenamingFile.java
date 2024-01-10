import java.io.File;
import java.io.IOException;

public class RenamingFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\balav\\OneDrive\\Desktop\\vin.txt");
        File r = new File("C:\\Users\\balav\\OneDrive\\Desktop\\sin.txt");
        if (f.exists()) {
            // r.delete();
            // System.out.println("deleted successfully");
            System.out.println(f.renameTo(r));
            System.out.println("successfull rename the file");
        } else {
            System.out.println("unable to rename the file");
        }
    }
}
