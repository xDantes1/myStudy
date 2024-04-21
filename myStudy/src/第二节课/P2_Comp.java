package 第二节课;

public class P2_Comp {

    public static void swap(int[] arr,int i ,int j){
        int tmp  = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;

    }

    public static  void selectSort(int[] arr){
        if(arr  == null || arr.length <2){
            return;
        }
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex  = i ;
            for (int j = i+1; j < N ; j++) {
                minValueIndex  = arr[j] <arr[minValueIndex] ?  j : minValueIndex;
            }
            swap(arr, i ,minValueIndex);
        }

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
    //初始结果验证的主方法
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 6, 7, 2, 4, 3, 1};
//        System.out.println("原始数组：");
//        printArray(arr);
//    }
    // ==========================================================================================

    public static  int[] lenRandomValuerRandom(int maxLen, int maxValue) {
        //返回一个数组叫arr ，arr长度[0,maxlen-1] ,arr中的每个值[0,maxValue]
        int len = (int) (Math.random()* maxLen);
        int [] ans = new int[len];
        for (int i = 0; i <len ; i++) {
            ans[i] = (int)(Math.random()*maxValue);
        }
        return ans;
    }

    public static int[] copyArrray(int[] arr){
        int []ans  = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
    //arr1 2 一定等长
    public static boolean isSorted(int[] arr){
        if(arr.length <2){
            return true;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max >arr[i]){
                return false;
            }
            max = Math.max(max,arr[i]);
        }
        return true;
    }

    //对照器的使用
    public static void main(String[] args) {
        int maxLen =5;
        int maxValue  = 10;
        int testTime = 400;
        for (int i = 0; i < testTime; i++) {
            int [] arr1 = lenRandomValuerRandom(maxLen,maxValue);
            int [] arr2 = copyArrray(arr1);
            insertionSort1(arr1);
            selectSort(arr2);

            if(!isSorted(arr1)){
                System.out.println("选择排序错误");
            }
    }
}
}
