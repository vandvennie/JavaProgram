package finalPractice.salary;

public class Employee {
  private String name;
  private int id;
  public Employee(String name, int id) {
    this.name = name;
    this.id = id;
  }
  public double calculatePay(){
    return 0;
  }
  public String getInfo(){
    return "ID: " +id+"Name: "+name;
  }
}
