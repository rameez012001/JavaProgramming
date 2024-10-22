package practice;
import java.util.*;
public class Subarray {
    static int max(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        List<Integer> y = new ArrayList<>(Arrays.asList(7,9,0,5,-4,4,3,9,1,-1));
        List<Integer> z = new ArrayList<>();
        z.add(y.get(0));
        for (int i = 0; i < y.size()-1; i++) {
            z.add(z.get(i)+y.get(i+1));
        }
        List<Integer> sorted = z.stream().sorted().toList();
        System.out.println("Maximum number of the sub array is:"+ sorted.get(sorted.size()-1));
    }
}
