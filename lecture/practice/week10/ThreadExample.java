class MyThread extends Thread{
  private int number;

  public MyThread(int number) {
    this.number = number;
  }
  @Override
  public void run(){
    System.out.println("MyThread (" + number +") running");
  }
}
public class ThreadExample {
  public static void main(String[] args) {
    for(int i = 0; i < 10; i++){
      MyThread t = new MyThread(i);
      t.start();
    }
  }
}
