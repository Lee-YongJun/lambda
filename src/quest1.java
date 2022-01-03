import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class quest1 {
    public static void main(String[] args) {
        int[] num1 = {2, 5, 7};
        int[] num2 = new int[]{3, 8};

        List<Integer> num = Stream.concat(Arrays.stream(num1).distinct().boxed(), Arrays.stream(num2).distinct().boxed()).sorted().collect(Collectors.toList());

        System.out.println(num.size() % 2 == 0 ? num.get(num.size() / 2 - 1) + "," + num.get(num.size() / 2) : num.get(num.size() / 2));

    }
}
