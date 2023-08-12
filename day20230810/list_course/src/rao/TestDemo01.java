package rao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("all")
public class TestDemo01 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add(1, 8);
        l.set(1, "F");
        l.remove(0);
        Object o1 = l.get(1);
        System.out.println(o1);
        Iterator iterator = l.iterator();
        while(iterator.hasNext()) {
            Object o2 = iterator.next();
            // java.util.ConcurrentModificationException
            // 删除之后 必须重新获取iterator对象
            // l.remove(0);
            // 或者使用iterator对象进行删除
            // 这样表示删除当前指针对象
            iterator.remove();
            System.out.println(o2);
        }
    }
}
