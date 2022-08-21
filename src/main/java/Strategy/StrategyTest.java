package Strategy;

public class StrategyTest {
    public static void main(String[] args) {
        String exp = "8/2";
        ICalculator cal = new Divide();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
