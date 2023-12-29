import java.util.Scanner;
public class FarenheitToCelsius 
{
    public static void main(String[] args) 
    {
        float c,f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Fahrenhiet=");
        
        f=sc.nextFloat();
        c=((f-32)*5)/9;
        System.out.println("Celcius="+c);
    }
}
