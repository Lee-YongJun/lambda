import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSample2 {
    public static void main(String[] args) {
        //1.배열
        String [] strArr = {"테스트","타노스","용준"};
        int [] intArr = {3,6,9};
        double[] douArr = {3.1,4.2,5.3};
        //2.스트림 생성
        Stream<String> strStm = Arrays.stream(strArr);
        IntStream intStm = Arrays.stream(intArr);
        DoubleStream douStm = Arrays.stream(douArr);


        //3.출력
        strStm.forEach(System.out::println);
        intStm.forEach(System.out::println);
        douStm.forEach(System.out::println);
    }
}
