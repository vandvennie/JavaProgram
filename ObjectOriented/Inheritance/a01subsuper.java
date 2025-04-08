
public class a01subsuper {
  public static void main(String[] args) {
    sub sub = new sub();
    sub.show();
  }
}

class sup {
  String name = "Veronica";
  String hobby = "Drink tea";
}

class sub extends sup {
  String name = "Coco";
  String game = "chick";
  public void show(){
    System.out.println(name);
    System.out.println(super.name);
    System.out.println(game);
    System.out.println(hobby);
  }

}