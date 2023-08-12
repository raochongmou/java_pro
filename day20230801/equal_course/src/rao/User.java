package rao;

import java.util.Objects;

public class User {
    String name;
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof User)) return false;
        User user = (User) o;
        return this.name.equals(user.name) && this.addr.equals(user.addr);
    }
}
