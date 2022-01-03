import java.util.stream.IntStream;

public class streamTerminalOperation3 {
    public static void main(String[] args) {

        //요소의 통계
        //1.count()개수
        //2.max()최대
        //3.min()최소

        IntStream stream1 = IntStream.of(30, 90, 70, 10);

        IntStream stream2 = IntStream.of(30, 90, 70, 10);

        System.out.println(stream1.count());

        System.out.println(stream2.max().getAsInt());

    }
}
