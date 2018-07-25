package designpattern.factory;

public class MultiOperator implements Operator<Integer> {

    @Override
    public Integer getResult(Integer... args) {
        int result = 1;
        for (int arg : args) {
            result *= arg;
        }

        return result;
    }
}
