package firstStudy;

public class P1 {
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

    }
}