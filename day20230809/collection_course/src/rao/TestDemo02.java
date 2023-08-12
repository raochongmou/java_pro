package rao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

@SuppressWarnings({"all"})
public class TestDemo02 {
    public static void main(String[] args) {
        // ArrayList有序数组集合（可重复）
        Collection c = new ArrayList();
        c.add("abc");
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        c.add(sdf.format(date));
        c.add(123);
        c.add(false);
        Iterator iterator = c.iterator();
        while(iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }
        Collection c2 = new ArrayList();
        c2.add(1);
        c2.add(2);
        c2.add(3);
        c2.add(1);
        c2.add("s");
        c2.add(new Date());
        Iterator it = c2.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            if(obj instanceof Integer) {
                System.out.println(obj + "---integer");
            } else if(obj instanceof Date) {
                System.out.println(obj + "---date");
            } else if(obj instanceof String) {
                System.out.println(obj + "---string");
            }
        }
    }
}
