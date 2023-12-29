
import java.util.Scanner;

public class MarksAverage {
    public static void main(String[] args) {
        int math, english, science, art, computer, total_marks, percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks out of 100");
        System.out.print("Enter marks of math: ");
        math = sc.nextInt();
        System.out.print("Enter marks of english : ");
        english = sc.nextInt();
        System.out.print("Enter marks of science : ");
        science = sc.nextInt();
        System.out.print("Enter marks of art : ");
        art = sc.nextInt();
        System.out.print("Enter marks of computer : ");
        computer = sc.nextInt();

        total_marks = math + english + science + art + computer;
        System.out.println("Total marks out of 500 : " + total_marks);

        percentage = total_marks / 5;
        System.out.println("Percent of marks=" + percentage);
    }
}
