//제네릭을 이요한 함수형 인터페이스
@FunctionalInterface
interface MyFunction5<T>{
    void println(T x);
}
public class example5 {
    public example5(){
        MyFunction5<String> f1 = x -> {System.out.println(x.toString());};
        f1.println("String Generic 사용 람다식");
        f1.println("Yoon's Dev");

        MyFunction5<Integer> f2 = x ->{
            System.out.println(x.toString());
        };
        f2.println(Integer.valueOf(100));

    }

    public static void main(String[] args) {
        new example5();
    }
}
