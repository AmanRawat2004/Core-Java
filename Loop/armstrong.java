import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int org=n;
        int z=n;
        int count = 0;
        int sum=0;
        while(z>0){
            count++;
            z/=10;
        }
        z=n;
        while (z>0){
            int digit=z%10;

            int prod =1;
            for (int i =1;i<=count;i++){
                prod*=digit;


            }

            sum=sum+prod;
            z/=10;

        }if (sum == org) {
            System.out.println(org + " is an Armstrong number.");
        } else {
            System.out.println(org + " is not an Armstrong number.");
        }

    }
}
