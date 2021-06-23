import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=1;i<n;i++){
            int current = numbers[i];
            int j = i-1;
            while(j>=0 && numbers[j]>current  ){
                numbers[j+1]=numbers[j];
                j--;
            }
            numbers[j+1] = current;
        }
        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(numbers[i] + "   \n");
        }
        sc.close();
    }
    
}
