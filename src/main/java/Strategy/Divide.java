package Strategy;

public class Divide extends AbstractCalculator implements ICalculator{

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"/");
        return arrayInt[0]/arrayInt[1];
    }
}
