package array;

public class repeat {
    public static void main(String[] args) {
     //   int [] arr = new int[5];
        int arr[]= {2,3,3,3,5};
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]==arr[j])
                count+=1;
            }
        }System.out.println(count);
        
    }
    
}
