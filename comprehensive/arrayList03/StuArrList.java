import java.util.ArrayList;
import java.util.Scanner;
public class StuArrList {
static int searchIndex(ArrayList<Student> list){
    Scanner sc = new Scanner(System.in);
    System.out.println("Search student's ID: ");
    int stuId = sc.nextInt();
    for (int i=0; i<list.size(); i++){
      if(stuId == list.get(i).getId()){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
  
    ArrayList<Student> list  = new ArrayList<>();
    Student s1 = new Student(001,"zhe",18);
    Student s2 = new Student(002,"seu",18);
    Student s3 = new Student(003,"t3",18);

    list.add(s1);
    list.add(s2);
    list.add(s3);

    int index = searchIndex(list);
    System.out.println(index);


  }
}