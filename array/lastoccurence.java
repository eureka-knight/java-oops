package array;
import java.util.Scanner;

public class lastoccurence {
    int[] arr= new int[5];
    int x;
    int index = -1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        lastoccurence obj = new lastoccurence();
        System.out.println("enter the array");
        for(int i=0;i<obj.arr.length;i++){
        obj.arr[i]=sc.nextInt();
    }
    System.out.println("enter the search value");
    obj.x=sc.nextInt();
    for(int i=0;i<obj.arr.length;i++){
        if(obj.arr[i]==obj.x)
        obj.index=i;
       
    }
     System.out.println("found at index " + obj.index);
    }
    

}
