import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class quest5 {
    public static void main(String[] args) {

        int[] num1 = {2, 5, 7};
        int[] num2 = new int[]{3, 8};
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> num = new ArrayList<>(set);

        for (int i : num1) if (!num.contains(i)) num.add(i);
        for (int i : num2) if (!num.contains(i)) num.add(i);

        Collections.sort(num);

        System.out.println(num.size() % 2 == 0 ? (num.get(num.size() / 2 - 1) + num.get(num.size() / 2)) / 2 : num.get(num.size() / 2));


    }
}
