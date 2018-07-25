package designpattern.factory.copy;

public class AddOperator implements Operator<Integer> {

    @Override
    public Integer getResult(Integer... args) {
        int result = 0;
        for (int arg : args) {
            result += arg;
        }
        return result;
    }
}