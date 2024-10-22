package practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Negative{
    public static void main(String[] args) {
        List<Integer> y = new ArrayList<>(Arrays.asList(-3,20,-1,8));
        List<Integer> x = y.stream().sorted().toList();
        System.out.println(x);
        
    }
}