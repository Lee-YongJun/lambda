@FunctionalInterface
interface  Calc { //함수형 인터페이스의 선언
    public int min(int x, int y);
}

public class lambda1 {
    public static void main(String[] args) {
        Calc minNum = (x,y) ->x<y ? x:y;//추상메서드 구현
        System.out.println(minNum.min(3,4));//함수형 인터페이스 사용
    }
}
