public class LambdaSample1 {
    public static void main(String[] args) {
        //람다식사용
        Sample01Function f = () -> {
            System.out.println("샘플01테스트 출력");
            System.out.println("샘플02테스트 출력");
        };

        f.test();

//        Sample02Function f2 = (a) -> a;
//        System.out.println(f2.test("샘플02테스트출력"));
        //익명내부클래스
//        Sample01Function f2 = new Sample01Function() {
//            @Override
//            public void test() {
//                System.out.println("샘플01테스트 출력");
//            }
//        };
//        f2.test();
    }
}
@FunctionalInterface
interface Sample01Function{
    //인터페이스에서는 추상메서드 있고 이부분 생략
    public abstract void test();
    //두개의 추상메서드가 들어갈 수 없다.
    //public abstract String run();
}
@FunctionalInterface
interface Sample02Function{
    //인터페이스에서는 추상메서드 있고 이부분 생략
    public abstract void test(String a);
    //두개의 추상메서드가 들어갈 수 없다.
    //public abstract String run();
}
