import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamTerminalOperation6 {
    public static void main(String[] args) {
        
        //collectors클래스의 partitioningBy() 메소드를 이용하여 해당 스트림의 각요소별 글자수에 따라 홀수와 짝수로 나누어 저장
        
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "PHP");

        Map<Boolean, List<String>> patition = stream.collect(Collectors.partitioningBy(s -> (s.length() % 2) == 0));
        
        //홀수
        
        List<String> oddLengthList = patition.get(false);

        System.out.println(oddLengthList);
        
        //짝수

        List<String> evenLengthList = patition.get(true);

        System.out.println(evenLengthList);
    }
}
