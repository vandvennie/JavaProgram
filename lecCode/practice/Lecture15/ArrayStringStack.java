public class ArrayStringStack implements StringStack {
    String [] list;
    int i=0;
    ArrayStringStack (int num){
        list = new String[num];
    }

    @Override
    public String pop(){
        return list[--i];
    }
    
    @Override
    public void push(String s){
        list[i++]= s;
    }
    @Override
    public boolean isEmpty(){
        for(int i =0; i< list.length;i++){
            if (!list[i].equals("")){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayStringStack ss = new ArrayStringStack(3);
        ss.push("Hello");
        ss.push("World");
        ss.push("!");
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.isEmpty());
        System.out.println(ss.pop());
        System.out.println(ss.isEmpty());
    }
}