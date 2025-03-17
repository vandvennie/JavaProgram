public class Tallest {
  public static void main(String[] args) {
    int height1 = 180;
    int height2 = 185;
    int height3 = 190;
    int max = height1 > height2 ? height1 : height2;
    max = max > height3 ? max : height3;
    System.out.println("The tallest person is " + max + " cm tall.");
  }
}
