
public class test {
  public static void main(String[] args) {
    Manager m = new Manager(001, "Veronica", 15000.0, 10000.0)
    System.out.println(m.id+','+m.name);
    m.work();
    m.eat();
  }
}
