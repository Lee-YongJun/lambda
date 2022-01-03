class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        int[] arr3 = new int[n];

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i] | arr2[i];                        //or 연산
        }

        for (int i = 0; i < arr3.length; i++) {
            String temp = Integer.toBinaryString(arr3[i]);      //or연산한 수를 2진수로 변환
            if (temp.length() < n) {                            //주어진수에 비해 2진수변환수가 작을경우
                int jariNum = n - temp.length();
                for (int j = 0; j < jariNum; j++) {
                    temp = "0" + temp;
                }
            }
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }
        return answer;
    }
}