package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>(
            Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6))
        );
        List<Integer> extractInnerList = list.stream().flatMap(x->x.stream()).toList();
        System.out.println(extractInnerList);
    }
}
