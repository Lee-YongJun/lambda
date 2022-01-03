import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class streamTerminalOperation4 {
    public static void main(String[] args) {
        //요소의 연산
        //1.sum()합
        //2.average()평균

        IntStream stream1 = IntStream.of(30, 90, 70, 10);

        DoubleStream stream2 = DoubleStream.of(30.3, 90.9, 70.7, 10.1);

        System.out.println(stream1.sum());

        System.out.println(stream2.average().getAsDouble());
    }
}
