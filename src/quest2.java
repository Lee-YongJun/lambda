import java.util.Arrays;
import java.util.stream.Stream;

public class quest2 {
    public static void main(String[] args) {
        int[] num1 = {2, 5, 7};
        int[] num2 = new int[]{3, 8};

        int[] num = Stream.of(num1, num2).flatMapToInt(x -> Arrays.stream(x)).distinct().sorted().toArray();

        System.out.println((num.length) % 2 == 0 ? (num[num.length / 2 - 1] + "," + num[num.length / 2]) : num[num.length / 2]);
    }
}

