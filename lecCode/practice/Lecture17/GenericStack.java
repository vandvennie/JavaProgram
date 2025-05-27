
public class GenericStack<T> {
   T[] list;
   int i=0;
   public GenericStack(int cap){
        list = (T[]) new Object[cap];
   }
   void push(T item){
    list[i]=item;
    i++;
   }
   T pop(){
    return list[--i];
   }
   public static void main(String[] args) {
    GenericStack<String> stack = new GenericStack<String>(3);
    stack.push("wow");
    stack.push("yoho");
    stack.push("~");
    System.out.println(stack.pop());
   }
    
}