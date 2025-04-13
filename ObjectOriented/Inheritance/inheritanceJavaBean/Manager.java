public class Manager extends Employee{
  private double bouns;

  public Manager(){
  }//空参构造

  public Manger (int ID, String name, double wage, double bouns) {
    super(ID, name, wage);//这里将值传到super的成员变量中 赋值
    this.bouns = bouns;
  }

  public void setBouns(double bouns){
    this.bouns = bouns;
  }
  public int getBouns(){
    return bouns;
  }
  
  @Override
  public void work(){
    System.out.println(name + " manages others");
  }
  
}
