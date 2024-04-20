package firstStudy;

public class P4InsertionSort {
    public  static void swap(int []arr , int i ,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        //j在后面 交换前面i的值

    }
    public  static void insertionSort1(int []arr){
        if(arr == null || arr.length < 2){
            return;
        }
        int N  = arr.length;

        for (int end = 1; end < N; end++) {
            int newNumIndex = end;
            while ( newNumIndex - 1 >= 0 && arr[newNumIndex-1] >arr[newNumIndex]) {
                swap(arr, newNumIndex-1, newNumIndex);
                newNumIndex--;
            }
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 2, 4, 3, 1};
        System.out.println("原始数组：");
        printArray(arr);

        insertionSort2(arr);
        System.out.println("排序后数组：");
        printArray(arr);

        System.out.println("原始数组：");
        printArray(arr);

        insertionSort1(arr);
        System.out.println("排序后数组：");
        printArray(arr);
    }



    public static void insertionSort2(int []arr){
        if(arr == null || arr.length < 2){
            return;
        }
        int N =  arr.length;
        for (int end = 1 ;end <N; end++){
            for(int pre = end -1 ;pre >=0 && arr[pre] >= arr[pre+1]; pre-- ){
                swap(arr, pre, pre+1);

            }
        }

    }
}

