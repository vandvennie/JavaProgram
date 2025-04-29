import java.util.Scanner;
public class ProductArr {
  public static void main(String[] args) {
    
    Product[] proArr = new Product[4];

    Product p1 = new Product(001, "iphone", 300.0, 50);
    Product p2 = new Product(002, "iphone5", 350.0, 60);
    Product p3 = new Product(003, "iphone6", 400.0, 20);
    Product p4 = new Product(004, "iphone7", 450.0, 10);


    proArr[0] = p1;
    proArr[1] = p2;
    proArr[2] = p3;
    proArr[3] = p4;


    Scanner sc = new Scanner(System.in);
    System.out.println("Input the product ID:");
    p1.setId(sc.nextInt());
    sc.nextLine(); // 吃掉nextInt之后的换行符（防止后面nextLine读不到）
    System.out.println("Input the product name:");
    p1.setName(sc.nextLine());
    
    System.out.println(proArr[0].getName());

    // 计算平均价格
  
    double ave = Product.ave(proArr);
    System.out.println("The average price is "+ ave);
      

    // 低于均价的商品
    for(Product pro : proArr){
      if (pro.getPrice()< ave){
        System.out.println( pro.getName()+" price is lower than average price.");
      }
    }

  }
}
