package array;
import java.util.Scanner;
public class secondsmallest {
    
    static int small(int[] arr){
         int min= arr[0];
        for(int i=0;i<arr.length;i++){
                if(arr[i]< min){
                    min =arr[i];
                }
             }
        return min;
    }
            static int secondsmall(int[] arr){
            int min = small( arr);
            int min2 = arr[0];
            for(int i=0;i<arr.length;i++){
                    if(arr[i]<min2 && arr[i]!=min){
                        min2=arr[i];
                    }
                }
                return min2;
            }
        
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(small(arr));
        System.out.println(secondsmall(arr));
        
    }
    
}
