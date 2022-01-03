import java.util.OptionalInt;
import java.util.stream.IntStream;

public class streamSample13 {
    public static void main(String[] args) {
        int sum1 = 0;
        OptionalInt sum2 ;//null임

        sum1 = IntStream.rangeClosed(7,10)
                .reduce(6,Integer::sum);
        System.out.println(sum1);

        sum2 = IntStream.rangeClosed(6,10)
                .reduce(Integer::sum);
        System.out.println(sum2.getAsInt());
        
        OptionalInt sum3 = OptionalInt.empty();
        if(sum3.isEmpty()){
            System.out.println("sum3은 값이 비었어요");
        }
        sum3 = OptionalInt.of(6);
        System.out.println(sum3);//안됨
        System.out.println(sum3.getAsInt());
    }
}
