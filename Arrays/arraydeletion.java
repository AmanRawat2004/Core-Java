import javax.xml.transform.Source;
import java.util.Arrays;

public class arraydeletion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index=2;
        int j=0;
        int[] newarr = new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(i!=index) {
                newarr[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
