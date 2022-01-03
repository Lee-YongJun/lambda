import java.util.Scanner;
import java.util.function.Predicate;

public class LambdaSample6 {
    public static void main(String[] args) {
        Predicate<Integer> isOdd = (s) ->(s % 2) == 1;
        Predicate<Integer> isEven = Predicate.not(isOdd);
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수를 입력하세요:");
        sc.hasNextInt();
        int num = sc.nextInt();
        if(isOdd.test(num)){
            System.out.println("홀수를 입력하셨습니다.");
        }else if(isEven.test(num)){
            System.out.println("짝수를 입력하셨습니다.");
        }
        System.out.println(isOdd.test(sc.nextInt()));
    }
}
