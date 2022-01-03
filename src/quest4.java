public class quest4 {
    public static void main(String[] args) {

        int[] num1 = {2, 5, 7};
        int[] num2 = new int[]{3, 8};

        int i, j = 0, s = 0;

        int len1 = num1.length;
        int len2 = num2.length;

        int len3[] = new int[len1 + len2];

        for (i = 0; i < len1 + len2; i++) {
            if (j == len1) {
                len3[i] = num2[s];
                s++;
            } else if (s == len2) {
                len3[i] = num1[j];
                j++;
            } else if (num1[j] > num2[s]) {
                len3[i] = num2[s];
                s++;
            } else if (num1[j] <= num2[s]) {
                len3[i] = num1[j];
                j++;
            }
        }
        if ((len1 + len2) % 2 != 0) {
            System.out.println("값 : " + (len3[(len1 + len2) / 2]));
        } else {
            System.out.println("값 : " + ((double)(len3[((len1 + len2) / 2) - 1] + len3[(len1 + len2) / 2]) / 2));
        }
    }
}
