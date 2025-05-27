class Chair implements HasLegs{
    @Override
    public int countLegs(){
        return 4;
    }
}

class Person implements HasLegs{
    @Override
    public int countLegs(){
        return 2;
    }
}

class Spider implements HasLegs{
    @Override
    public int countLegs(){
        return 8;
    }
}


public class CountLegs {

    public static void main(String[] args) {
        HasLegs[] iterms = new HasLegs[4];
        //Haslegs[] iterms = new Haslegs{
        //     new Person(),
        //     new Chair(),
        //     new Spider()
        // };
        //HasLegs[] iterms = { new Person(),new Chair(),new Spider()}
        iterms[0] = new Person();
        iterms[1] = new Chair();
        iterms[2] = new Spider();
        iterms[3] = new Table();
        int sum=0;
        for (int i =0; i<iterms.length; i++){
            sum += iterms[i].countLegs();
        }
        System.out.println(sum);
    }
}