//              * 

//           *  *

//        *  *  *

//     *  *  *  *

//  *  *  *  *  *
public class PyramidPattern4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int k = 4; k > i; k--) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }

    }

}
