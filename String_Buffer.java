public class String_Buffer {
    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("Welcome to India");
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("come"));
        System.out.println(str.append(" namaste"));
        System.out.println(str.insert(0, "hii "));
        System.out.println(str.delete(0, 4));
        System.out.println(str.replace(0, 7, "Hello"));
        System.out.println(str.length());
        System.out.println(str.subSequence(2, 6));
        System.out.println(str.substring(3));
        System.out.println(str);
    }
}
