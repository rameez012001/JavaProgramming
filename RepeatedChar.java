package practice;

import java.util.HashSet;

public class RepeatedChar {
    static char check(String word){
        HashSet<Character> charset = new HashSet<>();
        for (int i = 0; i < word.length(); i++) { 
            char x = word.charAt(i);
            if(charset.contains(x)){
                return x;
            }else{
                charset.add(x);
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        String x = "ever";
        char getRepeatedCharacter = RepeatedChar.check(x);
        if(getRepeatedCharacter!='0'){
            System.out.println("First Repeated Character is: "+getRepeatedCharacter);
        }else{
            System.out.println("No repeated Value");
        }
    }
}
