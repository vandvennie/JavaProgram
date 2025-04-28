package ObjectOriented.a01Static;
public class ArrUtil {
  //私有化构造方法
  private ArrUtil(){}

  public static String printArr(int[] arr){
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < arr.length; i++){
      if (i == arr.length-1 ){
        sb.append(arr[i]);
      } else {
        sb.append(arr[i]).append(",");
      }
      
    }
    sb.append("]");
    return sb.toString();//转换为string
  }

  public static double getAverage (double[] arr){
    double count =0;
    for(double i : arr){
      count = i + count;
    }
    return count/arr.length;
  }
  
 
  
}
