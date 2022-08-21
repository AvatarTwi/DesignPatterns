package Template;

public class Test {
    public static void main(String[] args) {
        String exp = "4+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);

        exp = "8-2";
        cal = new Minus();
        result = cal.calculate(exp, "\\-");
        System.out.println(result);
    }

}
