import java.util.stream.IntStream;

public class streamTerminalOperation2 {
    public static void main(String[] args) {
        //요소의 검사
        //1.anyMatch():해당 스트림의 일부요소가 특정조건을 만족할 경우 true반환
        //2.allMatch():해당 스트림의 모든요소가 특정조건을 만족할 경우 true반환
        //3.noneMatch():해당 스트림의 모든요소가 특정조건을 만족하지 않을때 true반환

        IntStream stream1 = IntStream.of(30, 90, 70, 10);

        IntStream stream2 = IntStream.of(30, 90, 70, 10);

        IntStream stream3 = IntStream.of(30, 90, 70, 10);


        System.out.println(stream1.anyMatch(n -> n > 80));

        System.out.println(stream2.allMatch(n -> n > 80));

        System.out.println(stream3.noneMatch(n -> n > 80));
    }
}
