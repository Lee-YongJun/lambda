import java.util.ArrayList;
import java.util.Collections;

public class quest3 {
    public static void main(String[] args) {

        int[] num1 = {2, 5, 6};
        int[] num2 = new int[]{3, 8};

        ArrayList<Integer> num = new ArrayList<>();

        for (int i : num1) if (!num.contains(i)) num.add(i);
        for (int i : num2) if (!num.contains(i)) num.add(i);

        Collections.sort(num);

        System.out.println(num.size() % 2 == 0 ? ((double) num.get(num.size() / 2 - 1) + num.get(num.size() / 2)) / 2 : num.get(num.size() / 2));
    }
}


