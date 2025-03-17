public class Foldpaper {
  //1.height is to recorded the height of the paper
  //2.n is to record the number of folds 
  //3. The height of the paper starts at 0.1mm
  //4. calculate the times of folding until the height of the paper is 8844.43m
  public static void main(String[] args) {
    double height = 0.1;
    int n = 0;
    while (height < 8844430) {
      height = height * 2;
      n ++;
    } 
    System.out.println(n);
  }
}
