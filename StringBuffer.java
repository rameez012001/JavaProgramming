package practice;
import java.util.*;
public class StringBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name to reverse: ");
        String name = scanner.nextLine();
        String reverseName = "";
        for (int i = name.length()-1; i >=0; i--) {
            reverseName+=name.charAt(i);
        }
        System.out.println(reverseName);
        scanner.close();
    }
}
