import java.util.ArrayList;
import java.util.Scanner;
public class StuArrList {
  public static void main(String[] args) {
  
    ArrayList<Student> list  = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    
    System.out.println("How many students you want to input?");
    int num = sc.nextInt();

    for (int i= 0; i< num; i++){
      Student student = new Student();// 创建学生对象

      System.out.println("Input the number "+(i+1)+ " student's name: ");
      student.setName(sc.next());
      System.out.println("Input the number "+(i+1)+ " student's age: ");
      student.setAge(sc.nextInt());
      
      list.add(student );
    }

    for (int i= 0; i< list.size(); i++){
    
      System.out.println(list.get(i).getName()+" is "+ list.get(i).getAge()+" years old.");
    }
  }
}
