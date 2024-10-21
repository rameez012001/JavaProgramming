package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindElement2 {
    static boolean ifAllPresent(List<Integer> x, List<Integer> y){
        if(x.containsAll(y)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>(Arrays.asList(6,3,4,2,1,7));
        List<Integer> a2 = new ArrayList<>(Arrays.asList(3,2,4,7));
        if(FindElement2.ifAllPresent(a1, a2)){
            System.out.println("All A2 elements are present in A1");
        }else{
            System.out.println("Some or No element of a2 present in a1");
        }
    }
}
