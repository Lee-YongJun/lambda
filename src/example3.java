//매개변수가 없는 람다식
//함수형인터페이스
@FunctionalInterface
interface  MyFunction3{
    void print();
}
public class example3 {
    public example3(){
        MyFunction3 fprint = () -> {
            System.out.println("Yoon's Dev");};
        fprint.print();
    }

    public static void main(String[] args) {
        new example3();
    }
}
