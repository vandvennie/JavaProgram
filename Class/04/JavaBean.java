//package Class.04;

public class JavaBean {
  private String userName;
  private String password;
  private String comPassword;
  private String email;
  private String gender;
  private int age;

  //shortcut: alt+insert or alt+fn+insert ，但没有找到
  //plug—in PTG: Build JavaBean
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

  public void setComPassword(String comPassword){
    this.comPassword = comPassword;
  }
  public String getComPassword(){
    return comPassword;
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

//build non-argument constructor
  public JavaBean(){}

//bulid parameterized constructor
  public JavaBean(String userName, String password, String email, String gender, int age){
    this.userName = userName;
    this.password = password;
    this.email = email;
    this.gender = gender;
    this.age = age;
  }
  
}
