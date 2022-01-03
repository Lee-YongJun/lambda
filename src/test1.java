import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        System.out.println("평일 : " + Arrays.toString(Days1.getDefaultDay()));
        System.out.println("주말 : " + Arrays.toString(Days1.getHoliday()));
        System.out.println("한주 : " + Arrays.toString(Days1.getList()));
    }
}
@AllArgsConstructor
@Getter
enum Days1 {
    Monday(1, "월요일"),
    Tuesday(1, "화요일"),
    Wendsday(1, "수요일"),
    Thursday(1, "목요일"),
    Friday(1, "금요일"),
    Saturday(2, "토요일"),
    Sunday(2, "일요일");
    private int num;
    private String day;
    /**
     * 평일 가져오기
     *
     * @return
     */
    public static String[] getDefaultDay() {
        String[] arr1 = Arrays.stream(Days1.values()).filter(s -> s.getNum() == 1).map(Days1::getDay).toArray(String[]::new);
        return arr1;
    }
    /**
     * 주말 가져오기
     *
     * @return
     */
    public static String[] getHoliday() {
        String[] arr2 = Arrays.stream(Days1.values()).filter(s -> s.getNum() == 2).map(Days1::getDay).toArray(String[]::new);
        return arr2;
    }
    /**
     * 한주 가져오기
     *
     * @return
     */
    public static String[] getList() {
        String[] arr3 = Arrays.stream(Days1.values()).map(x->x.getDay()).toArray(String[]::new);
        return arr3;
    }
}


