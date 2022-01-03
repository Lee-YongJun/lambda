import java.util.stream.IntStream;

public class streamSample7 {
    public static void main(String[] args) {
        for(int i= 12 ;i<=18;i++){
            System.out.print(" " + i);
        }
        System.out.println();
        //range(시작값,포함되지않는 종료값)
        //rangeclose(시작값,종료값)이게더 직관적!
        IntStream.range(12,19).forEach(i->System.out.print(" " + i));
        System.out.println();
        IntStream.rangeClosed(12,18).forEach(i->System.out.print(" "+i));
    }
}
