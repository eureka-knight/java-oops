package array;
import java.util.Scanner;
public class arrinput {
    static int []arr;

     static void fun(int n){
    
    arr = new int[n];
   }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        arrinput obj= new arrinput();
         fun(5);
        
        System.out.println("enter the array elements");
        for(int i = 0;i<obj.arr.length;i++){
            obj.arr[i]=sc.nextInt();
        }
        for(int j=0;j<obj.arr.length;j++){
           System.out.print (obj. arr[j] + " ");

        }
    }
 
}
