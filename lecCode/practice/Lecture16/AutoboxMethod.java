public class AutoboxMethod {
    public static int sum (int a, Integer b){
        int sum = a +b;
        return sum;
    }
    public static Double max(Double X, double y){
        return X > y?X:y;
    }

    public static String large(String s1, String s2){
         if (s1.compareTo(s2)>0){
            return s1;
         }
         return s2;
    }
    public static void main(String[] args) {
        //应该输出 10
        System.out.println(sum(3, new Integer(7)));
        //应该输出 5.5
        System.out.println(max(5.5, 3.2));
        //应该输出 "zebra"
        System.out.println(large("zebra", "apple"));
    }
}