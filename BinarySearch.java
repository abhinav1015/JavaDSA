import java.util.Scanner;
public class BinarySearch {
    public static int binser(int key, int n, int numbers[]){
        int s=0;
        int e=n;

        while(s<=e){
            int mid = (s+e)/2;
            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] > key){
                e =mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of and array");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n;i++){
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter the key of array");
        int key = sc.nextInt();
        System.out.println("Found in inded " +binser(key, n, numbers));
        sc.close();
    }
}
