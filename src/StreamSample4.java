import java.util.Arrays;
import java.util.stream.Stream;

public class StreamSample4 {
    public static void main(String[] args) {
        String[] str1 = {"테스트","판다","egs"};
        String[] str2 = {"coder","컴퓨터","개발자"};

        Stream<String[]> strm1 = Stream.of(str1,str2);
        System.out.println("** Stream.of(str1,str2)");
        Stream.of(str1,str2).forEach(x-> System.out.println(Arrays.deepToString(x)));
        System.out.println("** strm1.flatMap(Arrays::sstream");

        strm1.flatMap(Arrays::stream).forEach(System.out::println);
    }
}
