import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class streamSample9 {
    public static void main(String[] args) {
        //스트림 최종연산
        //Stream을 활용하여 1부터 100까지의 배열을 생성
        int [] numbers = IntStream.rangeClosed(1,100).toArray();

        //Stream을 활용하여 배열 출력
        //두개같음
        Arrays.stream(numbers).forEach( (s)-> System.out.println(s));
        Arrays.stream(numbers).forEach(System.out::println);

        List<String> list = Arrays.asList("용준","개발자");
        //오브젝트 객체에 list stream생성후 array로 변환
        Object[] results = list.stream().toArray();
        Arrays.stream(results).forEach((s)-> System.out.println(s));
    }
}
