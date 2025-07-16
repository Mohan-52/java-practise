import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

  

  @Override
  public int compareTo(Student that) {
    return this.age>that.age?1:-1;
  }

  
}

public class ComparableExample {
  public static void main(String[] args) {

    List<Student> students=new ArrayList<>();
    students.add(new Student(38, "Mahesh"));
    students.add(new Student(19, "Lokesh"));
    students.add(new Student(25, "Ravi"));
    students.add(new Student(22, "Ahmed"));

      Collections.sort(students);

      for (Student s : students) {
            System.out.println(s);
        }

    
  }

}
