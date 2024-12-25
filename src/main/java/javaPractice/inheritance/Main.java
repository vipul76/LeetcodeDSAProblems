package javaPractice.inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            public String profession() {
                return "I am a person class";
            }
        };
        System.out.println(person.profession());

        Person student = new Student();
        System.out.println(student.profession());

        Person teacher = new Teacher();
        System.out.println(teacher.profession());

        Person engineer = new Engineer();
        System.out.println(engineer.profession());

        Engineer per = new Engineer() {
            @Override
            public String profession() {
                return "engineer overloaded";
            }
        };
        System.out.println(per.profession());
    }



}
