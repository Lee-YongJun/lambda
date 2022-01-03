import java.util.Arrays;
import java.util.stream.Stream;

public class streamIntermediateOperation2 {
    public static void main(String[] args) {
        //여러 문자열이 저장된 배열을 각 문자열에 포함된 단어로 이루어진 스트림으로 변환하는 예제입니다.
        String [] arr = {"I study hard", "You study JAVA" ,"I am hungry"};
        Stream<String> stream = Arrays.stream(arr);
        stream.flatMap(s -> Stream.of(s.split(" "))).forEach(System.out::println);
    }
}
