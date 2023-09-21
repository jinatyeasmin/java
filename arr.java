import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int brr[]=new int[arr.length];
        for(int i=0;i<size;i++){
            System.out.print("Enter the value of array:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            brr[i]=arr[i];
        }
        System.out.println("enter the copy of array");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(brr[i]);
        }
    }
}
