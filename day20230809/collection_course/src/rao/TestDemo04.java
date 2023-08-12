package rao;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("all")
public class TestDemo04 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Collection c = new ArrayList();
        User u1 = new User("jack");
        User u2 = new User("jack");
        c.add(u1);
        System.out.println(c.contains(u2));
    }
}

@SuppressWarnings("all")
class User {
    String name;
    public User() {}
    public User(String name) {
        this.name = name;
    }
    public boolean equals(Object o) {
        if(null == o || !(o instanceof User)) return false;
        User u = (User)o;
        return this.name.equals(u.name);
    }
}
