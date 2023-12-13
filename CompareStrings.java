class Compare {
    public boolean compareMethod(String str1, String str2) {
        if (str1 == null || str2 == null)
            return false;
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

public class CompareStrings {
    public static void main(String args[]) {
        Compare cmp = new Compare();
        String str = "welcome";
        String str_1 = "welcome";
        System.out.println(cmp.compareMethod(str, str_1));
    }

}
