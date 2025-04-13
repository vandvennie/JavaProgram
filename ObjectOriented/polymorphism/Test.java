
public class Test {
  public static void main(String[] args) {
    // creat object (by polymorphism)
    Animal dog = new Dog(2, "black");
    Animal cat = new Cat(3, "gray");
    Person breeder = new Person();//括号中有没有内容取决于 有参构造 还是无参
    Person visitor = new Person("Coco",25);

    breeder.keepPet(dog, "bone" );
    visitor.keepPet(cat, "dry fish" );

  }
  
}

class Animal {
  private int age;
  private String color;

  public Animal() {
  }
  public Animal(int age, String color) {
    this.age = age;
    this.color = color;
  }
  public void eat(String someting){
    System.out.println("Animal likes eating "+ someting); 
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
}

class Dog extends Animal{
  
  public Dog(int age, String color) {
    super(age, color); // ✅ 调用父类构造方法，初始化 color 和 age
  }
  public void takeCare(){
    System.out.println("Dog is looking after our house.");
  }
  @Override
  public void eat(String someting){
    
    System.out.println(getAge() +"-year-old " + getColor() + " dog liks eating "+ someting); 
  }
}

class Cat extends Animal{
  public Cat(int age, String color) {
    super(age, color); // ✅ 调用父类构造方法，初始化 color 和 age
  }
  
  public void catchMouse(){
    System.out.println("Cat is catching mouses.");
  }
  @Override
  public void eat(String someting){
    System.out.println(getAge() +"-year-old " + getColor() + " cat prefer "+ someting); //这里用到了animal中的getter
  }
}

class Person {
  private String name;
  private int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public Person() {
    this.name = "Veronica";
    this.age = 21;
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
  // public void keepPet( Dog dog, String something){
  //   System.out.println(age +"-year-old " + name + " has a " + dog.getAge() +"-year-old " + dog.getColor() + " dog.");//用dog对象调用Animal父类中的getter方法
  //   dog.eat(something);
  // }
  // public void keepPet( Cat cat, String something){
  //   System.out.println(age +"-year-old " + name + " has a " + cat.getAge() +"-year-old " + cat.getColor() + " cat.");
  //   cat.eat(something);
  // }

  // 新方法，为了不在每次增加动物的时候 都增加一个方法  这里从新写一个方法
  public void keepPet( Animal a, String something){
    //在这里强制转换类型 这样对于调用方就会很简单
    if(a instanceof Dog d) {
      System.out.println(age +"-year-old " + name + " has a " + d.getAge() +"-year-old " + d.getColor() + " animal.");
      d.eat(something);
      d.takeCare();
    }else if (a instanceof Cat c) {
      System.out.println(age +"-year-old " + name + " has a " + c.getAge() +"-year-old " + c.getColor() + " animal.");
      c.eat(something);
      //c.catchMouse();
      ;//可以选择不要用 子类中的方法 只做强转
    } else {
      System.out.println("Do not have this animal.");
    }
  }
}