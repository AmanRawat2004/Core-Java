import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int fact = 1;
        if(num==1){
            System.out.println(1);
        }else{
            while(num>1){
                fact=fact*num;
                num--;
            }
            System.out.println("Factorial of given number is: "+fact);
        }
    }
}
