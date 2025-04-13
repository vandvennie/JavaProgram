public class Chef extends Employee{
  public Chef(){
  }//空参构造

  public Chef (int ID, String name, double wage) {
    super(ID, name, wage);//这里将值传到super的成员变量中 赋值
  }
  @Override
  public void work(){
    System.out.println(name + "cooks");
  }
  
}
