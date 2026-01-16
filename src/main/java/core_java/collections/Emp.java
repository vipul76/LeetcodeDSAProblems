package core_java.collections;

import java.util.Objects;

public class Emp {
    private Integer id;
    private String name;
    private String addr;

    public Emp(int id, String name, String addr) {
        this.id=id;
        this.name=name;
        this.addr=addr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Emp emp = (Emp) obj;
        return Objects.equals(id, emp.id) &&
                Objects.equals(name,emp.name) &&
                Objects.equals(addr,emp.addr);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id,name,addr);
    }
}
