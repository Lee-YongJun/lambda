import java.util.stream.Stream;

public class lambdaStream {
    public static void main(String[] args) {
        //Stream 클래스에는 iterate()와 generate()메소드가 정의되어있다.
        //IntStream stream = Stream.iterate(2,n -> n+2); //2,4,6,8,10.... 무한 스트림 발생
        // 빈 스트림 생성

        Stream<Object> stream = Stream.empty();

        System.out.println(stream.count()); // 스트림의 요소의 총 개수를 출력함.

    }
}
