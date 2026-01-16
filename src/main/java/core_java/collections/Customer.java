package core_java.collections;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@Data
@Getter
@Setter
public class Customer {
    private int id;
    private String name;
    private String addr;

    //Default Constructor
    public Customer() {
    }
    //Paramaterized Constructor
    public Customer(int id, String name, String addr) {
        this.id=id;
        this.name=name;
        this.addr=addr;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
