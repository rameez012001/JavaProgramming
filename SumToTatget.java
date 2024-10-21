package practice;

public class SumToTatget {
    public static void main(String[] args) {
        int[] myarray = {2,6,5,4,3,1,2};
        int target = 4;
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray.length; j++) {
                if(!(i==j)){
                    if(myarray[i]+myarray[j]==target){
                        System.out.println(myarray[i]+" : "+myarray[j]);
                    }
                }
            }
        }
    }
}