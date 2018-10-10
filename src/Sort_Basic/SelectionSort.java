package Sort_Basic;

public class SelectionSort {

    /*
    * 需要找除第一个索引外最小的值进行交换,而不仅仅是比第一个索引小就交换
    * 1.当调成这样子时就为正确,for (int j = i + 1; j < arr.length; j++)
    *   i最大为索引-1 j+1所以最大不超高arr.length
    * 2.考虑最大的索引问题,i < arr.length 最大差长度2,但是后面还是限制了,并没有越界
    * 3.考虑是否重复调用arr.length
    * 4.考虑是否重复交换对象
    * 5.考虑是否当第一个索引已经为最小值的时候才需要交换
    * 6.所以夏的代码是最优
    * */
    public static void selectionSort(int[] arr) {
        if (arr.length == 0 || arr == null) {
            throw new IllegalArgumentException("arr empty or null");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr,i,j);
                }
            }
        }
    }
//    参考codingxiaxw
    /*public static void selectSort(int[] arr) {
        if(arr == null || arr.length == 0)
            return ;
        //
        int minIndex = 0;
        for(int i=0; i<arr.length-1; i++) { //只需要比较n-1次
            //将数组中的第一个数arr[i]即arr[minIndex]作为基准，遍历其后面所有的数字，只要出现比这个数小的，那么就记下这个数的下标并赋给minIndex，遍历完后若该minIndex不等于i，说明找到了最小的值，就将这个数字下标为minIndex的值与基准数字交换之。
            minIndex = i;
            for(int j=i+1; j<arr.length; j++) { //从i+1开始比较，因为minIndex默认为i了，i就没必要比了。
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if(minIndex != i) { //如果minIndex不为i，说明找到了更小的值，交换之。
                swap(arr, i, minIndex);
            }
        }

    }*/

//    bobo
    /*public static void sort(int[] arr){

        int n = arr.length;
        for( int i = 0 ; i < n ; i ++ ){
            // 寻找[i, n)区间里的最小值的索引
            int minIndex = i;
            for( int j = i + 1 ; j < n ; j ++ )
                if( arr[j] < arr[minIndex] )
                    minIndex = j;

            swap( arr , i , minIndex);
        }
    }*/

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 0, 5, 4, 3, 2, 1};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
