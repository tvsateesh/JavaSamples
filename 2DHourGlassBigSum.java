import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/2d-array
public class 2DHourGlassBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int sum =Integer.MIN_VALUE; ;
        for(int arr_i=0; arr_i <= 3; arr_i++){
            for(int arr_j=0; arr_j <= 3; arr_j++){
                //00,01,02
                //11
                //10,11,12                
                int currentSum = arr[arr_i][arr_j] +  arr[arr_i][arr_j+1]+  arr[arr_i][arr_j+2] + arr[arr_i+1][arr_j+1] +
                    arr[arr_i+2][arr_j] +  arr[arr_i+2][arr_j+1]+  arr[arr_i+2][arr_j+2];
                if ( currentSum > sum ) {
                    sum = currentSum;
                }
            }
            
        }
        System.out.println(sum);
    }
}
