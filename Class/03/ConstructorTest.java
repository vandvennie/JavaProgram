//package Class.03;

public class ConstructorTest {
  public static void main(String[] args) {
    //创建对象
    //调用空参构造方法，即new后面的类名里小括号里什么都不写
    //如果我们没有写任何构造方法，系统会默认给我们一个空参构造方法，这个构造方法是隐藏的
    //当我们希望能使用 new ClassName() 创建对象，就应该手动写默认构造方法。
    Constructor c = new Constructor();

    //调用有参构造方法
    Constructor c2 = new Constructor("Tom", 20); 

    System.out.println(c2.getName());
    System.out.println(c2.getAge());
  }
}
