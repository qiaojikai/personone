package designpattern.iterator;

import java.util.Iterator;

import org.junit.Test;
//迭代器模式: 提供一种方法顺序访问聚合对象(如List、Set)内的每个元素, 而又不暴露聚合对象的内部实现. 
public class Client {

    @Test
    public void client(){
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("aa");
        aggregate.add("bb");
        aggregate.add("remove");
        aggregate.add("cc");
        aggregate.add("dd");
        aggregate.add("remove");
        aggregate.add("ee");

        Iterator<String> iter = aggregate.iterator();
        while (iter.hasNext()){
            String item = iter.next();
            System.out.println(item);

            if (item.equals("remove")){
                iter.remove();
            }
        }

        System.out.println("********----------********");
        for (String item : aggregate){
            System.out.println(item);
        }
    }
}
