package designpattern.factory.copy;

import org.junit.Test;

public class Client {

    @Test
    public void testAdd() {
        Operator<Integer> operator = OperatorFactory.createOperator('+');
        System.out.println(operator.getResult(1, 2, 3, 4, 6));
    }

    @Test
    public void testMultiplication() {
        Operator<Integer> operator = OperatorFactory.createOperator('*');
        System.out.println(operator.getResult(1, 2, 3, 4, 6));
    }

    @Test
    public void testAddName(){
        Operator<Integer> operator = OperatorFactory.createAddOper();
        System.out.println(operator.getResult(1, 2, 3, 4, 6));
    }

    @Test
    public void testMultiplicationName() {
        Operator<Integer> operator = OperatorFactory.createMultiOper();
        System.out.println(operator.getResult(1, 2, 3, 4, 6));
    }
}
