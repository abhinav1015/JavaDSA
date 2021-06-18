import java.util.Scanner;
public class LinearSearch{
    public static void LinSer(int key, int numbers[], int n){
        boolean ans = false;
        for(int i=0; i<n;i++){
            if(numbers[i] == key){
                ans = true;
            }
        }
        if(ans){
            System.out.println(key + " is found.");
        }else{
            System.out.println(key + "is not founded in this array");
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        LinSer(key, numbers, n);
        sc.close();
    }
}