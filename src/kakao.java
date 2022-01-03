import java.util.Arrays;

public class kakao {
    public static void main(String[] args) {
//        int n =5;
//        int [] arr1 = {9, 20, 28, 18, 11};
//        int [] arr2 = {30, 1, 21, 17, 28};

        int n = 6;
        int [] arr1 = {46, 33, 33 ,22, 31, 50};
        int [] arr2 = {27 ,56, 19, 14, 14, 10};

        int[] map = new int[n];                                 //arr1와 arr2를 합친 맵
        String[] answer = new String[n];

        for(int i = 0 ; i < n; i++) {
            map[i] = arr1[i] | arr2[i];                         //or 연산
            System.out.println("데이터확인3:"+map[i]);
        }

        for(int i = 0 ; i < map.length; i++) {
            String temp = Integer.toBinaryString(map[i]);       //or연산한 수를 이진수로 반환.
            System.out.println("데이터 체크:"+temp);
            if(temp.length() < n) {                             //자리수가 꽉 차지 않는다면
                int jari = n - temp.length();
                System.out.println("길이값"+temp.length());
                System.out.println("자리수:"+jari);
                for(int j =0 ; j < jari; j++) {                //차이가 나는 만큼 앞에 0을 붙혀줌.
                    temp = "0"+temp;
                    System.out.println("temp값"+temp);
                }
            }
            temp = temp.replaceAll("1", "#");  //1은 #으로 0은 공백으로
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }
        System.out.println(Arrays.toString(answer));
    }
}
