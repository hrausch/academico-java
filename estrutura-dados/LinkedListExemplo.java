import java.util.LinkedList;
import java.util.List;


public class LinkedListExamplo {
  public static void main(String[] args) {
      List<Integer> numbers = new LinkedList<>();


      numbers.add(10);
      numbers.add(20);
      numbers.add(30);


      System.out.println(numbers); // Output: [10, 20, 30]
  }
}