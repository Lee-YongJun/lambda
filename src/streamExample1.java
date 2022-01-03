import java.util.stream.IntStream;

public class streamExample1 {
    public static void main(String[] args) {
        //지정된 범위의 연속된 정수에서 스트림 생성
        IntStream stream1 = IntStream.range(1,4);
        stream1.forEach(e -> System.out.print(e + ""));
        System.out.println();


        //range() 메소드는 명시된 시작 정수를 포함하지만, 명시된 마지막 정수는 포함하지 않는 스트림을 생성합니다.

        //rangeClosed() 메소드는 명시된 시작 정수뿐만 아니라 명시된 마지막 정수까지도 포함하는 스트림을 생성합니다.

        IntStream stream2 = IntStream.rangeClosed(1,4);
        stream2.forEach(e -> System.out.print(e + " "));
    }
}
