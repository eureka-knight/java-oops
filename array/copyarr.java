package array;
import java.util.Arrays;
import java.util.Scanner;
public class copyarr {
    static int[] arr =new int[5];
    static void arrayprint(int []arr){
         for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        } System.out.println();
           System.out.println("hello it's me and i'm studying in godavari institute of engineering college and i'm in cse branch of it.");
        }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements");
        //  arr[2]=sc.nextInt();
       for(int i =0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
        // for(int i =0;i<arr.length;i++){
        //     System.out.println(arr[i]);
           
        // }
       int brr[]=Arrays.copyOfRange(arr, 2,4);// or brr[]=arr.clone() // deep copy or Arrays.copyof();
       arrayprint(brr);
        for(int i =0;i<arr.length;i++){
            brr[i]=sc.nextInt();
        } System.out.println("after change the value");
       arrayprint(brr);
        arrayprint(arr);



    }
    
}
