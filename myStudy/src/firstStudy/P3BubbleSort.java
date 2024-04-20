package firstStudy;

public class P3BubbleSort {
    public static void swap(int[] arr ,int i ,int j){
        int tmp = arr[j];
        arr[j]  = arr[i];
        arr[i] = tmp;

    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void BubbleSort(int [] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //0~n-1
        //0~n-2
        int N = arr.length;
        for (int end  = N - 1; end >= 0 ; end--) {
            //在一位置和零位置交换
            
            for (int i = 1; i <= end ; i++) {
                if(arr[i-1] > arr[i]){
                    swap(arr,i-1,i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,3,2,5,7,4};
        printArray(arr);
        BubbleSort(arr);
        printArray(arr);
    }
}
