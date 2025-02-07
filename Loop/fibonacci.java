import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int first = 0;
        int second = 1;
        int count = 0;
        System.out.print("Fibonacci series: ");
        while(count<n){
            System.out.print(first+" ");
            int next = first+second;
            first=second;
            second=next;
            count++;
        }
    }
}
