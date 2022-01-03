import java.util.OptionalInt;
import java.util.stream.IntStream;

public class streamTerminalOperation1 {
    public static void main(String[] args) {

        //findFirst()와 findAny() 메소드는 해당 스트림에서 첫 번째 요소를 참조하는 Optional 객체를 반환합니다.
        //두 메소드 모두 비어 있는 스트림에서는 비어있는 Optional 객체를 반환합니다.
        //findAny는 stream에서 가장 먼저 탐색되는 요소를 리턴
        //findFirst는 조건에 일치하는 요소들중에 stream에서 순서가 가장 앞에있는 요소 리턴.

        IntStream stream1 = IntStream.of(4, 2, 7, 3, 5, 1, 6);

        IntStream stream2 = IntStream.of(4, 2, 7, 3, 5, 1, 6);



        OptionalInt result1 = stream1.sorted().findFirst();

        System.out.println(result1.getAsInt());



        OptionalInt result2 = stream2.sorted().findAny();

        System.out.println(result2.getAsInt());
    }
}
