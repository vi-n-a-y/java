import java.util.List;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String args[]) {
        List<Integer> lst = new LinkedList<Integer>();
        lst.add(5);
        lst.add(2);
        lst.add(0);
        lst.add(3);
        lst.add(9);
        lst.add(5);
        System.out.println(lst);
        lst.remove(1);// its remove index element and move elements to the left side
        System.out.println("After removing a element : " + lst);
        lst.add(2, 4);// its add element in the index and move old element on move right side in the list.
        System.out.println("After adding a element : " + lst);
        lst.set(3, 8);// it replace the old value with current value
        System.out.println("After seting a element : " + lst);
        System.out.println("Is this list contains this element : " + lst.contains(4));// it checks the element presentin the list or not,return true if it is present.
        System.out.println("Getting element from the list : " + lst.get(2));// it gets the element based on index from the list.
        System.out.println("Index of the Element : " + lst.indexOf(5));
        System.out.println("Last Index of the Element : " + lst.lastIndexOf(5));
        int num = lst.get(3);
        System.out.println("The get method Element : " + num);
        System.out.println("iterate using for-each loop");
        for (int numbers : lst) {
            System.out.print(numbers + " ");
        }
    }
}