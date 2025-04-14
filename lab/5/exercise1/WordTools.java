import java.sql.Array;
public class WordTools {
  
  public static boolean isWord(String string) {
    return string.matches("[a-zA-Z]+");
  }
  
  public static boolean isLowerCaseWord(String string){
    return string.matches("[a-z]+");
  }
  
  public static boolean isUpperCaseWord(String string){
    return string.matches("[A-Z]+");
  }
  
  public static boolean isSarcasmCaseWord(String string){
    if (!isWord(string)) { 
      return false;
    }
      for (int i=0; i< string.length()-1; i+=1){
        if (isLowerCaseWord(string.substring(i,i+1)) && isLowerCaseWord(string.substring(i+1,i+2)))
          return false;
        
        if (isUpperCaseWord(string.substring(i,i+1)) == isUpperCaseWord(string.substring(i+1,i+2)))
          return false;
        
      } 
      return true;
    }
  
  public static void main(String[] args) {
    System.out.println(isWord("Hello")); // true
    System.out.println(isWord("Hello!")); // false
    System.out.println(isWord("H ello")); // false
    System.out.println(isLowerCaseWord("hello")); // true
    System.out.println(isLowerCaseWord("hI")); // false
    System.out.println(isUpperCaseWord("TEST")); // true
    System.out.println(isUpperCaseWord("TEST ")); // false
    System.out.println(isUpperCaseWord("tEST")); // false
    System.out.println(isSarcasmCaseWord("tEsT")); // true
    System.out.println(isSarcasmCaseWord("TeSt")); // true
    System.out.println(isSarcasmCaseWord("test")); // false
    System.out.println(isSarcasmCaseWord("TeST")); // false
  }
}