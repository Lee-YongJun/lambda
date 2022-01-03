import java.util.stream.Stream;

public class streamSample6 {
    public static void main(String[] args) {
        String[] arrstr = null;
        //Stream<String> stream = Stream.of(arrstr);
        //위에처럼 이렇게 하면 null이 들어온다.

        //null체크
        if (arrstr == null || arrstr.length == 0) {
            Stream<Object> stream = Stream.of(arrstr == null ? Stream.empty() : arrstr);
        }

        //그래서 반환형 object로 반환을 해주어야된다.
        Stream<Object> stream = Stream.of(arrstr == null ? Stream.empty() : arrstr);
    }
}
