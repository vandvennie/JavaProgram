import java.util.Random;
public class Figure {
  private String name;
  private int blood;
  private String gender;
  private String face;
  
  private static final String[] BOY_FACES = {"Normal", "Ugly"};
  private static final String[] GIRL_FACES  = {"Pretty", "Beautiful"};

  private static final String[] SKILLS = {"left hand","right hand","truth"};
  
  Random r = new Random();

  public Figure(String name, int blood, String gender) {
    this.name = name;
    this.blood = blood;
    this.gender = gender;
    setFace(gender);
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
    if (blood < 0) {
      this.blood = 0;
    } else {
    this.blood = blood;}
  }
  
  // 这里是方法的调用者this去攻击参数defender
  void fighting(Figure defender){
    //生成一个random对象
   
    //将对象根据方法.nextInt()生成的数字赋值给int lossBlood
    int lossBlood = r.nextInt(20) + 1;// 随机掉血1～20
    int skillIndex = r.nextInt(SKILLS.length);

    defender.setBlood(defender.getBlood() - lossBlood);
    System.out.printf( "%s %s hits %s %s with %s, %s now has blood volume ", 
          this.face, this.name, defender.face, defender.name, SKILLS[skillIndex], defender.name);
    
    if (defender.getBlood() == 0) {
      System.out.println(defender.getBlood());
      System.out.println(this.name + " K.O. " + defender.name);
    } else {
      System.out.println(defender.getBlood());
    }
    
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public String getFace() {
    return face;
  }
  public void setFace(String gender) {
    if (gender.equals("female")){
      int faceIndex  = r.nextInt(GIRL_FACES.length);
      this.face = GIRL_FACES[faceIndex];
    } else {
      int faceIndex  = r.nextInt(BOY_FACES.length);
      this.face = BOY_FACES[faceIndex];
    }
  }
  
}
