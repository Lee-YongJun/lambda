import java.util.Random;
import java.util.stream.IntStream;

public class RandomStream {
    public static void main(String[] args) {
        //특정 타입의 난수로 이루어진 스트림 생성
        //Random()클래스에는 ints(),longs(),doubles()와 같은 메소드 정의
        IntStream stream = new Random().ints(4);
        stream.forEach(System.out::println);
    }
}
