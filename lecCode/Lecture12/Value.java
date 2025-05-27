class Value extends Expression {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    public void describe() {
        System.out.print(value);
    }

    public int evaluate() {
        return value;
    }
}