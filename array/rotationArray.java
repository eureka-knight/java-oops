package array;
import java.util.Arrays;
import java.util.Scanner;
public class rotationArray {
    static int[] rotation(int [] arr){
        Scanner sc =new Scanner(System.in);
        int k = sc.nextInt();
        int n = arr.length;
        k=k%n;
        for(int i=0;i<=k;i++){
            arr[i]=arr[arr.length-1];
            break;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(rotation(arr)));
    }
    
}
