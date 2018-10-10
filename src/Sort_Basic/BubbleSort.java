package Sort_Basic;

public class BubbleSort {
    /*
    * 1. public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - j - 1; j++) {
                if (arr[j] > arr[j + 1]) {
//                    swap(arr[j],arr[j+1]);
                    swap(arr,j + 1, j);
                }
            }
        }
       }
       2.j < arr.length - j - 1;
       3.swap(arr[j],arr[j+1]);
    * */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
//                    swap(arr[j],arr[j+1]);
                    swap(arr, j + 1, j);
                }
            }

        }
    }


    private static void swap(int i, int j) {
        int tem = i;
        i = j;
        j = tem;
    }

    //交换两个数字的位置
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
