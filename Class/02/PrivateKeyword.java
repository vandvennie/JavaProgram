public class PrivateKeyword {
    //私有化的成员变量，目的是为了保护数据，不让外部直接访问
    //私有化的成员变量，只能在本类中访问 
    private String name;//成员变量
    private int age;
    private String gender;

    //set方法和get方法
    //有参无返 set方法 给成员变量赋值
    public void setName(String name) {//name是局部变量 
        this.name = name; //this.name是成员变量，name是局部变量
    }  
    //无参有返 get方法 对外提供 成员变量的值
    public String getName() { //name是string类型的，所以返回值也是string类型 
        return name;
    }

    //set age
    public void setAge(int a) {
        if(a >= 18 && a<= 50) {
            age = a; 
        } else {
            System.out.println("Invalid age");
        } 
    }
    //get age
    public int getAge() {
        return age;
    } 

    //set gender
    public void setGender(String gender)
    {
        this.gender = gender;
    }   
 
    //get gender
    public String getGender() {
        return  gender;
    }
     
    //行为
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}