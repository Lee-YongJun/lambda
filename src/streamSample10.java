import java.util.Arrays;
import java.util.stream.Stream;

public class streamSample10 {
    public static void main(String[] args) {
        Stream.of("뱅형","타노스","용준")
                .forEach(name -> System.out.printf("%s",name));
        System.out.println();
        Arrays.asList("뱅형1","타노스1","용준1")
                .stream()
                .forEach(name -> System.out.printf("%s",name));
    }
}
