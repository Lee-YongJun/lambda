import java.util.function.Function;

public class LambdaSample9 {
    public static void main(String[] args) {
        //스태틱을 이용한 메서드 참조
        Function<String,String> helloLambda = (name) -> HelloTo.hello(name);

        System.out.println(helloLambda.apply("하이"));

        Function<String,String> helloStatic = HelloTo::hello;

        System.out.println(helloLambda.apply("파티쉐"));

    }
}
class HelloTo{
    public static String hello(String name){
        return "Hello~" + name;
    }
}