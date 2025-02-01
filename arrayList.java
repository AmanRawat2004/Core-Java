import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            al.add(num);
        }
        System.out.println(al+" "+al.get(1));
    }
}
