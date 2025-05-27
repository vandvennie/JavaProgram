abstract class Bird {
}

class Emu extends Bird{}
class Hawk extends Bird{}

class BirdPair<T extends Bird>{
    T e;
    T h;

    public BirdPair(T e, T h){
        this.e = e;
        this.h = h;
    }



}
public class BoundedType {
    public static void main(String[] args) {
        var epair = new BirdPair<Emu>(new Emu(), new Emu());
    }

}