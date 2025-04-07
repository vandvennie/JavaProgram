import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {
    Student stu1 = new Student("Jone", 18, "male");
    Student stu2 = new Student("Job", 29, "male");
    Student stu3 = new Student("Jonason", 22, "male");

    System.out.println(stu1.name+" is "+stu1.age);

    ArrayList<Student> list = new ArrayList<>() ;

    //在ArrayList中存储对象
    list.add(stu1);
    list.add(stu2);
    list.add(stu3);

    //调用MaxUtil类中的 方法maxAge（）
    int maxAge = MaxUtil.maxAge(list);
    System.out.println(maxAge);
  }
}
