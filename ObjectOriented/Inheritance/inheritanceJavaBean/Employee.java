public class Employee {
  public static void main(String[] args) {
    
  }

  class Employee {
    private int ID;
    private String name;
    private double wage;
    
    public Employee(){}

    public Employee(int ID, String name, double wage){
      this.ID = ID;
      this.name = name;
      this.wage = wage;
    }
    
    public void setID(int ID){
      this.ID = ID;
    }
    public int getID(){
      return ID;
    }

    public void setName(String name){
      this.name = name;
    }
    public int getName(){
      return name;
    }

    public void setWage(double wage){
      this.wage = wage;
    }
    public int getWage(){
      return wage;
    }

    public void work(){
      System.out.println("basic work");
    }
     public void eat(){
      System.out.println(name + " eats rice.");
     }
  }

}
