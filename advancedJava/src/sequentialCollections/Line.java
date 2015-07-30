package sequentialCollections;

import java.util.PriorityQueue;
/**
 * 
 * @author abs
 *stores elements in the queue in their natural  order
 */
public class Line {
   public static void main(String[] args) {
      PriorityQueue<String> line = new PriorityQueue<String>();
      line.add("David");
      line.add("Cynthia");
      line.add("Raymond");
      line.add("Bryan");
      line.add("Clayton");
      System.out.println("The line: ");
      for (String name : line) {
         System.out.println(name);
      }
      line.poll();
      System.out.println("The line: ");
      for (String name : line) {
         System.out.println(name);
      }
      line.remove("Raymond");
      System.out.println("The line: ");
      for (String name : line) {
         System.out.println(name);
      }
      System.out.println("The head: " + line.peek());
   }
}