import java.util.Scanner;

public class sumevenprododd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while(n>0){
            int num = n%10;
            if(num%2!=0){
                sum=sum+num;
                n/=10;
            }
            if(num%2==0){
                prod=prod*num;
                n/=10;
            }

        }
        System.out.println("Sum is: "+sum+" and Product is: "+prod);
    }
}
