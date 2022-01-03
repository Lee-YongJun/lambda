import java.util.Arrays;

public class StreamSample1 {
    public static void main(String[] args) {
        var list = Arrays.asList(1,2,3,2,1,5);
        System.out.println(list);
        System.out.println("============================================");
        //중복제거
        list.stream().distinct().forEach(System.out::println);
    }
}
