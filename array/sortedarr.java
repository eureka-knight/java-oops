package array;
import java.util.Scanner;
public class sortedarr {
    static boolean issorted(int[] arr){
        boolean check =false;

       for(int i=1;i<arr.length;i++){
        if(arr[i]>=arr[i-1]){
        check =true;
        break;
        }
        
       }
       return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i <arr.length;i++){
            arr[i]=sc.nextInt();

        }
        issorted(arr);
        System.out.println(issorted(arr));
    }
    
    
}
