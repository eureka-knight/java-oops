package array;
import java.util.Scanner;
import java.util.Arrays;
public class reversearray {
    static int[] reverse(int[] arr){
        for(int i=0;i<(arr.length)/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp;
        }
     return arr;   
    }
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(reverse(arr)));
    }

    
}
