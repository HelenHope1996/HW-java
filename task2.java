import java.util.Arrays;
public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,2,3};
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] == 3){
                temp = arr[i];
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] != 3){
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            } 
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        System.out.println(Arrays.toString(arr));
        }
        }
}
