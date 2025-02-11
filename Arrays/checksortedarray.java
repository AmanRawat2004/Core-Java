public class checksortedarray {
    public static void main(String[] args){
        int[] arr = {5,4,3};
        String s="sorted";
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[i]){
                    s="not sorted";
                }
            }
        }

        System.out.println(s);
    }
}
