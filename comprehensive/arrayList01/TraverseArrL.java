
import java.util.ArrayList;

public class TraverseArrL {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("element1");
    list.add("element2");
    list.add("element3");

    System.out.print("[");
    for (int i=0; i<list.size(); i++){
      if (i != list.size()-1){
      System.out.print(list.get(i)+", ");
      } else {
        System.out.println(list.get(i)+" ]");
      }
    }
  }
}
