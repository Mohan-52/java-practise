import java.util.Arrays;
import java.util.List;

public class MethodRefferenceEx {

  public static void main(String[] args) {
    List<String> names=Arrays.asList("Navven", "Harsh","John");
    /* List<String> uNames= names.stream()
                          .map(str->str.toUpperCase())
                          .toList(); */


    List<String> uNames= names.stream()
                          .map(String::toUpperCase)
                          .toList();

   // uNames.forEach(System.out::println);
    System.out.println(uNames);
  }
}