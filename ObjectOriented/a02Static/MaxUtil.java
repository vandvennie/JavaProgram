import java.util.ArrayList;
public class MaxUtil {
  
  private MaxUtil(){}

  public static int maxAge(ArrayList<Student> arr){
    int max = arr.get(0).getAge();//获取student类中第0号对象中的age
    for (int i = 1; i < arr.size(); i++){
      int ageS = arr.get(i).getAge();
      if (max < ageS){
        max = ageS;
      }
    }
    return max;
  }
}
