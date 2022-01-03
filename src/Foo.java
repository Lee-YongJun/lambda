import java.util.function.*;

public class Foo {
    public static void main(String[] args) {
        //익명클래스
//        RunSomething runSomething1 = new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("Hello");
//            }
//        };
        //이걸 대체해서 java 8부터 바뀌어져 나옴.
//        RunSomething runSomething = () -> System.out.println("Hello");
//        runSomething.doIt();




        //compose 인터페이스 2>인터페이스1
        //andthen 인터페이스 1>인터페이스2

//function<T,R> 매개변수0,return 0
        Function<Integer, Integer> plus10 = (i) -> {
            return i + 10;
        };
        Function<Integer, Integer> multiply2 = (i) -> {
            return i * 2;
        };
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);

        plus10.andThen(multiply2);

        System.out.println(plus10.andThen(multiply2).apply(2));

        System.out.println(multiply2AndPlus10.apply(2));

//consumer<T> 매개변수0 return x
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

//supplier 매개변수 x return 0
        Supplier<Integer> get10 = () -> 190;
        System.out.println(get10.get());

//predicate 매개변수 0 true false 반환
        Predicate<String> startWithYJ = (s) -> s.startsWith("yj");
        Predicate<String> startWithYJ1 = (s) -> s.startsWith("lj");

        System.out.println(startWithYJ.negate().test("YJ"));
        System.out.println(startWithYJ.or(startWithYJ1).test("yj"));
        System.out.println(startWithYJ.and(startWithYJ1).test("YJ"));
//        System.out.println(startWithYJ.or());
//        System.out.println(startWithYJ.and());

//입력값과 결과값이 같을경우 unaryOperater사용가능
        UnaryOperator<Integer> unaryOperator1 = (i) ->i + 10;
        Integer result = unaryOperator1.apply(10);
        System.out.println(result);
        UnaryOperator<Boolean> unaryOperator2 = (j) -> !j;
        boolean result2 = unaryOperator2.apply(true);
        System.out.println(unaryOperator2.apply(result2));

//BinaryOperator(값을 두개받아 하나 리턴)
    }
}

