import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter elements of an array");
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if (numbers[j] < numbers[i]){
                    int temp = numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=temp;
                }
                
            }
        }
        System.out.print("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println(" ");
        
        sc.close();
    }
}
