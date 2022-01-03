import java.util.function.Supplier;

public class LambdaSample4 {
    public static void main(String[] args) {
        Runnable r = () ->{
            System.out.println("Runnable은 매개변수도 없으며 반환자료도 없다.");
        };
        r.run();


        Supplier <String> s = () ->{
            return "Supplier는 매개변수가 없으며 반환자료는 있다.";

        };
        System.out.println(s.get());
    }
}
