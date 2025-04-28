import java.util.Random;
public class Figure {
  private String name;
  private int blood;
  public Figure(String name, int blood) {
    this.name = name;
    this.blood = blood;
  }
  public Figure() {
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getBlood() {
    return blood;
  }
  public void setBlood(int blood) {
    this.blood = blood;
  }
  
  void lossBlood(Figure defender) {
    System.out.print( this.name + " hited " +defender.name + ", " + defender.name + " still have blood volume ");

  }
  // 这里是方法的调用者this去攻击参数defender
  void fighting(Figure defender){
    //生成一个random对象
    Random r = new Random();
    //将对象根据方法.nextInt()生成的数字赋值给int lossBlood
    int lossBlood = r.nextInt(20) + 1;// 随机掉血1～20

    defender.blood -= lossBlood;
    lossBlood(defender);
    if (defender.blood <= 0) {
      defender.blood = 0;
      System.out.println(defender.blood);
      System.out.println(this.name + " K.O. " + defender.name);
    } else {
      System.out.println(defender.blood);
    }
    
  }
  
}
