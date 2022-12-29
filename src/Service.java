import java.util.Collections;
import java.util.List;

public class Service {
    static int ar;
    int a;
    void sortAndPrint(List<Person> a){
        Collections.sort(a, new SortByName());

        System.out.println(a);
    }
}
