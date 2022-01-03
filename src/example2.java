//인자 x를 받아들여 제곱을 리턴하는 람다식 만들기
@FunctionalInterface
interface Myfunction2{
    int calc(int x);
}
public class example2 {
    public example2(){
        Myfunction2 fsquare = (x) -> {return x*x;};
        System.out.println("fsquare의 결과:" +fsquare.calc(5));
    }

    public static void main(String[] args) {
        new example2();
    }
}
