
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManipulation {

    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\balav\\OneDrive\\Desktop\\vin.txt");
        fw.write("learning programing in java");
        System.out.println("successfully wrote text in the file");
        fw.close();

        FileReader fr = new FileReader("C:\\Users\\balav\\OneDrive\\Desktop\\vin.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println("\n successfull read the file");
        fr.close();
    }
}