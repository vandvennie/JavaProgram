import java.util.ArrayList;

public class ListUtilDemo {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    ListUtil.addAll(list, "what", "fuck");
    System.out.println(list);
  }
  
}
