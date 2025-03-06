public  class ArrayDemo {

  public static void main(String[] args) {
    int[] a = {1,2,3,4};
    for (int i = 0; i < a.length; i++) {//a.fori 快速生成for循环
      a[i] = i * 2;
      System.out.println(a[i]);
    }
  }
}