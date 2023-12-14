//write a program for password checker 
// password length must greater than 8
// first character in password not a number.
// In password must contain one or more small alphabets,one or more number(s) and one or more capital letters.
//Other than space and '/',it might contain all special characters.
public class Password {
    public static boolean strongPassword(String str, int n) {
        if (n < 8)
            return false;
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9')
            return false;
        int small = 0, capital = 0, number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '/')
                return false;
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                number++;
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                capital++;
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                small++;
        }
        if (capital > 0 && number > 0 && small > 0)
            return true;
        else
            return false;

    }

    public static void main(String args[]) {
        String str = "Abcd@1234";
        System.out.println(strongPassword(str, str.length()));
    }

}
