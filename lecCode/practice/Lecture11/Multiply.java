class Multiply extends Expression {
    private Expression left;
    private Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public void describe() {
        System.out.print("(");
        left.describe();
        System.out.print(" * ");
        right.describe();
        System.out.print(")");
    }

    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}