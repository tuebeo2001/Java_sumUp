import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static int rrr;
    public static void main(String[] args) {
        Map<Person, String> personMap = new HashMap<>();
        int[] a = {1, 2, 3, 10, 100, 1, 2, 3, 4, 2, 10, 100, 101, 102};

//        Bai1.checkArray(a);

        Date date1 = new Date(System.currentTimeMillis());
        Date date2 = new Date(System.currentTimeMillis()-6);
        Date date3 = new Date(System.currentTimeMillis()-9);
        Person person3 = new Person("uue3", "vne", date3);
        Person person4 = new Person("uue3", "vne", date1);
        Person person1 = new Person("aue1", "vne", date1);
        Person person2 = new Person("tue2", "vne", date2);
        Person person5 = new Person("fue4", "vne", date3);
        List<Person> list = new ArrayList<>(Arrays.asList(person1, person3, person4, person2, person5));


        personMap.put(person1, "person 1");
        personMap.put(person2, "person 2");
        personMap.put(person3, "person 3");
        personMap.put(person4, "person 3");

        Service service = new Service();
        //2.1
//        service.sortAndPrint(list);
        List<Person> listSort = list.stream().sorted(new SortByName()).collect(Collectors.toList());
        List<Person> listSort2 = list.stream().sorted((Comparator.comparing(Person::getName))).collect(Collectors.toList());
        System.out.println(listSort);

        List<String> listSort3 = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("listSort3");
        System.out.println(listSort3);

        Stream<Person> personStream = personMap.keySet().parallelStream();
        List<Person> stringName = personStream.distinct().collect(Collectors.toList());
        stringName.forEach(System.out::println);

        //2.3
        List<Person> sortByName = list.stream().filter(person -> "fue4".equals(person.getName())).collect(Collectors.toList());
        //2.4
        List<Person> sortByDOB = list.stream().filter(person -> date1.equals(person.getDateOfBirth())).collect(Collectors.toList());
//        System.out.println(sortByName);
//        System.out.println(sortByDOB);



        
    }
}