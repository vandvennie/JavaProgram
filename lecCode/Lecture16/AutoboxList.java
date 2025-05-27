import java.util.*;

public class AutoboxList {
    public static void main(String[] args) {
        // Note ArrayList implements List
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        Integer four = 4;
        sum += four;
        System.out.println(sum);
    }
}