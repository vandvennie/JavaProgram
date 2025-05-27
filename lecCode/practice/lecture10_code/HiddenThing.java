public class HiddenThing extends Thing {
    public int x; // Hides super.x
    protected float y; // Hides super.y

    public void setSuperTo10() {
        super.x = 10;
        super.y = 10;
    }

    public void setTo100() {
        x = 100;
        y = 100;
    }

    public void print() {
        System.out.println(x);
        System.out.println(y);
    }
    
    public void printSuper() {
        System.out.println(super.x);
        System.out.println(super.y);
    }

    public static void main(String[] args) {
        HiddenThing t = new HiddenThing();
        t.setTo100();
        t.setSuperTo10();
        t.print();
        t.printSuper();
    }
}