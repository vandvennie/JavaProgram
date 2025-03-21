//package Class.03;

public class Constructor {
  private String name;
  private int age;

  //空参构造方法 即默认构造方法。
  //类定义文件（Class File，即本文件）中也可以不写这个方法,系统会默认给我们一个空参构造方法，这个构造方法是隐藏的
  //推荐手动写默认构造方法，这样可以保证代码的可读性
  public Constructor() {
    System.out.println("This is a Default Constructor().空参构造");
  } 

  //有参构造方法
  //如果定义了带参构造，系统将不在提供默认的无参构造
  public Constructor(String name, int age) {
    this.name = name; 
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;// this后面是成员变量 name
  }

  public String getName() {
    return name;// 这里返回的是成员变量 name
  }

  public void setAge(int age) {
    if (age >= 18 && age <= 50) {
      this.age = age;
    } else {
      System.out.println("Invalid age");
    }
  } 

  public int getAge() {
    return age;
  }
}
