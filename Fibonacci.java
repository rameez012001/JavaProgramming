package practice;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        Stream
        // (iterate(seedValue,seedValue->code))
        // here we are taking an array set seed to [0,1]
        // in the function we are creating a new array with the seed element
        // in the first iteration it will be[1,1]
        .iterate(new int[]{0,1}, myarray -> new int[]{myarray[1],myarray[0] + myarray[1]})
        // this limits the iteration or sets the iteration
        .limit(10)
        // here we are taking the first element of each new array
        // initally 0 [0,1]
        // 1 [1,1]
        // 2 [1,2]
        // 3 [2,3]
        // 4 [3,5]
        .map(x->x[0])
        // printing all the first elements
        .forEach(System.out::println);
    }
}