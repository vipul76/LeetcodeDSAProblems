package codeDecode;

import java.util.Objects;

public class Employee {
    private long id;
    private String name;
    private int age;
    private String gender;
    private long salary;

    public Employee() {
    }

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, int age, String gender, long sal){
        this.id = id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=sal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(obj==this) return true;
        if(obj == null || getClass() !=obj.getClass()) return false;

        Employee other = (Employee) obj;
        return (this.getId()==other.getId()  && Objects.equals(this.getName(), other.getName()));
    }

    @Override
    public int hashCode(){
        return Objects.hash(getId(),getName());
        //return (int) getId();
    }
}
