//메소드의 인자로 람다식 전달
//함수형 인터페이스
@FunctionalInterface
interface  MyFunction4{
    int calc(int x, int y);
}
public class example4 {
    //메소드 정의(메소드의 인자로 람다식 전달)
    static void printMultiply(int x, int y, MyFunction4 f){
        System.out.println("실행결과:" + f.calc(x,y));
    }
    public example4() {
        printMultiply(100,100,(x,y) ->{return x *y;});
    }

    public static void main(String[] args) {
        new example4();
    }
}
