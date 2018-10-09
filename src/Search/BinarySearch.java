package Search;

public class BinarySearch {
    /**
     * 二分查找又称折半查找，它是一种效率较高的查找方法。 【二分查找要求】：1.必须采用顺序存储结构 2.必须按关键字大小有序排列。
     *
     * @param array     有序数组 *
     * @param searchKey 查找元素 *
     * @return searchKey的数组下标，没找到返回-1
     */

    /*
    * 1.high = mid;
    * */
    public static int binarySearch(int searchKey, int[] array) {
        int high = array.length - 1;
        int low = 0;
        while (high != low) {
            int mid = (low + high) / 2;
            if (array[mid] ==searchKey){
                return mid;
            } else if (array[mid] > searchKey) {
                high = mid + 1;
            } else {
                low = mid + 1;
            }
        }
        throw new IllegalArgumentException("no contains this key");
    }
}
