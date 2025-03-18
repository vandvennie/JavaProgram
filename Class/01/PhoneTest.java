public class PhoneTest {
  public static void main(String[] args) {
    //创建手机的对象
    Phone myPhone = new Phone();

    //给对象的赋值
    myPhone.brand = "XiaoMi";
    myPhone.price = 999.99;

    //获取手机对象中的值
    System.out.println(myPhone.brand);
    System.out.println(myPhone.price);

    //调用Phone对象的方法
    myPhone.drive();

    //创建第二个手机的对象
    Phone myPhone2 = new Phone();
    myPhone2.brand = "ZiMi";
    myPhone2.price = 89.99;
    myPhone2.drive();

  }
}