package practice;

import java.util.HashMap;

public class RepeatedChar {
    public static void main(String[] args) {
        HashMap<Character,Integer> x = new HashMap<>();
        String q = "apple";
        for (int i = 0; i < q.length(); i++) {
            x.put(q.charAt(i), null);
        }
        System.out.println(x);
    }
}
