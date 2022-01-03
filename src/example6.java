public class example6 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Welcome Heejin blog");
            }
        }).start();
        //람다사용
        new Thread(()->{
            System.out.println("Welcome Heejin blog");
        }).start();

    }

}
