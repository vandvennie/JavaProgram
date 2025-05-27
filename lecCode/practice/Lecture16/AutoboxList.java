import java.util.*;

public class AutoboxList {
    public static void main(String[] args) {
        int sum =0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i= 0; i < list.size();i++){
             sum += list.get(i);
        }
        Integer bonus = 10;
        sum = bonus + sum;
        System.out.println(sum);
    }
}