import java.util.*;
public class remove {
  public static void main(String[] args) {
    // create an ArrayList
    ArrayList<Integer> a = new ArrayList<>();
    a.add(2);
    a.add(3);
    a.add(5);
    System.out.println("ArrayList: " + a);
    int removedElement = a.remove(2);
    System.out.println("Removed Element: " + removedElement);
    System.out.println("ArrayList after deletion : "+a);
  }
}

