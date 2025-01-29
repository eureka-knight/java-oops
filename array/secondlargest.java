package array;
import java.util.Scanner;
public class secondlargest { 
    
    static int findmax(int[] arr){
         int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
           
        }

        return mx;

    }
    static int findsecondmax(int[] arr){
        int mx =findmax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int findsecondmax=findmax(arr);
        return findsecondmax;


    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    int[] arr= new int[5];
    System.out.println("enter array");
    for(int i =0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    findmax(arr);
    System.out.println(findmax(arr));
    System.out.println(findsecondmax(arr));
    
        
    

  }  
    
}
