//package Class.04;

public class JavaBean {
  //属性声明（字段）
  private String userName;
  private String password;
  private String email;
  private String gender;
  private int age;

  //shortcut: alt+insert or alt+fn+insert ，但没有找到
  //Getter 和 Setter 方法
  public void setUserName(String userName){
    this.userName = userName;
  }
  public String getUserName(){
    return userName;
  }

  public void setPassword(String password){
    this.password = password;
  }
  public String getPassword(){
    return password;
  }

  public void setEmail(String email){
    this.email = email;
  }
  public String getEmail(){
    return email;
  }

  public void setGender(String gender){
    this.gender = gender;
  }
  public String getGender(){
    return gender;
  }

  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return age;
  }

//build non-argument constructor 无参构造器（必须有！）
//不传参，方便创建一个空对象后慢慢 setXXX()。
  public JavaBean(){}

//bulid parameterized constructor 带参数构造器
  public JavaBean(String userName, String password, String email, String gender, int age){
    this.userName = userName;
    this.password = password;
    this.email = email;
    this.gender = gender;
    this.age = age;
  }
  
}
