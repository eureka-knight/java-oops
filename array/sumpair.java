package array;
import java.util.Scanner;
public class sumpair {
    static int arraytriplet(int[] arr,int target){
        int count=0;
         for(int i = 0;i<arr.length;i++){
            for(int j=1+i;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                if(target==arr[i]+arr[j]+arr[k]){
                    count +=1;
                }
            }


            }
           }
           return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target elements:");
        int target=sc.nextInt();
        System.out.println("enter the no. of elements:");

        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array:");
        for(int i = 0;i<arr.length;i++){
        arr[i]=sc.nextInt();

    }
     for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
     }
     System.out.println();
          
           System.out.println(arraytriplet(arr, target));


    }

    
}
