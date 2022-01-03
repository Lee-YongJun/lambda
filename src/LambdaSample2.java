public class LambdaSample2 {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("익명 내부클래스 실행");
        };
        r.run();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 내부 클래스 실행");
            }
        };
        r1.run();
    }
}
