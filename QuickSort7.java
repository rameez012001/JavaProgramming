package practice;

import java.util.ArrayList;
import java.util.Arrays;

class QuickSort{    
    ArrayList<Integer> sort(ArrayList<Integer> unsortedArray){
        if(unsortedArray.size()<=1){
            return unsortedArray;    
        }

        int pivotElement = unsortedArray.get(unsortedArray.size()/2);

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> middle = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < unsortedArray.size(); i++) {
            if(unsortedArray.get(i)==pivotElement){
                middle.add(unsortedArray.get(i));
            }else if(unsortedArray.get(i)<pivotElement){
                left.add(unsortedArray.get(i));
            }else{
                right.add(unsortedArray.get(i));
            }
        }

        ArrayList<Integer> sortedleft = sort(left);
        ArrayList<Integer> sortedRight = sort(right);
        middle.addAll(sortedRight);
        sortedleft.addAll(middle);
        return sortedleft;
    }

    void findDuplicate(ArrayList<Integer> sorted){
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < sort(sorted).size()-1; i++) {
            if(sort(sorted).get(i).equals(sort(sorted).get(i+1))){
                duplicates.add(sort(sorted).get(i));

                while(i < sort(sorted).size() && sort(sorted).get(i).equals(sort(sorted).get(i+1))){
                    i++;
                }
            }
        }
        System.out.println(duplicates);
    }
}
public class QuickSort7 {
    public static void main(String[] args) {
        QuickSort q1 = new QuickSort();
        ArrayList<Integer> i1 = new ArrayList<>(Arrays.asList(5,3,61,90,3,78,5));
        System.out.println(q1.sort(i1));
        q1.findDuplicate(q1.sort(i1));
    }    
}
