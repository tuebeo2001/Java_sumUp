package Lab3;

import java.util.Objects;

public class KhachHang {
    private String name;
    private String address;

    @Override
    public String toString() {
        return "CustomerName: " + name + " Address: " + address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public KhachHang(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KhachHang khachHang = (KhachHang) o;
        return Objects.equals(address, khachHang.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }
}