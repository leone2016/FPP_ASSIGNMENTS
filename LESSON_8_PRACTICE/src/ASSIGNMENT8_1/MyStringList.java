package ASSIGNMENT8_1;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    public void minSort() {
        for (int i = 0; i < size - 1; i++) {
            int nextMinPos = minpos(i, size - 1);
            swap(i, nextMinPos);
        }
    }

    void swap(int i, int j) {
        String tmp = strArray[i];
        strArray[i] = strArray[j];
        strArray[j] = tmp;
    }

    //find minimum of arr between the indices bottom and top
    public int minpos(int bottom, int top) {
        if (bottom < 0 || top >= size || bottom > top) return -1;

        int minPos = bottom;
        for (int i = bottom + 1; i <= top; i++) {
            if (strArray[i].compareTo(strArray[minPos]) < 0) {
                minPos = i;
            }
        }
        return minPos;
    }

    //search a sorted array
    boolean binSearchIt(String val) {
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = strArray[mid].compareTo(val);
            if (cmp == 0) return true;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public void add(String s) {
        if (size == strArray.length) resize();
        strArray[size++] = s;
    }

    private void resize() {
        System.out.println("resizing");
        int len = strArray.length;
        int newlen = 2 * len;
        String[] temp = new String[newlen];
        System.arraycopy(strArray, 0, temp, 0, len);
        strArray = temp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(strArray[i]).append(", ");
        }
        sb.append(strArray[size - 1]).append("]");
        return sb.toString();
    }


    public static void main(String[] args) {
        String[] testArr = {"big", "small", "tall", "short", "round", "square", "enormous", "tiny", "gargantuan",
                "lilliputian", "numberless", "none", "vast", "miniscule"};
        MyStringList list = new MyStringList();
        for (String s : testArr) {
            list.add(s);
        }
        list.minSort();
        System.out.println("The list in sorted order:");
        System.out.println(list.toString());
        System.out.println();
        System.out.println("\"number\" is in the list? " + list.binSearchIt("number")); //false
        System.out.println("\"tiny\" is in the list? " + list.binSearchIt("tiny")); //true
    }

}
