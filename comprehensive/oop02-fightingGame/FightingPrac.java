
public class FightingPrac {
  public static void main(String[] args) {
    Figure f1 = new Figure("Iron woman",100, "female");
    Figure f2 = new Figure("Spider man",100, "male");
    int round =1;
    
    // 单数轮f1发起攻击
    while (true) {
      if (round % 2 ==1){
        f1.fighting(f2);
        
        if (f2.getBlood() <= 0){
          break;
        }
        round ++;
      } else {
        f2.fighting(f1);
        
        if (f1.getBlood() <= 0){
          break;
        }
        round ++;
      }
    }
  }
}
