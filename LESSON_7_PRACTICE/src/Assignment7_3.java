import java.util.Arrays;
import java.util.LinkedList;

public class Assignment7_3 {

    public class MergeList {
        public LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {

            LinkedList<Integer> list3 = new LinkedList<>();

            if (list1.isEmpty()) return new LinkedList<>(list2);
            if (list2.isEmpty()) return new LinkedList<>(list1);

            int firstOne = list1.getFirst();
            int firstTwo = list2.getFirst();

            if (firstOne < firstTwo) {
                list3.add(list1.removeFirst());
            } else {
                list3.add(list2.removeFirst());
            }
            list3.addAll(merge(list1, list2));
            return list3;
        }


    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(2, 5, 8, 11));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 6));

        Assignment7_3 outer = new Assignment7_3();
        MergeList ml = outer.new MergeList();
        System.out.println(ml.merge(list1, list2));

/*
        Use the following recursive strategy:
        output: [1,2,3,5,6, 8, 11]
*/


    }
}
