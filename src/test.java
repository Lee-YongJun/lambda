import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        System.out.println("평일" + Arrays.toString(Days.getDefaultDay()));
        System.out.println("주말" + Arrays.toString(Days.getHoliday()));
        System.out.println("한주" + Arrays.toString(Days.getList()));
    }
}

@AllArgsConstructor
@Getter
enum Days {

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

        int countDefaultDay = 0;

        for (Days days : Days.values()) {
            if (days.getNum() == 1) {
                countDefaultDay++;
            }
        }

        System.out.println(Arrays.stream(Days.values()).collect(Collectors.groupingBy(s->s.getNum(),Collectors.counting())).get(1));
        System.out.println(Arrays.stream(Days.values()).collect(Collectors.groupingBy(s->s.getDay(),Collectors.toList())));
        Long count = Arrays.stream(Days.values()).collect(Collectors.groupingBy(s->s.getNum(),Collectors.counting())).get(1);
        String[] arr = new String[java.lang.Math.toIntExact(count)];

        int i = 0;

        for (Days days : Days.values()) {
            if (days.getNum() == 1) {
                arr[i++] = days.getDay();
            }
        }
        return arr;
    }

    public int getNum() {
        return num;
    }

    /**
     * 주말 가져오기
     *
     * @return
     */
    public static String[] getHoliday() {

        int countHoliday = 0;
        for (Days days : Days.values()) {
            if (days.getNum() == 2) {
                countHoliday++;
            }
        }

        String[] arr2 = new String[countHoliday];

        int i = 0;

        for (Days days : Days.values()) {
            if (days.getNum() == 2) {
                arr2[i++] = days.getDay();
            }
        }
        return arr2;
    }

    /**
     * 한주 가져오기
     *
     * @return
     */
    public static String[] getList() {
        String[] arr3 = new String[Days.values().length];
        int i = 0;
        for (Days days : Days.values()) {
            arr3[i++] = days.getDay();
        }
        return arr3;
    }
}

