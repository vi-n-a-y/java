public class StringMethods {
    public static void main(String args[]) {
        String str = "welcome ";
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf('o'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.subSequence(2, 6));
        System.out.println(str.substring(3));
        System.out.println(str.compareTo("welcome"));
        System.out.println(str.concat("to India"));

    }

}
