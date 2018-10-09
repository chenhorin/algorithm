package Search;


public class OrderSearch {

    /**顺序查找平均时间复杂度 O（n）
     * @param searchKey 要查找的值
     * @param array 数组（从这个数组中查找）
     * @return  查找结果（数组的下标位置）
     */
    public static int orderSearch(int searchKey,int [] array) {
        /*1.public static int orderSearch(int num,int [] target0)
        * 2.array.length <= 0
        * 3.
        *
        *
        *
        * */
        if (array == null || array.length <= 0) {
            throw new IllegalArgumentException("array empty or null");
        }
        for (int i = 0; i < array.length; i++) {
            if (searchKey == array[i])
                return i;
        }
        throw new IllegalArgumentException("index not exist");
    }
}
