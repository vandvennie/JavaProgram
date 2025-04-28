package ObjectOriented.a01Static;
public class Test {
  public static void main(String[] args){
    //测试工具类aStaticUtil中的两个方法是否正确
    int[] a = {1,2,3,4};
    String str = ArrUtil.printArr(a); //调用静态方法，不需要对象直接调用
    System.out.println(str);

    double [] b = {1.2, 3.5, 6.3};
    double dou = ArrUtil.getAverage(b);
    System.out.println(dou);
  }
  
}