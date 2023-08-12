package rao;

import java.util.Objects;

public class Address {
    String addr;
    String zipCode;
    String street;
    public Address() {
    }

    public Address(String addr, String zipCode, String street) {
        this.addr = addr;
        this.zipCode = zipCode;
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Address)) return false;
        Address address = (Address) o;
        return this.addr.equals(address.addr) && this.zipCode.equals(address.zipCode) && this.street.equals(address.street);
    }
}
