import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.function.Supplier;

public class LambdaSample13 {
    public static void main(String[] args) {
//        Person p = new Person(1,"테스트");
//        (a,b) -> new Person(a,b);
//        Person :: new;
        Supplier<Name> supplier1 = () -> new Name();
        Name name1 = supplier1.get();
        //Name name1 = new Name();
        System.out.println("람다식" + name1.getName());

        Supplier<Name> supplier2 = () -> new Name();
        Name name2 = supplier2.get();
        System.out.println("생성자"+name2.getName());
    }
}
@Getter
@NoArgsConstructor
class Name{
    private String name  = "테스트";
}
