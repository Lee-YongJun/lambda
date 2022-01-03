import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;

public class LambdaSample12 {
    public static void main(String[] args) {
        var list = Arrays.asList(
                new Person(1,"테스트"),
                new Person(2,"상도"),
                new Person(3,"인호"),
                new Person(4,"학건")
        );
        System.out.println("==람다식");

        list.forEach(x-> x.toObjString());
        System.out.println("메서드 참조");
        list.forEach(Person :: toObjString);

    }
}

@Data
@AllArgsConstructor
class Person{

    private Integer no;
    private String name;

    public void toObjString(){
        System.out.println("no"+no+"name"+name);
    }
}
