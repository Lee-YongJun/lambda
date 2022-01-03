import java.util.stream.IntStream;

public class streamIntermediateOperation5 {
    public static void main(String[] args) {
        //위의 예제에서 첫 번째 요소인 7과 두 번째 요소인 5는 skip() 메소드에 의해 삭제되므로, 원본 스트림에서만 나타납니다.
        //
        //하지만 세 번째 요소인 5는 skip() 메소드와 limit() 메소드가 실행된 후에도 존재하므로, 모두 나타납니다.
        //
        //이렇게 peek() 메소드는 스트림의 각 요소가 해당 중개 연산 후에 어떻게 변화하는지를 보여줍니다.
        IntStream stream = IntStream.of(7,5,5,2,1,2,3,5,4,6);
        stream.peek(s -> System.out.println("원본 스트림 :" + s))
                .skip(2)
                .peek(s -> System.out.println("skip(2) 실행 후 "+s))
                .limit(5)
                .peek(s-> System.out.println("limit(5) 실행 후" + s))
                .sorted()
                .peek(s -> System.out.println("sorted() 실행 후" +s))
                .forEach(n -> System.out.println(n));
    }
}
