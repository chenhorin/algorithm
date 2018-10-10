package Sort_Basic;

public class InsertSort {
    public static void sort(Comparable[] arr) {
        /*
         * 我的思路
         * 1.比大小
         * 2.交换位置
         * 3.前面已经拿到的牌始终是正确的排序
         * */

        /*
         * 需要认识到后面往前去对比
         * 只要比前面小才循环
         * */
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                swap(arr, j, j - 1);
            }
        }

        // 写法1
//            for( int j = i ; j > 0 ; j -- )
//                if( arr[j].compareTo( arr[j-1] ) < 0 )
//                    swap( arr, j , j-1 );
//                else
//                    break;
    }

    private static void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("Sort_Basic.InsertSort", arr);
    }

    //  codingxiaxw int target = arr[i]那会有一点垃圾代码的样子
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        //这里首先要假设第一个数位置是正确的(arr[0]是第一张牌)；因为要往后移动数字，必须要假设第一个。然后将第二个数字arr[1]比作打扑克时拿到的第二张牌
        //i依旧控制需要将多少个数字进行排序(n个数字，n-1次排序，为啥？比如只有两个数字，你肯定只需要进行1次排序啊)
        for (int i = 1; i < arr.length; i++) {

            int j = i;//第一次循环时将第二个数字的下标赋给j
            int target = arr[j]; //第一次循环时将第二个数字赋值给target(即保留待插入元素)

            //第一次循环时如果第二个数字小于第一个数字，就将第一个数字后移(后面的循环中即将前面的数字都后移一位)
            while (j > 0 && arr[j] < arr[j - 1]) {
                arr[j] = arr[j - 1];
                //然后将第二个数字插入到第一个位置 (后面的循环中即将待插入数字插入到前面空出的地方)
                arr[j - 1] = target;
                j--;//将j － 1，继续调整
            }

        }

    }

}
