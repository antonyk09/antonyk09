import java.util.Scanner;

public class linear_search_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Much element you want to enter");
       int n=sc.nextInt();
       int arr[]=new int[10];
       for(int i=0;i<n;i++){
        System.out.println("Enter "+i+" elements");
        arr[i]=sc.nextInt();
        }
        System.out.println("Entered elements are :");
        for(int i=0;i<n;i++)
        {
    System.out.println(arr[i]);
        }
    System.out.println("Enter the element You want to search:");
    int find=sc.nextInt(); 
    int i;
    for(i=0;i<n;i++){
        if(arr[i]==find){
            System.out.println("Element found at "+i+" position");
           break;
        }
    }
    if(i==n){
            System.out.println(find+" is Not found");
        }
    }
}
    

