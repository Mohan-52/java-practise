import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
  int age;
  String name;
  public Student(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

  

  


}

public class ConstructorRefferenceEx {
  public static void main(String[] args) {

    List<String> names=Arrays.asList("Navin","Lakshmi","Rahul","Madhu");
    List<Student> students=new ArrayList<>();

    students=names.stream()
             .map(name->new Student(name))
             .toList();

     /*  students=names.stream()
              .map(Student::new)
              .toList(); */

              // Java 8-15 alternative:
        // List<Student> students = names.stream()
        //                               .map(Student::new)
        //                               .collect(Collectors.toList());


      
    System.out.println(students);
    
  }
}
