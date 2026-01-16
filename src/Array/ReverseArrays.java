import java.util.Arrays;

public class ReverseArrays {
    int[] reverse(int[] arr){
        int len = arr.length;

        int i=0,j=len-1;
        for(i=0;i<j;i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        return arr;
    }

    public static void main(String [] args){
        int arrays[] = {99,98,1,2,3,4,5,6,7,8};
        ReverseArrays ab = new ReverseArrays();
        int [] aa=ab.reverse(arrays);
        for (int i = 0; i< aa.length;i++){
            System.out.println(aa[i]);
        }
    }
}
