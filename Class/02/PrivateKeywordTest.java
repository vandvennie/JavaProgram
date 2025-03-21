//package Class.02;

public class PrivateKeywordTest {
  public static void main(String[] args){
    PrivateKeyword obj = new PrivateKeyword();
    //没有设置私有化的成员变量，所以可以直接赋值
    // obj.name = "Alice";
    // obj.age = 20;
    // obj.gender = 'f';

    //设置私有化后，需要通过调用set方法赋值
    obj.setName("Alice");
    obj.setAge(20);
    obj.setGender("f");

    System.out.println("Name: " + obj.getName());
    System.out.println("Age: " + obj.getAge());
    System.out.println("gender: " + obj.getGender());

    obj.sleep();
  }
}
