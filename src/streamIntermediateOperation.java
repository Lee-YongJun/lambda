import java.util.stream.IntStream;

public class streamIntermediateOperation {
    public static void main(String[] args) {
        //1.스트림 필터링: filter(),distinct()
        //2.스트림 변환: map(),flatMap()
        //3.스트림 제한: limit(),skip()
        //4.스트림 정렬: sorted()
        //5.스트림 연산결과 확인:peek()

        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);


        // 스트림에서 중복된 요소를 제거함.

        stream1.distinct().forEach(e -> System.out.print(e + " "));

        System.out.println();


        // 스트림에서 홀수만을 골라냄.

        stream2.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));
    }
}
