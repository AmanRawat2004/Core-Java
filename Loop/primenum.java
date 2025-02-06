import java.util.Scanner;

public class primenum {
    public static boolean primeno(int n){
        if(n<2) return false;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if(primeno(n)){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }
    }

}
