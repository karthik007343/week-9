import java.util.*;

public class GenericBubble<T extends Comparable<T>> {
    public void BubbleSort(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (list.get(j).compareTo(list.get(j - 1)) < 0) {
                    Collections.swap(list, j - 1, j);
                }
            }
        }
        String result = String.join(", ", list.toString());
        System.out.println(result.substring(1, result.length() - 1));
    }

    public static void main(String args[]) {
        Integer[] a = {3, 15, 6, 11, 9};
        String[] s = {"g", "a", "y", "i", "i"};
        Double[] d = {0.555, 0.2, 0.47, 0.92, 0.27};
        GenericBubble<Integer> obj = new GenericBubble<>();
        GenericBubble<String> obj1 = new GenericBubble<>();
        GenericBubble<Double> obj2 = new GenericBubble<>();
        obj.BubbleSort(Arrays.asList(a));
        obj1.BubbleSort(Arrays.asList(s));
        obj2.BubbleSort(Arrays.asList(d));
    }
}
