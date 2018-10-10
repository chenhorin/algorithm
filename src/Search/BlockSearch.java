package Search;

public class BlockSearch {
    /**
     * 分块查找
     *
//     * @param index 索引表，其中放的是各块的最大值
     * @param st    顺序表，
     * @param key   要查找的值
     * @param m     顺序表中各块的长度相等，为m
     * @return
     */

    /*
    * 1.索引表怎么均分成块
    * 2.查找与排序都和数据结构紧密联系在了一起
    *
    * */
    public static int blockSearch(int[] st, int key, int m) {
        int[] index = new int[st.length / m];
        for (int i = 0; i < index.length; i++) {
            int index1 = index[i];
        }


        return 1;
    }

    public static void main(String[] args) {
        System.out.println(5/2);
    }

}

/*public class BlockSearch {
    public static void main(String[] args) {
        int[] index = new int[]{10, 20, 30};
        BlockSearch blockSearch = new BlockSearch(index);
        blockSearch.insert(-1);
        blockSearch.insert(10);
        blockSearch.insert(25);
        //blockSearch.insert(31);
        blockSearch.search(0);
        blockSearch.search(-1);
        blockSearch.search(10);
        blockSearch.search(25);
    }


    private int[] index;
    private ArrayList[] list;
    public BlockSearch(int[] index) {
        if (index != null && index.length != 0) {
            this.index = index;
            list = new ArrayList[index.length];
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList();
            }
        } else {
            throw new Error("index cannot be null or empty.");
        }
    }

    public void insert(int data) {
        int i = binarySearch(data);
        list[i].add(data);
    }

    public void search(int data) {
        int i = binarySearch(data);
        for (int j = 0; j < list[i].size(); j++) {
            if (data == (int) list[i].get(j)) {
                System.out.println(String.format("'%d' Position: [%d,%d]", data, i, j));
                return;
            }
        }
        System.out.println(String.format("'%d' Position: Not found", data));
    }

    private int binarySearch(int data) {
        if(data>index[index.length-1])
            throw new Error("out of block range");

        int start = 0;
        int end = index.length - 1;
        int mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (index[mid] > data) end = mid - 1;
            else
                //如果相等，也插入后面 <=index[start]
                start = mid + 1;
        }
        return start;
    }
}*/
