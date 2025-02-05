import java.util.Scanner;

public class prodofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number is: ");
        int n = sc.nextInt();
        int prod = 1;
        while(n>0){
            prod = prod * (n%10);
            n=n/10;
        }
        System.out.println("Product of the number is: "+prod);
    }
}
