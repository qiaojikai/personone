package designpattern.factory.copy;

public class OperatorFactory {

    public static Operator<Integer> createOperator(char operName) {
        Operator<Integer> operator;
        switch (operName) {
            case '+':
                operator = new AddOperator();
                break;
            case '*':
                operator = new MultiOperator();
                break;
            default:
                throw new RuntimeException("Wrong Operator Name: " + operName);
        }
        return operator;
    }

    /* ** 第二种实现策略 ** */
    public static Operator<Integer> createAddOper() {
        return new AddOperator();
    }

    public static Operator<Integer> createMultiOper() {
        return new MultiOperator();
    }
}
