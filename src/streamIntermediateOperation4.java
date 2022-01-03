import java.util.Comparator;
import java.util.stream.Stream;

public class streamIntermediateOperation4 {
    public static void main(String[] args) {
        //스트림정렬
        //sorted()메소드는 해당 스트림을 주어진 비교자를 이용하여 정렬
        //비교자 이용하지 않을시에는 사전 편찬순 정렬
        Stream<String> stream1 = Stream.of("JAVA","HTML","JAVASCRIPT","CSS");
        Stream<String> stream2 = Stream.of("JAVA","HTML","JAVASCRIPT","CSS");

        stream1.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();

        stream2.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
    }
}
