import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamTerminalOperation5 {
    public static void main(String[] args) {
        //요소의 수집
        //1.스트림을 배열이나 컬렉션으로 변환 : toArray(),toCollection(),toList(),toSet(),toMap()
        //2.요소의 통계와 연산 메소드와 같은 동작을 수행 : counting(),maxBy(),minBy(),summingInt(),averageInt()등
        //3.요소의 소모와 같은 동작을 수행 : reducing(), joining()
        //4.요소의 그룹화와 분할 : groupingBy(),partitioningBy()

        Stream<String> stream = Stream.of("넷", "둘", "하나", "셋");

        List<String> list = stream.collect(Collectors.toList());

        Iterator<String> iter = list.iterator();

        while(iter.hasNext()) {

            System.out.print(iter.next() + " ");

        }
    }
}
