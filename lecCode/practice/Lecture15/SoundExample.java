// Insect类实现接口
// Cricket继承Insect类并实现MakeSounds接口
// SqueakyChair 实现Haslegs 和 MakeSounds接口
// main中创建makesound数组对象Cricket 和SqueakyChair 打印不同的sound
    // 和 hasLegs 数字对象，打印countleg

class Insect implements HasLegs{
    @Override
    public int countLegs(){
        return 6;
    }
}

class Cricket extends Insect implements MakesSounds{
    @Override
    public String sound(){
        return "wow";
    }
}

class SqueakyChair implements HasLegs, MakesSounds{
    @Override
    public int countLegs(){
        return 4;
    }
    @Override
    public String sound(){
        return "ahhh";
    }
}

public class SoundExample {

    public static void main(String[] args) {
        MakesSounds[] sounds = {new Cricket(), new SqueakyChair()};
        for (MakesSounds item : sounds){
            System.out.println(item.sound());
        }
        HasLegs[] legs = {new Cricket(), new SqueakyChair()};
        for (HasLegs item : legs){
            System.out.println(item.countLegs());
        }
    }
}