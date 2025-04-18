abstract class Animal {
  private String name;
  private int age;
  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public Animal() {
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public abstract void eating();
  public void drink(){
    System.out.println(name +" is drinking water.");
    
  }
}

class Frog extends Animal {
  public Frog(){}
  public Frog (String name, int age){
    super(name, age);
  }
  @Override
  public void eating(){
    System.out.println("Frog likes eating bugs.");
  }

}

class Dog extends Animal {
  public Dog(){}
  public Dog (String name, int age){
    super(name, age);
  }
  @Override
  public void eating(){
    System.out.println("Dog likes eating bone.");
  }
}
class Sheep extends Animal {
  public Sheep(){}
  public Sheep (String name, int age){
    super(name, age);
  }
  @Override
  public void eating(){
    System.out.println("Sheep likes eating grasses.");
  }
}

public class AbstractTest {
  public static void main(String[] args) {
    Animal f = new Frog("gua",1);
    Animal d = new Dog("wang",3);
    Animal s = new Sheep("mian",2);
    f.eating();
    d.drink();
  }
}