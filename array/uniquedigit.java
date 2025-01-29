package array;
import java.util.Scanner;
public class uniquedigit {
    static int unique(int[] arr){
        for(int i=0;i<arr.length;i++){
             int count = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    count+=1;
                }
            }
            if (count == 0) {
                return arr[i];
            }
         }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int result = unique(arr);
        if (result == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Unique Number: "+result);
        }
    }
    
}
