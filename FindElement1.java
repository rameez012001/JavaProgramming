package practice;

public class FindElement1 {
    static void findElement(int[] a1, int[] a2){
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if(a1[i]==a2[j]){
                    System.out.println(a1[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a1 = {7,6,3,4};
        int[] a2 = {4,3,6,7,8,9,6};
        FindElement1.findElement(a1, a2);
    }
}
