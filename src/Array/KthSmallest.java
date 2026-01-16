import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;

        KthSmallest call = new KthSmallest();
        System.out.println(call.kthSmallest(arr,k));
    }
    int kthSmallest(int []num, int k){
        int n = num.length;
        Arrays.sort(num);
        return num[k-1];
    }
}
