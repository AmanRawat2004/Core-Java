import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;
        int n=num;
        while(n>0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if(rev==num){
            System.out.println(rev+" is a pallindrome");
        }else{
            System.out.println(rev+" is not a pallindrome");
        }
    }
}
