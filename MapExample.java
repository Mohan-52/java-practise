import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    Map<String, Integer> students= new HashMap<>();

    students.put("Amit", 23);
    students.put("Akash", 56);
    students.put("Praveen", 99);
    students.put("Mohit", 33);
    students.put("Akash", 76);

    // System.out.println(students.get("Mohit"));

    for(String name: students.keySet()){
      System.out.println(name+" "+students.get(name));
    }
  }
}
