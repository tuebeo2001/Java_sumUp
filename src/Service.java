import java.util.Collections;
import java.util.List;

public class Service {
    void sortAndPrint(List<Person> a){
        Collections.sort(a, new SortByName());
        System.out.println(a);
    }
}
