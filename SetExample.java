import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

  public static void main(String[] args) {
    
    Set<Integer> nums=new HashSet<>();
   // Set<Integer> nums=new TreeSet<>(); for sorted
    nums.add(62);
    nums.add(15);
    nums.add(8);
    nums.add(2);
    nums.add(6);

    Iterator<Integer> values=nums.iterator();

    while (values.hasNext()) {
      System.out.println(values.next());
      
  }

   /*  for(int n:nums){
      System.out.println(n);
    } */
  }
  
}
