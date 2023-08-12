package rao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

// @SuppressWarnings("all")
// @SuppressWarnings({"all"})
// @SuppressWarnings(value={"all"})
@SuppressWarnings({"unchecked", "rawtypes", "all"})
public class TestDemo03 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(100);
        c.add(50);
        c.add(200);
        c.add(30);
        c.add(200);
        c.add(80);
        Iterator it = c.iterator();
        while(it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}
