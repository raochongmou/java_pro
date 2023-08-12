package rao;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"all"})
public class TestDemo01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("123");
        c.add(new Student());
        c.add(123);
        c.add(false);
        c.add(1.2);
        System.out.println(c.size());
        c.clear();
        System.out.println(c.size());
        c.add(1);
        c.add(2);
        System.out.println(c.contains(1));
        c.remove(2);
        System.out.println(c.size());
    }
}
