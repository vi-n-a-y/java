import java.util.List;
import java.util.ArrayList;
public class ListExample {
    public static void main(String args[]) {
        List<String> ls = new ArrayList<String>();
        ls.add("red");
        ls.add("orange");
        ls.add("pink");
        ls.add("yellow");
        System.out.println(ls);
        ls.add(2, "red");//its add element in the index and move old element on move right side in the list.
        System.out.println("After adding a element : " + ls);
        ls.set(3, "blue");//it replace the current value with old value.
        System.out.println("After seting a element : " + ls);
        ls.remove(1);//its remove index element and move elements to the left side
        System.out.println("After removing a element : " + ls);
        System.out.println("Is this list contains this element : " + ls.contains("orange"));//it checks the element present in the list or not,return true if it is present.
        System.out.println("Getting element from the list : " + ls.get(2));//it gets the element based on index from the list.
        System.out.println("Index of the Element : " + ls.indexOf("red"));
        System.out.println(" Last Index of the Element : " + ls.lastIndexOf("red"));
        String name = ls.get(3);
        System.out.println("The get method Element : " + name);
        System.out.println("iterate using for loop.");
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
        System.out.println("");
    }
}
