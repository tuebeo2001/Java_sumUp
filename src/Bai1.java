import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    static void checkArray(int[] a){
        int sum = 0;
        int count = 0;
        int maxSize = 1;
        int maxSizeCount = 1;

        List<Integer> firstIndex = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {

            if (i +1 == a.length-1) break;
            if (a[i] < a[i + 1]) {

                if(maxSize == 1){
                    sum = a[i] + a[i+1];
                }else sum += a[i+1];
                maxSize ++;
                if(sum >= 100 && a[i+1] > a[i+2]){
                    if(maxSize == maxSizeCount){
                        count++;
                        firstIndex.add(i - (maxSize-2));
                    }
                    if(maxSize > maxSizeCount){
                        count =0;
                        firstIndex = new ArrayList<>();
                        maxSizeCount = maxSize;
                        count++;
                        firstIndex.add(i - (maxSize-2));

                    }
                }


            }else {
                maxSize = 1;
                sum = 0;
            }
        }

        System.out.println(count);
        System.out.println(maxSizeCount);
        for (int i = 0; i < firstIndex.size(); i++) {
            System.out.println(firstIndex.get(i));
        }
    }
}
