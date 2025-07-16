import java.lang.StackWalker.Option;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
  public static void main(String[] args) {
    List<String> names=Arrays.asList("Naveen", "Lakshmi","John","Kishore");

   Optional<String> name=names.stream()
                .filter(str->str.contains("x"))
                .findFirst();
   // System.out.println(name.orElse("Not found"));
   System.out.println(name.get());
  }
  
}
