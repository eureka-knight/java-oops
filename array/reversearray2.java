package array;
import java.util.Arrays;
import java.util.Scanner;
public class reversearray2 {
       
    static int[] reverse2(int[] arr, int n){
        // int temp=-1;
         int[] brr= new int[n];
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr.length-i-1;j<arr.length;j++){
               brr[j]=arr[i];
                // temp=arr[i];
                // arr[i]=brr[j];
                // brr[j]=temp;
                
                // else
                // return brr;
            }
        }
        return brr;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr= new int[n];
       
        System.out.println("enter elements");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(reverse2(arr,n)));
    }
    
}
