public class a03overide {
  public static void main(String[] args) {
    HsqDog hsq = new HsqDog();
    SpDog sp = new SpDog();
    CNDog cndog = new CNDog();
    hsq.name = "erha";
    hsq.Eat();
    sp.name = "chouchou";
    sp.Eat();
    cndog.name = "wangcai";
    cndog.Eat();
  }
}

class Dog{
  String name;
  public void Eat(){
    System.out.println(name + " eats dog food.");
  }
  public void Drink(){
    System.out.println(name + " drinks.");
  }



  public void TakeHome(){
    System.out.println(name + " takes care of home.");
  }
}

class HsqDog extends Dog{
  public void Destory(){
    System.out.println(name + " destrories house");
  }
}

class SpDog extends Dog{
  @Override
  public void Eat(){
    super.Eat();//父类基础上再增加
    System.out.println(name + " eats dog bone as well.");
  }
}

class CNDog extends Dog{
  @Override
  public void Eat(){//直接重写 没有复用
    System.out.println(name + " eats leftover.");
  }
}