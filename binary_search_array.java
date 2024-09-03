
import java.util.Scanner;

public class binary_search_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search:");
        int find = sc.nextInt();

        int left = 0, right = n - 1;
        boolean found = false;
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (arr[mid] == find) {
                System.out.println("Element found at position " + (mid + 1));
                found = true;
                break;
            } else if (arr[mid] < find) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}