import java.util.*;
class FunctionsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        int totalsum;
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=(sum*10)+arr[i];
        }
        System.out.println("The Sum is: " + sum);
        totalsum=sum+k;
        System.out.println("The total sum is: " + totalsum);
        
    }
}