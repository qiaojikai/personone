package designpattern.iterator.copy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ConcreteAggregate implements Iterable<String> {

    private List<String> list;

    public ConcreteAggregate() {
        this.list = new ArrayList<String>();
    }

    public void add(String item) {
        list.add(item);
    }

    public String get(int index) {
        return list.get(index);
    }

    @Override
    public Iterator<String> iterator() {
        return new ConcreteIterator();
    }

    /**
     * 具体迭代器实现类
     */
    private class ConcreteIterator implements Iterator<String> {

        // 游标
        int cursor = 0;
        // 比游标慢一个元素
        int lastRet = -1;

        @Override
        public boolean hasNext() {
            return cursor != list.size();
        }

        @Override
        public String next() {
            if (cursor >= list.size())
                throw new NoSuchElementException();
            ++cursor;
            return list.get((lastRet = cursor - 1));
        }

        @Override
        public void remove() {
            list.remove(lastRet);
            cursor = lastRet;
            lastRet = -1;
        }
        
    }
}