public class ParseExpression {

    public static String[] split(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        String[] parts = new String[count + 1];
        int start = 0;
        int end = 0;
        for (int i = 0; i < count; i++) {
            end = s.indexOf(c, start);
            parts[i] = s.substring(start, end);
            start = end + 1;
        }
        parts[count] = s.substring(start);
        return parts;
    }


    public static Expression parse(String s) {
        if (s.contains("+")) {
            String[] parts = split(s, '+');
            Add a = new Add(parse(parts[0]), parse(parts[1]));
            for (int i = 2; i < parts.length; i++)
                a = new Add(a, parse(parts[i]));
            return a;
        } else if (s.contains("*")) {
            String[] parts = split(s, '*');
            Multiply m = new Multiply(parse(parts[0]), parse(parts[1]));
            for (int i = 2; i < parts.length; i++)
                m = new Multiply(m, parse(parts[i]));
            return m;
        } else {
            return new Value(Integer.parseInt(s));
        }
    }

    public static void main(String[] args) {
        Expression expr = parse("2+2*2+1*4*2*1");
        expr.describe();
        System.out.println(" = " + expr.evaluate());
    }
}