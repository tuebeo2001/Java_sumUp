package Lab5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Ha noi", "Long bien");

        Student student = new Student("tue", 22, address);
        System.out.println(student.getName() + "" + (student.getAge() +1));

        Map<Student, Integer> hashMap = new HashMap<>();
//        student.setAge(19);
//        System.out.println(student);
    }
}
