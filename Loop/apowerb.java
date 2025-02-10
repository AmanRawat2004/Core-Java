import java.util.Scanner;

public class apowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int pro = 1;
        while(b>0){
            pro=pro*a;
            b--;
        }
        System.out.println("a power b is: "+pro);
    }
}
