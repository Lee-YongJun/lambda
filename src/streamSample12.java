import java.util.stream.IntStream;

public class streamSample12 {
    public static void main(String[] args) {
        //1부터 100까지의 합
        int sum1 = IntStream.rangeClosed(1,100).reduce(0, (x,y)->x+y);

        int sum2 = IntStream.rangeClosed(1,100).reduce(0, (x,y)->{return x+y;});

        int sum3 = IntStream.rangeClosed(1,100).reduce(0, (x,y)->{return Integer.sum(x,y);});

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
