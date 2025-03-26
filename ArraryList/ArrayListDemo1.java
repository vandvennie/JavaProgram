package ArraryList;

import java.util.ArrayList;

public class ArrayListDemo1 {
  public static void main(String[] args) {
     //创建集合的对象
     //泛型：限定集合中存储数据的类型
        //ArrayList list = new ArrayList();  // ❌ 这样写虽然不会报错，但不推荐！

    // 正确，但右边的String有些冗余。可以不写
     //ArrayList<String> list = new ArraryList<String>();//代表这个列表只能存 String 类型的数据，
     ArrayList<String> list = new ArrayList<>();  // 推荐的写法

    //增
    list.add("AAA");
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd ");

    //删除
    list.remove('AAA');//1.删除具体数据
    String del = list.remove(0);//2.按照索引删除。会返回被删除的元素
    System.out.println(del); //aaa

    //修改，返回旧值
    String mot = list.set(1, "CCC");
    System.out.println(mot); //ccc

    //查
    String s = list.get(1);
    System.out.println(mot);//CCC

    //遍历
    for (  i = 0; i < list.size(); i++) { //.size()获取集合长度
      String n = list.get(i);
      System.out.println(n);
    }
  }
}
