public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 10, 9};
        int secondlargest = seclarge(arr);
        if(secondlargest == Integer.MIN_VALUE){
            System.out.println("not present");
        }else{
            System.out.println("Second largest number is: "+secondlargest);
        }
    }

    static int seclarge(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}

