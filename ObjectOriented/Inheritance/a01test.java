class Animal {
  String name;
  
  public void setName(String name) {
    this.name = name;
  }
  public void drink() {
    System.out.println(name +" is drinking.");
  }
}

class Cat extends Animal {
  public void Catch() {
    System.out.println(name +" is catching mouses.");
  }
  
}

class Bocat extends Cat {
  
}

class Lhcat extends Cat {
  
}


class Dog extends Animal {
  public void TakeCare() {
    System.out.println(name +" is taking care the house.");
  }

}


class HsqDog extends Dog {
  public void DestroyHouse() {
    System.out.println(name +" is destroying the house.");
  }
  
}

class TdDog extends Dog {
  public void Sex() {
    System.out.println(name +" wanna patrners.");
  }
  
}


public class a01test { //只能有一个public的类，因为public的类的类名 需要和文件名一致
  public static void main(String[] args) {
    Lhcat lihua = new Lhcat();//如果类中没有构造方法，虚拟机会自动给添加一个空参构造
    TdDog tidi = new TdDog();
    tidi.setName("awu");
    tidi.Sex();
  }
}
