import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamSample3 {
    public static void main(String[] args) {
        DataObj[] data  = {
          new DataObj(1,"테스트"),new DataObj(2,"타노스"),new DataObj(3,"아이언맨")
        };
        Stream<DataObj> stm = Arrays.stream(data);
        stm.forEach(System.out::println);
        System.out.println("=========================");
        Arrays.stream(data).forEach(System.out::println);
    }
}

@Data
//모든 파라미터 받는 생성자생성
@AllArgsConstructor
class DataObj {
    int no;
    String name;
}
