import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaSample10 {
    public static void main(String[] args) {
        String greeting = "Hello";

        Consumer<String> consumer = System.out::println;
        consumer.accept(greeting);

        greeting.toString();
        writeString(greeting::toString);
    }

    public static void writeString(Supplier<String> supplier){
        System.out.println(supplier.get());
    }
}
