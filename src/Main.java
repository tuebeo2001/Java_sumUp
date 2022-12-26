import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 10, 100, 1, 2, 3, 4, 2, 10, 100, 101, 102};
        Bai1.checkArray(a);

        Date date1 = new Date(System.currentTimeMillis());
        Date date2 = new Date(System.currentTimeMillis()-6);
        Date date3 = new Date(System.currentTimeMillis()-9);
        Person person1 = new Person("aue1", "vne", date1);
        Person person2 = new Person("tue2", "vne", date2);
        Person person3 = new Person("uue3", "vne", date3);
        Person person4 = new Person("fue4", "vne", date1);
        Person person5 = new Person("fue4", "vne", date3);
        List<Person> list = new ArrayList<>(Arrays.asList(person1, person3, person4, person2, person5));

        Service service = new Service();
        service.sortAndPrint(list);

        List<Person> tue = list.stream().filter(person -> "fue4".equals(person.getName())).collect(Collectors.toList());

        System.out.println(tue);
    }
}